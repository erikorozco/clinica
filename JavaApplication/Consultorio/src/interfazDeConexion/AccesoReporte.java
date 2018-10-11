package interfazDeConexion;

import interfazGrafica.InicioSesion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import terapeuta.Reporte;
import trabajofinal.TrabajoFinal;
/**
 * Provee de acceso a los componentes de Sesion en la base de datos.
 */
public class AccesoReporte {
    private Connection conexion = null;
    private PreparedStatement consulta;
    private ResultSet resultados = null;
    private String url = "jdbc:postgresql://192.168.1.100:5432/Aplicacion";
    private String sql;

    /**
     * Conecta a la base de datos preestablecida.
     */
    private void conectar() throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            this.conexion = DriverManager.getConnection(this.url, "postgres", "$@Lud1n73gral");
            this.consulta = this.conexion.prepareStatement(this.sql);			
    }

    /**
     * Desconecta de la base de datos.
     */
    private void cerrarConexion() {
            try {
                if(this.resultados != null) 
                    this.resultados.close();
                if(this.consulta != null) 
                    this.consulta.close();
                if(this.conexion != null) 
                    this.conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    /**
     * Agrega un nuevo reporte a la base de datos.
     * @param nuevoReporte El reporte a guardar en la base de datos.
     */
    public void agregarReporte(Reporte nuevoReporte) {
        try {
                this.sql = "INSERT INTO sesion(id_expediente, id_terapeuta, \"fechaHoraCita\", \"numeroSesion\", apertura, desarrollo, avance, acuerdos, \"tipoServicio\", \"proximaCita\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                this.conectar();
                consulta.setInt(1, nuevoReporte.getNumExpediente());
                consulta.setInt(2, InicioSesion.identificadorTerapeuta);
                consulta.setDate(3, nuevoReporte.obtenerCita());
                consulta.setInt(4, nuevoReporte.obtenerNumSesion());
                consulta.setString(5, nuevoReporte.obtenerApertura());
                consulta.setString(6, nuevoReporte.obtenerDesarrollo());
                consulta.setString(7, nuevoReporte.obtenerAvances());
                consulta.setString(8, nuevoReporte.obtenerAcuerdos());
                consulta.setString(9, nuevoReporte.obtenerTipoDeServicio());
                consulta.setDate(10, nuevoReporte.obtenerProximaCita());
                consulta.execute();

        } catch(Exception exepcion) {
                exepcion.printStackTrace();
                throw new RuntimeException(exepcion);
        } finally {
                this.cerrarConexion();
        }
    }
    
    //Obtiene todos los reportes asociados con el terapeuta actual y el identificador especificado
    /**
     * Obtiene los reportes realizados por el terapeuta de cierto expediente.
     * @param identificadorTerapeuta ID único del terapeuta.
     * @param id_expediente ID único del expediente.
     * @return Conjunto de resultados.
     */
    public Collection<Reporte> obtenerReportes(int identificadorTerapeuta, int id_expediente) {
        Vector<Reporte> resultadoBusqueda = new Vector<>();
        try {
            this.sql =  "SELECT sesion.id_sesion, expediente.id_expediente, nombre, apellidop, \"numeroSesion\", \"fechaHoraCita\", \"tipoServicio\"\n" +
                        "FROM expediente_terapeuta\n" +
                        "INNER JOIN terapeuta ON terapeuta.id_terapeuta = expediente_terapeuta.id_terapeuta\n" +
                        "INNER JOIN sesion ON sesion.id_expediente = expediente_terapeuta.id_expediente\n" +
                        "INNER JOIN expediente ON expediente_terapeuta.id_expediente = expediente.id_expediente\n" +
                        "INNER JOIN persona ON expediente.id_persona = persona.id_persona\n"+
                        "WHERE expediente_terapeuta.id_terapeuta = '" + identificadorTerapeuta + "'\n" +
                        "AND expediente_terapeuta.id_expediente = '" + id_expediente+"'";            
            this.conectar();
            resultados = consulta.executeQuery();
            Reporte nuevoReporte;

            while(resultados.next()) {
                nuevoReporte = new Reporte();
                nuevoReporte.setId_sesion(resultados.getInt("id_sesion"));
                nuevoReporte.ingresarNumExpediente(resultados.getInt("id_expediente"));
                nuevoReporte.ingresarNombreDelPaciente(resultados.getString("nombre") + " " + resultados.getString("apellidop"));
                nuevoReporte.ingresarCita(resultados.getDate("fechaHoraCita"));
                nuevoReporte.ingresarNumSesion(resultados.getInt("numeroSesion"));
                nuevoReporte.ingresarTipoDeServicio(resultados.getString("tipoServicio"));
                resultadoBusqueda.add(nuevoReporte);
            }
            return resultadoBusqueda;

        } catch(Exception exepcion) {
                exepcion.printStackTrace();
                throw new RuntimeException(exepcion);
        } finally {
                this.cerrarConexion();
        }
    }
    
    //Inicia una nueva sesión con una cuenta de terapeuta, y regresa el identificador del usuario especificado
    /**
     * Inicia sesión del terapeuta.
     * @param usuario Nombre de usuario.
     * @param contraseña Contraseña.
     * @return ID del usuario.
     */
    public int iniciarSesion(String usuario, String contraseña) throws ClassNotFoundException {
        int idUsuario = 0;
        try {
            this.sql = "SELECT nom_usuario, contraseña, id_usuario FROM usuario WHERE nom_usuario = '" + usuario + "' AND contraseña = '" + contraseña + "'" ;
            this.conectar();
            resultados = consulta.executeQuery();
            if(resultados.next()) {
                idUsuario = resultados.getInt("id_usuario");
                return idUsuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoReporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(TrabajoFinal.inicioSesion, "Usuario o contraseña incorrectos");
            ex.printStackTrace();
        }
        return 0;
    }
    
    //Obtiene el identificador del terapeuta utilizando el identificador de usuario almacenado en la aplicación al iniciar sesión
    /**
     * Obtiene el identificador único del terapeuta.
     * @param identificadorUsuario Identificador del uruario.
     * @return Identificador relacionado al ID del usuario.
     */
    public int obtenerIdentificadorDeTerapeuta(int identificadorUsuario) throws ClassNotFoundException {
        int identificador = 0;
        try {
            this.sql = "SELECT id_terapeuta FROM usuario WHERE id_usuario = " + identificadorUsuario;
            System.out.println(this.sql);
            this.conectar();
            resultados = consulta.executeQuery();
            if(!resultados.wasNull()) {
                resultados.next();
                identificador= resultados.getInt("id_terapeuta");
                return identificador;
            }
        } catch(SQLException ex) {
            Logger.getLogger(AccesoReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return identificador;
    }
    /**
     * Devuelve el siguiente número de sesión del expediente dado.
     * @param id_expediente Identificador del expediente.
     * @return El número de sesión a realizar.
     */
    public int siguienteSesion(int id_expediente){
        try{
            this.sql = "SELECT \"numeroSesion\" FROM sesion WHERE id_expediente = ? ORDER BY \"numeroSesion\" DESC LIMIT 1";
            this.conectar();
            this.consulta.setInt(1, id_expediente);
            this.resultados = this.consulta.executeQuery();
            if(this.resultados.next()){
                
                int actual = resultados.getInt("numeroSesion");
                System.out.println("anexando " + actual);
                return actual + 1; 
            }
            else{
                System.out.println("Creando");
                return 1;
            }
        }catch(SQLException | ClassNotFoundException sqex){
            JOptionPane.showMessageDialog(null,"Error en la conexión.", "Error en la conexión. ¿Está la computadora central encendida?", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(sqex);
        }
    }
    
    public boolean expedienteAsignado(Integer terapeuta, Integer expediente){
        try{
            this.sql =  "SELECT id_expediente from expediente_terapeuta\n" +
                        "WHERE id_terapeuta=?\n" +
                        "AND id_expediente=?";
            this.conectar();
            this.consulta.setInt(1, terapeuta);
            this.consulta.setInt(2, expediente);
            this.resultados = this.consulta.executeQuery();
            if(this.resultados.next()){
                return true;
            }
            else{
                return false;
            }
        }catch(SQLException | ClassNotFoundException sqex){
            sqex.printStackTrace();
            throw new RuntimeException(sqex);
        }finally{
            this.cerrarConexion();
        }
    }
}
