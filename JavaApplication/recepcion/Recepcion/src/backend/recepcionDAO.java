
package backend;
import java.io.FileInputStream;
import recepcion.SetGetExp;


import java.util.Vector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import recepcion.SetGetAgenda;
import recepcion.SetGetPcontacto;
import recepcion.SetGetPcita;
import recepcion.pcontacto;

public class recepcionDAO {
    private String url = "jdbc:postgresql://127.0.0.1/Aplicacion";
    private String sql;
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;
    public FileInputStream fis;
    public int longitud;
    
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
    public void modificarPersonaBoton(Collection<SetGetPcontacto> persona){//modifica cualquier fato personal de primer contacto en boton
        SetGetPcontacto per=new SetGetPcontacto();
        try{            
            this.sql="UPDATE persona\n" +
                    "   SET  nombre=?, apellidop=?, apellidom=?, telefono=?\n" +
                    " WHERE id_persona=?";
            this.conectar();
            
            Iterator<SetGetPcontacto> it=persona.iterator();
            SetGetPcontacto r;
            if(it.hasNext()){
                r=(SetGetPcontacto)it.next();
                this.pstm.setString(1, r.getNombre());
                this.pstm.setString(2, r.getApellidoP());
                this.pstm.setString(3, r.getApellidoM());
                this.pstm.setString(4, r.getTelefono());
                this.pstm.setInt(5, r.getId_persona());
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
public Vector<SetGetPcontacto> buscarPersona(String nombre){//filtra personas para modificar datos personales
        SetGetPcontacto persona=new SetGetPcontacto();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT id_persona, nombre, apellidop, apellidom\n" +
        "  FROM persona where nombre LIKE '%" + nombre + "%' OR apellidop LIKE '%" + nombre + "%'";
        this.conectar();
        //this.pstm.setString(1, nombre);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_persona"));
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidoP(rs.getString("apellidop").concat(" ".concat(rs.getString("apellidom"))));

            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
public Vector<SetGetPcontacto> buscarExpedientes(String nombre){//filtra personas para ver datos de expedientes
        SetGetPcontacto persona=new SetGetPcontacto();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT persona.nombre, persona.apellidop, persona.apellidom, persona.telefono, "
                + "expediente.id_expediente FROM\n" +
                    "persona INNER JOIN expediente ON persona.id_persona=expediente.id_persona\n" +
            "WHERE persona.nombre LIKE '%"+nombre+"%' OR persona.apellidop LIKE '%"+nombre+"%' OR persona.apellidom LIKE '%"+nombre+"%';";
        this.conectar();
        //this.pstm.setString(1, nombre);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_expediente"));
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidoP(rs.getString("apellidop"));
            dato.setApellidoM(rs.getString("apellidom"));
            dato.setTelefono(rs.getString("telefono"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }

public Vector<SetGetPcontacto> buscarPersonaMouseclick(int id){//filtra personas para modificar datos personales
        SetGetPcontacto persona=new SetGetPcontacto();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT id_persona, nombre, apellidop, apellidom, telefono\n" +
        "  FROM persona where id_persona=?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_persona"));
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidoP(rs.getString("apellidop"));
            dato.setApellidoM(rs.getString("apellidom"));
            dato.setTelefono(rs.getString("telefono"));

            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }

    public boolean verificarExp(int folio){//Verificar si existe un expediente a la hora de relizar un ticket
        
        try{
            this.sql="select id_expediente from expediente where id_expediente = ? ";
            this.conectar();
            pstm.setInt(1, folio);
            this.rs = this.pstm.executeQuery();
            if(rs.next())
                return true;
            else
               return false; 
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
        
    }
    public boolean verificarCita(String hora, Date fecha, int id){//verificar si ya existe una cita a determinada hora para pacientes registardos
        try{
            this.sql="select * from agenda where hora = ? and fecha = ? and id_terapeuta = ?";
            this.conectar();
            pstm.setString(1, hora);
            pstm.setDate(2, fecha);
            pstm.setInt(3, id);
            this.rs = this.pstm.executeQuery();
            if(rs.next())
                return true;
            else
               return false; 
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public boolean verificarpCita(String hora, Date fecha){//verificar si ya existe una cia a determinada hora para primeros contacto
        try{
            this.sql="select * from pcita where hora = ? and fecha = ?";
            this.conectar();
            pstm.setString(1, hora);
            pstm.setDate(2, fecha);
            this.rs = this.pstm.executeQuery();
            if(rs.next())
                return true;
            else
               return false; 
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public  int guardarPersona(Collection<SetGetPcontacto> persona){//guarda una nueva persona
        boolean ban=true;
        try{
            this.sql="INSERT INTO persona(\n" +
                        "             nombre, apellidop, apellidom, telefono)\n" +
                        "    VALUES (?, ?, ?, ?) RETURNING id_persona";
            this.conectar();
            Integer nuevoID=0;
            Iterator<SetGetPcontacto> it = persona.iterator();
            SetGetPcontacto m;
            if(ban==true){
            if(it.hasNext()){
                m = (SetGetPcontacto)it.next();
                pstm.setString(1, m.getNombre().toUpperCase());
                pstm.setString(2, m.getApellidoP().toUpperCase());
                pstm.setString(3, m.getApellidoM().toUpperCase());                
                pstm.setString(4, m.getTelefono());
                
               pstm.execute();
               ResultSet id=pstm.getResultSet();
               id.next();
               nuevoID=id.getInt("id_persona");
               ban=false;
            }
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
    public void guardarCita(Collection<SetGetPcita> cita, int id){//guarda una nueva cita en la base de datos para primer contacto
        try{
            this.sql="INSERT INTO pcita(\n" +
            "            id_persona, fecha, hora)\n" +
            "           VALUES (?, ?, ?);";
            this.conectar();
            Iterator<SetGetPcita> it =cita.iterator();
            SetGetPcita m;
            while(it.hasNext()){
                m=(SetGetPcita)it.next();
                pstm.setInt(1, id);
                pstm.setDate(2, m.getFecha());
                pstm.setString(3, m.getHora());
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
    public void guardarAgenda(Collection<SetGetAgenda> agenda){//guarda una cita de un expediente registrado
        SetGetAgenda citas=new SetGetAgenda();
        try{            
            this.sql="INSERT INTO agenda(\n" +
"            id_persona, id_terapeuta, observaciones, \"fecha\", \n" +
"            \"hora\")\n" +
"    VALUES (?, ?, ?, ?, ? \n" +
"            )";
            this.conectar();
            Iterator<SetGetAgenda> it=agenda.iterator();
            SetGetAgenda r;
            if(it.hasNext()){
                r=(SetGetAgenda)it.next();
                pstm.setInt(1, r.getId_expediente());
                pstm.setInt(2, r.getId_terapeuta());
                pstm.setString(3, r.getObservacion());
                pstm.setDate(4, r.getFecha());
                pstm.setString(5, r.getHora());
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
    public void eliminarAgenda(Integer idAgenda){//elimina una cita de un expediente
        try{            
                    this.sql="DELETE FROM agenda\n" +
                        " WHERE id_cita = ?";
            this.conectar();
            this.pstm.setInt(1, idAgenda);
            this.pstm.execute();
            }
        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    
    public Vector<SetGetPcita> buscarCita(Date dia){//busca citas para contactos que no han cido registrados como expedientes
           SetGetPcita citas=new  SetGetPcita();
        try{
            Vector<SetGetPcita> vr = new Vector<>();
            SetGetPcita r;
            this.sql = "select persona.nombre, persona.apellidop, pcita.fecha, pcita.hora, persona.telefono from persona inner join pcita "
                    + "on pcita.id_persona=persona.id_persona where pcita.fecha = ?";
            this.conectar();
            this.pstm.setDate(1, dia);
            this.rs = this.pstm.executeQuery();
            while(rs.next()){
               r=new SetGetPcita();
               r.setNombre(rs.getString("nombre").concat(" ".concat(rs.getString("apellidop"))));
               r.setFecha(rs.getDate("fecha"));
               r.setHora(rs.getString("hora"));
               r.setTelefono(rs.getString("telefono"));
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
    public Vector<SetGetAgenda> buscarAgendaGeneral(Date dia){//busca las citas en la agenda general incluye todos los terapeutas
         //SetGetAgenda citas=new  SetGetAgenda();
        try{
            Vector<SetGetAgenda> vr = new Vector<>();
            SetGetAgenda r;
            this.sql = "select agenda.id_cita, persona.nombre, persona.apellidop, persona.telefono, agenda.fecha, agenda.hora, terapeuta.nombret,\n" +
"                terapeuta.apellidopt, agenda.observaciones from agenda inner join persona on persona.id_persona=agenda.id_persona inner join \n" +
"                terapeuta on terapeuta.id_terapeuta = agenda.id_terapeuta where\n" +
"                agenda.fecha = ?";
            this.conectar();
            this.pstm.setDate(1, dia);
            this.rs = this.pstm.executeQuery();
            while(rs.next()){
               r=new SetGetAgenda();
               r.setId_agenda(rs.getInt("id_cita"));
               r.setObservacion(rs.getString("observaciones"));
               r.setNombre_persona(rs.getString("nombre").concat(" ").concat(rs.getString("apellidop")));
               r.setTelefono(rs.getString("telefono"));
               r.setFecha(rs.getDate("fecha"));
               r.setHora(rs.getString("hora"));
               r.setNombre_Terapeuta(rs.getString("nombret").concat(" ".concat(rs.getString("apellidopt"))));
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
    public Vector<SetGetAgenda> buscarAgendaTerapeuta(Date dia, int id){//busca las citas que tiene cada terapeuta en un determinado dia
         //SetGetAgenda citas=new  SetGetAgenda();
        try{
            Vector<SetGetAgenda> vr = new Vector<>();
            SetGetAgenda r;
            this.sql = "select agenda.id_cita, persona.nombre, persona.apellidop, persona.telefono, agenda.fecha, agenda.hora, terapeuta.nombret,\n" +
"               terapeuta.apellidopt, agenda.observaciones from agenda inner join persona on persona.id_persona=agenda.id_persona inner join \n" +
"              terapeuta on terapeuta.id_terapeuta = agenda.id_terapeuta where\n" +
"               agenda.fecha = ? and terapeuta.id_terapeuta = ?";
            this.conectar();
            this.pstm.setDate(1, dia);
            this.pstm.setInt(2, id);
            this.rs = this.pstm.executeQuery();
            while(rs.next()){
               r=new SetGetAgenda();
               r.setId_agenda(rs.getInt("id_cita"));
               r.setObservacion(rs.getString("observaciones"));
               r.setNombre_persona(rs.getString("nombre").concat(" ").concat(rs.getString("apellidop")));
               r.setTelefono(rs.getString("telefono"));
               r.setFecha(rs.getDate("fecha"));
               r.setHora(rs.getString("hora"));
               r.setNombre_Terapeuta(rs.getString("nombret").concat(" ".concat(rs.getString("apellidopt"))));
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
     public void modificarAgenda(Collection<SetGetAgenda> agenda, int id){//modifica cualquier cita que este en la agenda de expedientes
        SetGetAgenda citas=new SetGetAgenda();
        try{            
            this.sql="UPDATE agenda\n" +
        "   SET  \n" +
        " hora = ?" +
        " WHERE id_cita = ?";
            this.conectar();
            this.pstm.setInt(2, id);
            Iterator<SetGetAgenda> it=agenda.iterator();
            SetGetAgenda r;
            if(it.hasNext()){
                r=(SetGetAgenda)it.next();
                pstm.setString(1, r.getHora());
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
     
            
//    public Vector<SetGetPcontacto> buscarPersona(String nombre){//filtra personas a la hora que se quiere agregar un expediente
//        SetGetPcontacto persona=new SetGetPcontacto();      
//        try{
//        SetGetPcontacto dato;
//        Vector<SetGetPcontacto> vr = new Vector<>();
//        this.sql="SELECT nombre, apellidop, apellidom\n" +
//        "  FROM persona where nombre LIKE '%" + nombre + "%' OR apellidop LIKE '%" + nombre + "%'";
//        this.conectar();
//        //this.pstm.setString(1, nombre);
//        this.rs=pstm.executeQuery();
//        while(rs.next()){
//            dato=new SetGetPcontacto();
//            dato.setNombre(rs.getString("nombre"));
//            dato.setApellidoP(rs.getString("apellidop").concat(" ".concat(rs.getString("apellidom"))));
//
//            vr.add(dato);
//        }
//        return vr;
//    }catch(Exception e){
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        } finally{
//            this.cerrarConexion();
//        }
//    }
   
    public Vector<SetGetPcontacto> cargarTerapeuta(String nombre){//busca los terapeutas para realizar asiganr un terapeuta a la hora de hacer un expediente
        SetGetPcontacto persona=new SetGetPcontacto();
        int i;
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT id_terapeuta, nombret, apellidopt, apellidomt, especialidad\n" +
        "  FROM terapeuta where nombret LIKE '%" + nombre + "%' OR apellidopt LIKE '%" + nombre + "%' "
                + "OR apellidomt LIKE '%" + nombre + "%'";
        this.conectar();
        //this.pstm.setString(1, nombre);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_terapeuta"));
            dato.setNombre(rs.getString("nombret").concat(" ".concat(rs.getString("apellidopt")).concat(" ".concat(rs.getString("apellidomt")))));
            dato.setEspecialidad(rs.getString("especialidad"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetPcontacto> cargarTerapeutaaEnAgenda(String nombre){//cargar terapeuta para seleccionar a la hora de realizar una cita en la agenda
        SetGetPcontacto persona=new SetGetPcontacto();
        int i;
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT id_terapeuta, nombret, apellidopt, apellidomt, especialidad\n" +
        "  FROM terapeuta where nombret LIKE '%" + nombre + "%' OR apellidopt LIKE '%" + nombre + "%' "
                + "OR apellidomt LIKE '%" + nombre + "%'";
        this.conectar();
        //this.pstm.setString(1, nombre);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setNombre(rs.getString("nombret"));
            dato.setApellidoP(rs.getString(("apellidopt")).concat(" ".concat(rs.getString("apellidomt"))));
            dato.setId_persona(rs.getInt("id_terapeuta"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetExp> buscarExpaAsignar(int id){//filtra los expedientes a  la hora que se requiere agendar una cita 
        try{
        SetGetExp dato;
        Vector<SetGetExp> vr = new Vector<>();
        this.sql="select expediente.id_expediente, persona.id_persona, persona.nombre, persona.apellidop, "
                + "persona.apellidom from expediente inner join persona on\n" +
"               expediente.id_persona= persona.id_persona where id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetExp();
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidos(rs.getString("apellidop").concat(" ").concat(rs.getString("apellidom")));
            dato.setId_exp(rs.getInt("id_expediente"));
            dato.setId_persona(rs.getInt("id_persona"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetExp> buscarTerapeutasAsignados(int exp){//filtra los terapeutas asignados a un expediente
        //SetGetExp persona=new SetGetExp();      
        try{
        SetGetExp dato;
        Vector<SetGetExp> vr = new Vector<>();
        this.sql="select terapeuta.id_terapeuta, terapeuta.nombret, terapeuta.apellidopt, \n" +
"                terapeuta.apellidomt from expediente_terapeuta\n" +
"                inner join terapeuta on expediente_terapeuta.id_terapeuta = terapeuta.id_terapeuta where \n" +
"                expediente_terapeuta.id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, exp);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            int a=rs.getInt("id_terapeuta");
            dato=new SetGetExp();
            dato.setNombre(Integer.toString(rs.getInt("id_terapeuta")).concat(" ").concat(rs.getString("nombret").concat(" ")
            .concat(rs.getString("apellidopt").concat(" ").concat(rs.getString("apellidomt")))));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    }
    

