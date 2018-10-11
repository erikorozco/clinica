package terapeuta;

import java.sql.Date;

public class Reporte {
    private Integer numExpediente;
    private Integer numSesion;
    private Date cita;
    private String tipoDeServicio;
    private String nombreDelPaciente;
    private String apertura;
    private String desarrollo;
    private String acuerdos;
    private String avances;
    private Date proximaCita;
    private String profesional;
    private int identificadorPersona;
    private int id_sesion;
    
    public int getNumExpediente(){
        return this.numExpediente;
    }
    
    public int getNumSesion(){
        return this.numSesion;
    }
    public int getId_sesion() {
        return id_sesion;
    }

    public void setId_sesion(int id_sesion) {
        this.id_sesion = id_sesion;
    }
    
    
    
    public int getIdentificadorPersona() {
        return identificadorPersona;
    }

    public void setIdentificadorPersona(int identificadorPersona) {
        this.identificadorPersona = identificadorPersona;
    }
	
    public Integer obtenerNumExpediente() {
            return numExpediente;
    }

    public void ingresarNumExpediente(Integer numExpediente) {
            this.numExpediente = numExpediente;
    }

    public Integer obtenerNumSesion() {
            return numSesion;
    }

    public void ingresarNumSesion(Integer numSesion) {
            this.numSesion = numSesion;
    }

    public Date obtenerCita() {
            return cita;
    }

    public void ingresarCita(Date fecha) {
            this.cita = fecha;
    }

    public String obtenerTipoDeServicio() {
            return tipoDeServicio;
    }

    public void ingresarTipoDeServicio(String tipoDeServicio) {
            this.tipoDeServicio = tipoDeServicio;
    }

    public String obtenerNombreDelPaciente() {
            return nombreDelPaciente;
    }

    public void ingresarNombreDelPaciente(String nombreDelPaciente) {
            this.nombreDelPaciente = nombreDelPaciente;
    }

    public String obtenerApertura() {
            return apertura;
    }

    public void ingresarApertura(String apertura) {
            this.apertura = apertura;
    }

    public String obtenerDesarrollo() {
            return desarrollo;
    }

    public void ingresarDesarrollo(String desarrollo) {
            this.desarrollo = desarrollo;
    }

    public String obtenerAcuerdos() {
            return acuerdos;
    }

    public void ingresarAcuerdos(String acuerdos) {
            this.acuerdos = acuerdos;
    }

    public String obtenerAvances() {
            return avances;
    }

    public void ingresarAvances(String avances) {
            this.avances = avances;
    }

    public Date obtenerProximaCita() {
            return proximaCita;
    }

    public void ingresarProximaCita(Date proximaCita) {
            this.proximaCita = proximaCita;
    }

    public String obtenerProfesional() {
            return profesional;
    }

    public void ingresarProfesional(String profesional) {
            this.profesional = profesional;
    }

    public Object[] obtenerValores() {
        Object[] valores = new Object[]{this.id_sesion, this.numExpediente, this.nombreDelPaciente, this.numSesion, this.cita, this.tipoDeServicio};
        return valores;
    }
}
