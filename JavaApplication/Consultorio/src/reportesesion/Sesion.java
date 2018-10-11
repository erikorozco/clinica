package reportesesion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author engine
 */
public class Sesion {
    //Elementos de la conexión a la BD.
    private String url, usuario, contrasena, sql;
    private Connection con;
    private Integer id_generar;
    
    //Objeto que almacena el reporte generado.
    private JasperPrint llenado;
    
    //Necesitaremos ejecutar querys y obtener su resultado.
    private ResultSet resultados;
    private PreparedStatement pstm;
    
    /**
     * Constructor de Sesion.
     * @param direccion Dirección IP del servidor de PostgreSQL.
     * @param usuario Nombre de usuario de la conexión a la base de datos.
     * @param nombreBD Nombre de la base de datos a la cual conectarse.
     * @param contrasena Contraseña del usuario especificado.
     */
    public Sesion(String direccion, String nombreBD, String usuario, String contrasena){
        //Genera la URL de conexión a la base de datos.
        this.url = "jdbc:postgresql://" + direccion + "/" + nombreBD;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    /**
     * Realiza una conexión a la base de datos definida en el constructor.
     */
    private void conectar(){
        //Atrapa errores y muestra los correspondientes mensajes de error.
        try{
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection(this.url, this.usuario, this.contrasena);
        }catch(SQLException | ClassNotFoundException err){
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.\n"
                    + "¿Está la computadora central activa?.");
            throw new RuntimeException("Error de conexión a la base de datos.");
        }
    }
    
    /**
     * Cierra la conexión establecida en el método conectar.
     */
    private void desconectar(){
        try{
            if(this.con != null) this.con.close();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.\n"
                    + "¿Está la computadora central activa?.");
            throw new RuntimeException("Error de conexión a la base de datos.");
        }
    }
    
    /**
     * Imprime el último ticket generado en el sistema de aprotaciones.
     */
    public void imprimir(Integer id_sesion){
        this.conectar();
        //El formato Jasper requiere de un pase de parámetros dentro de un Map.
        //En este caso, se implementa con HashMap <key, valor>.
        Map<String, Object> datos = new HashMap<>();
        //Se agregan ambos parámetros.
        datos.put("id_sesion", id_sesion);
        
        //Se llena el reporte en la ruta especificada, con los parametros dados
        //jalando datos de la conexión creada.
        try{
            this.llenado = JasperFillManager.fillReport("Sesion/sesion.jasper", datos, con);
            JasperViewer.viewReport(this.llenado, false);
        }catch(JRException jex){
            JOptionPane.showMessageDialog(null, "No se ha generado el reporte correctamente.\nVerifice las plantillas de reportes.");

            jex.printStackTrace();
            throw new RuntimeException(jex);
        }finally{
            this.desconectar();
        }
    }
}
