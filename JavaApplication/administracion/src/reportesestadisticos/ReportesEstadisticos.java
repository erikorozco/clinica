package reportesestadisticos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Contiene métodos y constantes para la generación de reportes.
 * @author engine
 */
public class ReportesEstadisticos{
    //Variables de datos para acceso a la base de datos.
    private String url, usuario, contrasena;
    
    //Conexión a la base de datos.
    private Connection con;
    
    //Objeto que almacena el reporte generado.
    private JasperPrint llenado;
    
    //En una enumeración se indican todos los tipos de reportes posibles.
    public enum Tipo {
        REPORTE_EDAD,
        REPORTE_ALTAS,
        REPORTE_GENERO,
        REPORTE_ORIGEN,
        REPORTE_PARROQUIA,
        REPORTE_TIPO_ATENCION,
        REPORTE_ESTADO_PACIENTES,
        REPORTE_INGRESOS_FARMACIA,
        REPORTE_INGRESOS_APORTACIONES
    };
    
    /**
     * Constructor de ReportesEstadisticos.
     * @param direccion Dirección IP del servidor de PostgreSQL.
     * @param nombreBD Nombre de la base de datos a la cual conectarse.
     * @param usuario Nombre de usuario de la conexión a la base de datos.
     * @param contrasena Contrasena del usuario de la base de datos.
     */
    public ReportesEstadisticos(String direccion, String nombreBD, String usuario, String contrasena){
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
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos.\n"
                    + "¿Está la computadora central activa?.");
            throw new RuntimeException("Error de conexión a la base de datos.");
        }
    }
    
    /**
     * Selecciona la plantilla apropiada según el tipo que se haya indicado.
     * @param tipo Tipo de documento que se desea generar.
     * @return Cadena con la ruta del archivo. Es específica de esta implementación.
     */
    private String seleccionarPlantilla(Tipo tipo){
        String archivo = "Estadisticos/";
        //Dentro de un switch, se actúa según el tipo de reporte a generar.
        //Se completará la ruta a la plantilla de jasper correspondiente.
        switch(tipo){
            case REPORTE_EDAD:
                archivo += "edad.jasper";
                break;
            case REPORTE_ALTAS:
                archivo += "estadoAltas.jasper";
                break;
            case REPORTE_GENERO:
                archivo += "genero.jasper";
                break;
            case REPORTE_ORIGEN:
                archivo += "origen.jasper";
                break;
            case REPORTE_PARROQUIA:
                archivo += "parroquia.jasper";
                break;
            case REPORTE_TIPO_ATENCION:
                archivo += "porcentaje.jasper";
                break;
            case REPORTE_ESTADO_PACIENTES:
                archivo += "estadoAtenciones.jasper";
                break;
            case REPORTE_INGRESOS_FARMACIA:
                archivo += "reporte_farmacia.jasper";
                break;
            case REPORTE_INGRESOS_APORTACIONES:
                archivo += "reporte_aportaciones.jasper";
                break;
            default:
                return null;
        }
        return archivo;
    }
    
    /**
     * Genera un reporte en función al tipo especificado. 
     * @param tipo Tipo correspondiente a la enumeración.
     */
    public void generarReporte(Tipo tipo){
        String archivo = this.seleccionarPlantilla(tipo);
        this.conectar();
        try{
            this.llenado = JasperFillManager.fillReport(archivo, new HashMap(), con);
        }catch(JRException jex){
            JOptionPane.showMessageDialog(null, "Error en la generación del reporte.\n"
                    + "Verifique la integridad de las plantillas de reportes.");
            throw new RuntimeException(jex);
        }finally{
            this.desconectar();
        }
        
    }
    
    /**
     * Genera un reporte en formato JasperPrint con los datos indicados.
     * @param tipo Tipo de reporte a generar.
     * @param inicio Fecha inicial del rango a consultar.
     * @param fin Fecha final del rango a consultar.
     */
    public void generarReporte(Tipo tipo, Date inicio, Date fin){
        //Inicializamos la plantilla.
        String archivo = this.seleccionarPlantilla(tipo);
        this.conectar();
        //El formato Jasper requiere de un pase de parámetros dentro de un Map.
        //En este caso, se implementa con HashMap <key, valor>.
        Map<String, Object> datos = new HashMap<>();
        //Se agregan ambos parámetros.
        datos.put("fechaInicio", inicio);
        datos.put("fechaFin", fin);
        //Se llena el reporte en la ruta especificada, con los parametros dados
        //jalando datos de la conexión creada.
         try{
            this.llenado = JasperFillManager.fillReport(archivo, datos, con);
        }catch(JRException jex){
            jex.printStackTrace();
            throw new RuntimeException(jex);
        }finally{
            this.desconectar();
        }
    }
    
    /**
     * Muestra el reporte almacenado en formato JasperPrint.
     */
    public void mostrarReporte(){
        if(this.llenado == null){
            System.out.println("No se ha llenado el reporte.");
        }
        else{
            JasperViewer.viewReport(this.llenado, false);
        }
    }
}
