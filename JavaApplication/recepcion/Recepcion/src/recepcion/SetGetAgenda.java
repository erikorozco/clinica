
package recepcion;

import java.sql.Date;


public class SetGetAgenda {

    public int getId_terapeuta() {
        return id_terapeuta;
    }

    public void setId_terapeuta(int id_terapeuta) {
        this.id_terapeuta = id_terapeuta;
    }
    private int id_terapeuta;
    private int id_expediente;
    private String nombre_persona;
    private String nombre_terapeuta;
    private Date fecha;
    private String hora;
    private String observacion;

    public int getId_expediente() {
        return id_expediente;
    }

    public void setId_expediente(int id_expediente) {
        this.id_expediente = id_expediente;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getNombre_Terapeuta() {
        return nombre_terapeuta;
    }

    public void setNombre_Terapeuta(String terapeuta) {
        this.nombre_terapeuta = terapeuta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    private String especialidad;
    private String apellidop;
    private String apellidot;
    private String telefono;

    public String getNombre_terapeuta() {
        return nombre_terapeuta;
    }

    public void setNombre_terapeuta(String nombre_terapeuta) {
        this.nombre_terapeuta = nombre_terapeuta;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidot() {
        return apellidot;
    }

    public void setApellidot(String apellidot) {
        this.apellidot = apellidot;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Object [] toObjectArray1(){
        Object[] ar = new Object[]{
            this.id_expediente,
            this.nombre_persona,
            this.nombre_terapeuta,
            this.especialidad,
            this.id_terapeuta
        };return ar;
    }

    public int getId_agenda() {
        return id_agenda;
    }

    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }
    private int id_agenda;
    public Object [] toObjectArray2(){
        Object[] ar = new Object[]{ 
            this.id_agenda,
            this.nombre_persona,
            this.telefono,
            this.hora,
            this.fecha,                
            this.nombre_terapeuta,
            this.observacion
            
        };return ar;
    }
}
