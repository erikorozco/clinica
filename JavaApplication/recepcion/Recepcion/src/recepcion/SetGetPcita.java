
package recepcion;
    
import java.sql.Date;

    
public class SetGetPcita {

    public Integer getId_cita() {
        return id_cita;
    }

    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String telefono;
    private Integer id_cita;
    private Integer id_persona;
    private String hora;
    private Date fecha;
    
    public Object [] toObjectArray(){
        Object[] ar = new Object[]{
            this.nombre,
            this.fecha,
            this.hora,
            this.telefono
        };return ar;
    }
      
    
    
}
