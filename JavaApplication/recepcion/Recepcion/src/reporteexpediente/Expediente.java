/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteexpediente;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author engine
 */
public class Expediente {
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
    public Expediente(String direccion, String nombreBD, String usuario, String contrasena){
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
    public void imprimir(Integer id_expediente){
        try{
            /*BufferedImage prueba = ImageIO.read(new File("nombre.png"));
            System.out.println(prueba.toString());
            this.conectar();
            try{
                java.sql.Date sdate = new java.sql.Date(java.sql.Date.valueOf("2014-15-1").getTime());
            }catch(IllegalArgumentException ier){
                JOptionPane.showMessageDialog(null, "No se puede validar esa fecha." + ier.getMessage());
            }*/
            this.conectar();
            this.sql = "SELECT genograma FROM expediente WHERE id_expediente = ?";
            this.pstm = con.prepareStatement(sql);
            this.pstm.setInt(1, id_expediente);
            this.resultados = pstm.executeQuery();
            BufferedImage buffered = null;
            if(this.resultados.next()){
                byte[] imgBytes = this.resultados.getBytes(1);
                System.out.println(imgBytes);
                ByteArrayInputStream bais = new ByteArrayInputStream(imgBytes);
                buffered = ImageIO.read(bais);
                System.out.print(buffered);
            }
            
            //El formato Jasper requiere de un pase de parámetros dentro de un Map.
            //En este caso, se implementa con HashMap <key, valor>.
            Map<String, Object> datos = new HashMap<>();
            //Se agregan ambos parámetros.
            datos.put("id_expediente", id_expediente);
            datos.put("genograma", buffered);
             
            //Se llena el reporte en la ruta especificada, con los parametros dados
            //jalando datos de la conexión creada.
            try{
                this.llenado = JasperFillManager.fillReport("Expediente/expediente.jasper", datos, con);
                JasperViewer.viewReport(this.llenado, false);
            }catch(JRException jex){
                JOptionPane.showMessageDialog(null, "No se ha generado el reporte correctamente.\nVerifice las plantillas de reportes.");
                
                jex.printStackTrace();
                throw new RuntimeException(jex);
            }
        }catch(SQLException | IOException ex){
            Logger.getLogger(Expediente.class.getName()).log(Level.SEVERE,null, ex);
        }finally{
            this.desconectar();
        }
    }
}
