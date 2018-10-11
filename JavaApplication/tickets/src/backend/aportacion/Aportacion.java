/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.aportacion;

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
 * Controla la generación de aportaciones en la base de datos y en la posterior
 * obtención de tickets con Jasper.
 * @author engine
 */
public class Aportacion {

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
     * Constructor de ReportesEstadisticos.
     * @param direccion Dirección IP del servidor de PostgreSQL.
     * @param usuario Nombre de usuario de la conexión a la base de datos.
     * @param nombreBD Nombre de la base de datos a la cual conectarse.
     */
    public Aportacion(String direccion, String nombreBD, String usuario, String contrasena){
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
     * Genera una aportación en la base de datos.
     * @param id_expediente El ID del expediente del paciente que realiza la aportación.
     * @param fecha_hora Hora y fecha en que se realizó la aportación.
     * @param total Aportación total del paciente.
     * @param concepto Concepto o pequeño comentario acerca de la aportación.
     */
    public void generarAportación(Integer id_expediente, String fecha_hora, Double total, String concepto){
        try {
            //Se instancia un objeto y se definen sus propiedades 
            AportacionDTO nueva = new AportacionDTO();
            nueva.setId_expediente(id_expediente);
            nueva.setFecha_hora(fecha_hora);
            nueva.setTotal(total);
            nueva.setConcepto(concepto);
            
            this.conectar();
            
            //Se declara el query y se definen sus parámetros.
            this.sql = "INSERT INTO aportacion("
                    + "id_expediente, "
                    + "\"fechaTransaccion\", "
                    + "total, concepto) VALUES (?, '"+ nueva.getFecha_hora() +"', ?, ?) RETURNING id_aportacion";
            this.pstm = this.con.prepareStatement(sql);
            this.pstm.setInt(1, nueva.getId_expediente());
            //this.pstm.setString(2, fecha_hora);
            this.pstm.setDouble(2, nueva.getTotal());
            this.pstm.setString(3, nueva.getConcepto());
            
            //Se ejecuta el query y se obtiene el valor RETURNING.
            this.resultados = pstm.executeQuery();
            //Ese valor será el ID del ticket generado.
            if(this.resultados.next()){
                this.id_generar = this.resultados.getInt("id_aportacion");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    /**
     * Imprime el último ticket generado en el sistema de aprotaciones.
     */
    public void imprimir(){
        //Si no se ha generado un ticket, entonces muestra un mensaje de error
        //y termina.
        if(this.id_generar == null){
            JOptionPane.showMessageDialog(null, "No se ha generado el recibo correctamente.\n ¿Si se ha realizado una compra?");
            throw new RuntimeException("Error de conexión a la base de datos.");
        }
        this.conectar();
        //El formato Jasper requiere de un pase de parámetros dentro de un Map.
        //En este caso, se implementa con HashMap <key, valor>.
        Map<String, Object> datos = new HashMap<>();
        //Se agregan ambos parámetros.
        datos.put("id_aportacion", this.id_generar);
        
        //Se llena el reporte en la ruta especificada, con los parametros dados
        //jalando datos de la conexión creada.
        try{
            this.llenado = JasperFillManager.fillReport("Aportacion/aportacion.jasper", datos, con);
            JasperViewer.viewReport(this.llenado, false);
        }catch(JRException jex){
            JOptionPane.showMessageDialog(null, "No se ha generado el recibo correctamente.\nVerifice las plantillas de reportes.");

            jex.printStackTrace();
            throw new RuntimeException(jex);
        }finally{
            this.desconectar();
        }
    }
    
    
    public void imprimir(Integer ID){
        this.conectar();
        //El formato Jasper requiere de un pase de parámetros dentro de un Map.
        //En este caso, se implementa con HashMap <key, valor>.
        Map<String, Object> datos = new HashMap<>();
        //Se agregan ambos parámetros.
        datos.put("id_aportacion", ID);
        
        //Se llena el reporte en la ruta especificada, con los parametros dados
        //jalando datos de la conexión creada.
        try{
            this.llenado = JasperFillManager.fillReport("Aportacion/aportacion.jasper", datos, con);
            JasperViewer.viewReport(this.llenado, false);
        }catch(JRException jex){
            JOptionPane.showMessageDialog(null, "No se ha generado el recibo correctamente.\nVerifice las plantillas de reportes.");

            jex.printStackTrace();
            throw new RuntimeException(jex);
        }finally{
            this.desconectar();
        }
    }
}
