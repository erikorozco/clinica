
package backend;

import administracion.SetGetTer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class administracionDAO {
    private String url = "jdbc:postgresql://127.0.0.1/Aplicacion";
    private String sql;
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;
    private void conectar() throws ClassNotFoundException, SQLException{//public class recepcionDAO {

        Class.forName("org.postgresql.Driver");
        this.con = DriverManager.getConnection(this.url, "postgres", "$@Lud1n73gral");
        this.pstm = con.prepareStatement(this.sql);
    }
private void cerrarConexion(){//cerrar conexion de las base de datos
        try{
            if(rs != null) rs.close();
            if(pstm != null) pstm.close();
            if(con != null) con.close();
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    public  int guardarTerapeuta(Collection<SetGetTer>  terapeuta){//guarda una nuevo terapeuta
        try{
         this.sql="INSERT INTO terapeuta(\n" +
        "            especialidad, nombret, apellidopt, apellidomt, \n" +
        "            telefono)\n" +
        "    VALUES ( ?, ?, ?, ?, \n" +
        "            ?) RETURNING id_terapeuta";
            this.conectar();
            Integer nuevoID=0;
            Iterator<SetGetTer> it = terapeuta.iterator();
            SetGetTer m;
            if(it.hasNext()){
                m = (SetGetTer)it.next();
                pstm.setString(1, m.getEspecialidad().toUpperCase());
                pstm.setString(2, m.getNombre().toUpperCase());
                pstm.setString(3, m.getApellidop().toUpperCase());
                pstm.setString(4, m.getApellidom().toUpperCase());                
                pstm.setString(5, m.getTelefono());                               
               pstm.execute();
               ResultSet id=pstm.getResultSet();
               id.next();
               nuevoID=id.getInt("id_terapeuta");
            }
            
            return nuevoID;            
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }              
    }
    public void guardarUsuario(Collection<SetGetTer> cita, int id){//guarda datos de usuario
        try{
            this.sql="INSERT INTO usuario(\n" +
"            nom_usuario, id_terapeuta, \"contraseña\")\n" +
"    VALUES ( ?, ?, ?);";
            this.conectar();
            Iterator<SetGetTer> it =cita.iterator();
            SetGetTer m;
            while(it.hasNext()){
                m=(SetGetTer)it.next();
                pstm.setInt(2, id);
                pstm.setString(1, m.getUsuario());
                pstm.setString(3, m.getContraseña());               
                this.pstm.execute();
            }

            
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
     public Vector<SetGetTer> buscarUsuarios(String nombre){//busca los usuarios registrados filtrando nombre, apellidos, usuario y contraseña para modificar un usuario
         //SetGetAgenda citas=new  SetGetAgenda();
        try{
            Vector<SetGetTer> vr = new Vector<>();
            SetGetTer r;
            this.sql = "select usuario.id_usuario, usuario.nom_usuario, usuario.contraseña, "
                    + "terapeuta.id_terapeuta, terapeuta.nombret, terapeuta.apellidopt, terapeuta.apellidomt, terapeuta.especialidad, terapeuta.telefono from\n" +
                    "terapeuta inner join usuario on terapeuta.id_terapeuta= usuario.id_terapeuta where\n" +
                "nombret like '%" + nombre + "%' OR apellidopt like '%" +nombre+ "%'";
            this.conectar();
            //this.pstm.setString(1, nombre);
            this.rs = this.pstm.executeQuery();
            while(rs.next()){
               r=new SetGetTer();
               r.setId_usuario(rs.getInt("id_usuario"));
               r.setId_terapeuta(rs.getInt("id_terapeuta"));
               r.setNombre(rs.getString("nombret"));
               r.setApellidop(rs.getString("apellidopt"));
               r.setApellidom(rs.getString("apellidomt"));
               r.setEspecialidad(rs.getString("especialidad"));
               r.setTelefono(rs.getString("telefono"));
               r.setUsuario(rs.getString("nom_usuario"));
               r.setContraseña(rs.getString("contraseña"));              
               vr.add(r);
            }
            return vr;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
      public void modificarContraseña(Collection<SetGetTer> usuario, int id){//modifica cualquier contraseña de un usuario
        SetGetTer citas=new SetGetTer();
        try{            
            this.sql="UPDATE usuario\n" +
         "   SET \"contraseña\"=?\n" +
        "    WHERE id_usuario=?";
            this.conectar();
            pstm.setInt(2, id);
            Iterator<SetGetTer> it=usuario.iterator();
            SetGetTer r;
            if(it.hasNext()){
                r=(SetGetTer)it.next();
                pstm.setString(1, r.getContraseña());
                this.pstm.execute();
            }
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public Vector<Object[]> expedientesDeTerapeuta(Integer id_terapeuta, String estado) throws org.postgresql.util.PSQLException {
        System.out.println(id_terapeuta);
        try {
            this.sql =  "SELECT expediente.id_expediente, nombre, apellidop, apellidom, \"estadoPaciente\" FROM expediente\n" +
                    "INNER JOIN expediente_terapeuta ON expediente_terapeuta.id_expediente = expediente.id_expediente\n" +
                    "INNER JOIN persona ON expediente.id_persona = persona.id_persona\n" +
                    "WHERE expediente_terapeuta.id_terapeuta = ?\n" +
                    "AND expediente.\"estadoPaciente\"=?";
            Vector<Object[]> expedientes = new Vector<>();
            this.conectar();
            this.pstm.setInt(1, id_terapeuta);
            this.pstm.setString(2, estado);
            this.rs = this.pstm.executeQuery();
            Object[] nuevo;
            while(rs.next()){
                System.out.println(rs.getInt("id_expediente"));
                nuevo = new Object[]{
                    rs.getInt("id_expediente"),
                    rs.getString("nombre"),
                    rs.getString("apellidop") + " " + rs.getString("apellidom"),
                    rs.getString("estadoPaciente")
                };
                expedientes.add(nuevo);
            }
            return expedientes;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(administracionDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
    
    public void agregarPersona(String nombre, String apellidop, String apellidom, String tel){
        try {
            this.sql = "INSERT INTO persona(nombre, apellidop, apellidom, telefono) VALUES (?, ?, ?, ?)";
            this.conectar();
            this.pstm.setString(1, nombre);
            this.pstm.setString(2, apellidop);
            this.pstm.setString(3, apellidom);
            this.pstm.setString(4, tel);
            
            this.pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(administracionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(administracionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void actualizarTerapeuta(String nombret, String apellidotp, String apellidotm, String especialidad, String telefono, Integer id_usuario){
        try {
            this.sql = "UPDATE terapeuta\n" +
                    "SET especialidad=?, nombret=?, apellidopt=?, apellidomt=?, telefono=?\n" +
                    "FROM usuario\n" +
                    "WHERE usuario.id_terapeuta = terapeuta.id_terapeuta\n" +
                    "AND usuario.id_usuario=?";
            this.conectar();
            this.pstm.setString(1, especialidad);
            this.pstm.setString(2, nombret);
            this.pstm.setString(3, apellidotp);
            this.pstm.setString(4, apellidotm);
            this.pstm.setString(5, telefono);
            this.pstm.setInt(6, id_usuario);
            this.pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(administracionDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(administracionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
