
package expedientesCli;

import java.sql.Date;
import java.util.Iterator;


public class SetGetPcontacto {   

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }


    private Integer id_persona;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String telefono;
    public Object [] toObjectArray1(){
        Object[] ar = new Object[]{
            this.id_persona,
            this.nombre,
            this.apellidoP
            


        };return ar;
    }
    public Object [] toObjectArray2(){
        Object[] ar = new Object[]{
            this.id_persona,
            this.nombre,
            this.especialidad

        };return ar;
    }
    public Object [] toObjectArray3(){
        Object[] ar = new Object[]{
            this.nombre,
            this.apellidoP

        };return ar;
    }
    public Object [] toObjectArray4(){
        Object[] ar = new Object[]{
            this.id_persona,
            this.nombre,
            this.apellidoP,
            this.especialidad

        };return ar;
    }
    
    public Object [] toObjectArray5(){
        Object[] ar = new Object[]{
            this.id_persona,
            this.nombre,
            this.apellidoP,
            this.especialidad

        };return ar;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    private String especialidad;

    public int getId_terapeuta() {
        return id_terapeuta;
    }

    public void setId_terapeuta(int id_terapeuta) {
        this.id_terapeuta = id_terapeuta;
    }

    public int getId_expediente_terapeuta() {
        return id_expediente_terapeuta;
    }

    public void setId_expediente_terapeuta(int id_expediente_terapeuta) {
        this.id_expediente_terapeuta = id_expediente_terapeuta;
    }
    private int id_terapeuta;
    private int id_expediente_terapeuta;
    
}
