
package expedientesCli;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Vector;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;



public class SetGetExp {

    public Integer getId_exp() {
        return id_exp;
    }

    public void setId_exp(Integer id_exp) {
        this.id_exp = id_exp;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDomicilo() {
        return domicilo;
    }

    public void setDomicilo(String domicilo) {
        this.domicilo = domicilo;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public boolean isPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(boolean primeraVez) {
        this.primeraVez = primeraVez;
    }

    public String getCuando() {
        return cuando;
    }

    public void setCuando(String cuando) {
        this.cuando = cuando;
    }

    public String getQuienDerivo() {
        return quienDerivo;
    }

    public void setQuienDerivo(String quienDerivo) {
        this.quienDerivo = quienDerivo;
    }
    public String getQuienLabora() {
        return quienLabora;
    }

    public void setQuienLabora(String quienLabora) {
        this.quienLabora = quienLabora;
    }

    public String getFuncionTrabajo() {
        return funcionTrabajo;
    }

    public void setFuncionTrabajo(String funcionTrabajo) {
        this.funcionTrabajo = funcionTrabajo;
    }

    public String getDesdeCuandoTra() {
        return desdeCuandoTra;
    }

    public void setDesdeCuandoTra(String desdeCuandoTra) {
        this.desdeCuandoTra = desdeCuandoTra;
    }

    public Integer getIngresoMes() {
        return ingresoMes;
    }

    public void setIngresoMes(Integer ingresoMes) {
        this.ingresoMes = ingresoMes;
    }

    public String getTiempoLaborando() {
        return tiempoLaborando;
    }

    public void setTiempoLaborando(String tiempoLaborando) {
        this.tiempoLaborando = tiempoLaborando;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public String getCantTiempoSituacion() {
        return cantTiempoSituacion;
    }

    public void setCantTiempoSituacion(String cantTiempoSituacion) {
        this.cantTiempoSituacion = cantTiempoSituacion;
    }

    public Integer getnDependientes() {
        return nDependientes;
    }

    public void setnDependientes(Integer nDependientes) {
        this.nDependientes = nDependientes;
    }

    public Integer getnPersonaIngresan() {
        return nPersonaIngresan;
    }

    public void setnPersonaIngresan(Integer nPersonaIngresan) {
        this.nPersonaIngresan = nPersonaIngresan;
    }

    public String getPosesionCasa() {
        return posesionCasa;
    }

    public void setPosesionCasa(String posesionCasa) {
        this.posesionCasa = posesionCasa;
    }

    public String getServiciosMedicos() {
        return serviciosMedicos;
    }

    public void setServiciosMedicos(String serviciosMedicos) {
        this.serviciosMedicos = serviciosMedicos;
    }

    public String getEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(String enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public String getExploracionClinica() {
        return exploracionClinica;
    }

    public void setExploracionClinica(String exploracionClinica) {
        this.exploracionClinica = exploracionClinica;
    }

    public String getAtencionRA() {
        return atencionRA;
    }

    public void setAtencionRA(String atencionRA) {
        this.atencionRA = atencionRA;
    }

    public String getnOcaiconesRA() {
        return nOcaiconesRA;
    }

    public void setnOcaiconesRA(String nOcaiconesRA) {
        this.nOcaiconesRA = nOcaiconesRA;
    }

    public String getLugraRA() {
        return lugraRA;
    }

    public void setLugraRA(String lugraRA) {
        this.lugraRA = lugraRA;
    }

    public boolean isTerminoRA() {
        return terminoRA;
    }

    public void setTerminoRA(boolean terminoRA) {
        this.terminoRA = terminoRA;
    }

    public String getMotivoTerminoRa() {
        return motivoTerminoRa;
    }

    public void setMotivoTerminoRa(String motivoTerminoRa) {
        this.motivoTerminoRa = motivoTerminoRa;
    }

    public boolean isEstaBajoTrata() {
        return estaBajoTrata;
    }

    public void setEstaBajoTrata(boolean estaBajoTrata) {
        this.estaBajoTrata = estaBajoTrata;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }


    public String getHigiene() {
        return higiene;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    public String getAlteracionesMarcha() {
        return alteracionesMarcha;
    }

    public void setAlteracionesMarcha(String alteracionesMarcha) {
        this.alteracionesMarcha = alteracionesMarcha;
    }

    public String getAlteracionesHabla() {
        return alteracionesHabla;
    }

    public void setAlteracionesHabla(String alteracionesHabla) {
        this.alteracionesHabla = alteracionesHabla;
    }

    public boolean isFuma() {
        return fuma;
    }

    public void setFuma(boolean fuma) {
        this.fuma = fuma;
    }

    public String getFrecFuma() {
        return frecFuma;
    }

    public void setFrecFuma(String frecFuma) {
        this.frecFuma = frecFuma;
    }

    public boolean isBebeAlcohol() {
        return bebeAlcohol;
    }

    public void setBebeAlcohol(boolean bebeAlcohol) {
        this.bebeAlcohol = bebeAlcohol;
    }

    public String getFrecAlcohol() {
        return FrecAlcohol;
    }

    public void setFrecAlcohol(String FrecAlcohol) {
        this.FrecAlcohol = FrecAlcohol;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public String getCualesDrogas() {
        return cualesDrogas;
    }

    public void setCualesDrogas(String cualesDrogas) {
        this.cualesDrogas = cualesDrogas;
    }

    public String getFrecDrogas() {
        return FrecDrogas;
    }

    public void setFrecDrogas(String FrecDrogas) {
        this.FrecDrogas = FrecDrogas;
    }

    public boolean isAlteracionesSueño() {
        return alteracionesSueño;
    }

    public void setAlteracionesSueño(boolean alteracionesSueño) {
        this.alteracionesSueño = alteracionesSueño;
    }

    public String getTipoAlteraionesSueño() {
        return tipoAlteraionesSueño;
    }

    public void setTipoAlteraionesSueño(String tipoAlteraionesSueño) {
        this.tipoAlteraionesSueño = tipoAlteraionesSueño;
    }

    public boolean isAlteracionesAlimenticias() {
        return alteracionesAlimenticias;
    }

    public void setAlteracionesAlimenticias(boolean alteracionesAlimenticias) {
        this.alteracionesAlimenticias = alteracionesAlimenticias;
    }

    public String getTipoAlteracionesAlim() {
        return tipoAlteracionesAlim;
    }

    public void setTipoAlteracionesAlim(String tipoAlteracionesAlim) {
        this.tipoAlteracionesAlim = tipoAlteracionesAlim;
    }

    public String getCambiosAnimo() {
        return cambiosAnimo;
    }

    public void setCambiosAnimo(String cambiosAnimo) {
        this.cambiosAnimo = cambiosAnimo;
    }

    public String getDesdeCuandoCA() {
        return desdeCuandoCA;
    }

    public void setDesdeCuandoCA(String desdeCuandoCA) {
        this.desdeCuandoCA = desdeCuandoCA;
    }

    public byte getGenograma() {
        return genograma;
    }

    public void setGenograma(byte genograma) {
        this.genograma = genograma;
    }

    public String getDiagPresuntivo() {
        return diagPresuntivo;
    }

    public void setDiagPresuntivo(String diagPresuntivo) {
        this.diagPresuntivo = diagPresuntivo;
    }

    public String getDerivadoA() {
        return derivadoA;
    }

    public void setDerivadoA(String derivadoA) {
        this.derivadoA = derivadoA;
    }

    public String getProQueAtendio() {
        return proQueAtendio;
    }

    public void setProQueAtendio(String proQueAtendio) {
        this.proQueAtendio = proQueAtendio;
    }   

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public byte getFirUsuario() {
        return firUsuario;
    }

    public void setFirUsuario(byte firUsuario) {
        this.firUsuario = firUsuario;
    }

    public byte getFirCoordinador() {
        return firCoordinador;
    }

    public void setFirCoordinador(byte firCoordinador) {
        this.firCoordinador = firCoordinador;
    }

    public boolean isSantecedentesPenales() {
        return SantecedentesPenales;
    }

    public void setSantecedentesPenales(boolean SantecedentesPenales) {
        this.SantecedentesPenales = SantecedentesPenales;
    }

    public String getAntecedentesPenales() {
        return AntecedentesPenales;
    }

    public void setAntecedentesPenales(String AntecedentesPenales) {
        this.AntecedentesPenales = AntecedentesPenales;
    }

    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    public String getTipoExp() {
        return tipoExp;
    }

    public void setTipoExp(String tipoExp) {
        this.tipoExp = tipoExp;
    }

    public Integer getId_terapeuta() {
        return id_terapeuta;
    }

    public void setId_terapeuta(Integer id_terapeuta) {
        this.id_terapeuta = id_terapeuta;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }
    private Integer id_exp;
    private String escolaridad;
    private Integer edad;
    private String sexo;
    private String ocupacion; 
    private String estadoCivil;
    private String religion;
    private String domicilo;
    private String parroquia;
    private String colonia;
    private String municipio;
    private boolean primeraVez;
    private String cuando;
    private String quienDerivo;

    public boolean isDisposicion() {
        return disposicion;
    }

    public void setDisposicion(boolean disposicion) {
        this.disposicion = disposicion;
    }
    private boolean disposicion; 

    public boolean isDependienteEc() {
        return dependienteEc;
    }

    public void setDependienteEc(boolean dependienteEc) {
        this.dependienteEc = dependienteEc;
    }
    private boolean dependienteEc;
    private String quienLabora;
    private String funcionTrabajo;
    private String desdeCuandoTra;
    private Integer ingresoMes;
    private String tiempoLaborando;
    private String estadoLaboral;
    private String cantTiempoSituacion;
    private Integer nDependientes;
    private Integer nPersonaIngresan;
    private String posesionCasa;
    private String serviciosMedicos;
    private String enfermedadCronica;
    private String exploracionClinica;
    private String atencionRA;
    private String nOcaiconesRA;
    private String lugraRA;
    private boolean terminoRA;
    private String motivoTerminoRa;
    private boolean estaBajoTrata;
    private String medicamentos;
    private double peso;
    private double talla;
    private double imc;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    private String higiene;
    private String alteracionesMarcha;
    private String alteracionesHabla;
    private boolean fuma;
    private String frecFuma;
    private boolean bebeAlcohol;
    private String FrecAlcohol;
    private boolean drogas;
    private String cualesDrogas;
    private String FrecDrogas;
    private boolean alteracionesSueño;
    private String tipoAlteraionesSueño;
    private boolean alteracionesAlimenticias;
    private String tipoAlteracionesAlim;
    private String cambiosAnimo;
    private String desdeCuandoCA;
    private byte genograma;
    private String diagPresuntivo;
    private String derivadoA;
    private String proQueAtendio;

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }
    private String cuota;
    private Date fechaCreacion;
    private byte firUsuario;
    private byte firCoordinador;
    private boolean SantecedentesPenales;
    private String AntecedentesPenales;
    private String estadoPaciente;
    private String tipoExp;
    private Integer id_terapeuta;
    private Integer id_persona;
    private String anotaciones;
    private String desdeCuandoAlterA;
    private String desdeCuandoAlterS;

    public String getTiempoEstadoLaboral() {
        return tiempoEstadoLaboral;
    }

    public void setTiempoEstadoLaboral(String tiempoEstadoLaboral) {
        this.tiempoEstadoLaboral = tiempoEstadoLaboral;
    }
    private String tiempoEstadoLaboral;

    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public String getDesdeCuandoAlterA() {
        return desdeCuandoAlterA;
    }

    public void setDesdeCuandoAlterA(String desdeCuandoAlterA) {
        this.desdeCuandoAlterA = desdeCuandoAlterA;
    }

    public String getDesdeCuandoAlterS() {
        return desdeCuandoAlterS;
    }

    public void setDesdeCuandoAlterS(String desdeCuandoAlterS) {
        this.desdeCuandoAlterS = desdeCuandoAlterS;
    }
    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    private Date nacimiento;

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }
    
    private FileInputStream imagen;

    public int getLongitug() {
        return longitug;
    }

    public void setLongitug(int longitug) {
        this.longitug = longitug;
    }
    private int longitug;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String nombre;
    public Object [] toObjectArray(){
        Object[] ar = new Object[]{        
            this.id_exp,
            this.nombre,
        };return ar;
    }
    public Object [] toObjectArray2(){
        Object[] ar = new Object[]{        
            this.id_exp,
            this.nombre,
            this.apellidos
        };return ar;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apillidos) {
        this.apellidos = apillidos;
    }
    private String apellidos;
    

    public String getDondeLabora() {
        return dondeLabora;
    }

    public void setDondeLabora(String dondeLabora) {
        this.dondeLabora = dondeLabora;
    }
    private String dondeLabora;

   private InputStream geno;

    public InputStream getGeno() {
        return geno;
    }

    public void setGeno(InputStream geno) {
        this.geno = geno;
    }
    
    
    
    
    
    
}
