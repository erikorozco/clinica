
package administracion;


public class SetGetTer {

    public int getId_terapeuta() {
        return id_terapeuta;
    }

    public void setId_terapeuta(int id_terapeuta) {
        this.id_terapeuta = id_terapeuta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apelllidom) {
        this.apellidom = apelllidom;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    private int id_terapeuta;
    private int id_usuario;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private String especialidad;
    private String contraseña;
    private String usuario;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String telefono;
    //private String
    public Object [] toObjectArray(){
        Object[] ar = new Object[]{
            this.id_usuario,
            this.nombre,
            this.apellidop,
            this.apellidom,
            this.especialidad,
            this.telefono,
            this.usuario,
            this.contraseña
        };return ar;
    }
    
    public Object[] toReducedObjectArray(){
        Object[] ar = new Object[]{
            this.id_terapeuta,
            this.nombre,
            this.apellidop
        };
        return ar;
    }
}
