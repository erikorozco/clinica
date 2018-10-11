
package backend;
import java.io.FileInputStream;
import expedientesCli.SetGetExp;


import java.util.Vector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import expedientesCli.SetGetPcontacto;
import expedientesCli.nexpediente;

public class expedienteDAO {
    private String url = "jdbc:postgresql://192.168.1.100/Aplicacion";
    private String sql;
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;
    public FileInputStream fis;
    public int longitud;
    
    private void conectar() throws ClassNotFoundException, SQLException{//public class recepcionDAO {

        Class.forName("org.postgresql.Driver");
        this.con = DriverManager.getConnection(this.url, "postgres", "$@Lud1n73gral");
        this.pstm = con.prepareStatement(this.sql);
    }
private void cerrarConexion(){//cerrar conexion de las base de datos
        try{
            if(rs != null) rs.close();
            if(pstm != null) pstm.close();
            if(con != null) con.close();
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }        
   
    public void modificarPersonaBoton(Collection<SetGetPcontacto> persona){//modifica cualquier fato personal de primer contacto en boton
        SetGetPcontacto per=new SetGetPcontacto();
        try{            
            this.sql="UPDATE persona\n" +
                    "   SET  nombre=?, apellidop=?, apellidom=?, telefono=?\n" +
                    " WHERE id_persona=?";
            this.conectar();
            
            Iterator<SetGetPcontacto> it=persona.iterator();
            SetGetPcontacto r;
            if(it.hasNext()){
                r=(SetGetPcontacto)it.next();
                this.pstm.setString(1, r.getNombre());
                this.pstm.setString(2, r.getApellidoP());
                this.pstm.setString(3, r.getApellidoM());
                this.pstm.setString(4, r.getTelefono());
                this.pstm.setInt(5, r.getId_persona());
                this.pstm.execute();
            }
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public boolean verificarTerapeutaAsignado(int idter, int idexp){//verificar si ya existe una cita a determinada hora para pacientes registardos
        try{
            this.sql="select * from expediente_terapeuta where id_terapeuta = ? and id_expediente = ?";
            this.conectar();            
            pstm.setInt(2, idexp);
            pstm.setInt(1, idter);
            this.rs = this.pstm.executeQuery();
            if(rs.next())
                return true;
            else
               return false; 
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public boolean verificarPersonaExpediente(int id_per){//verificar si ya existe un expediente con ese nombre de persona
        try{
            this.sql="select id_persona from expediente where id_persona = ?";
            this.conectar();            
            pstm.setInt(1, id_per);
            this.rs = this.pstm.executeQuery();
            if(rs.next())
                return true;
            else
               return false; 
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    
    public void eliminarAsignacion(Integer id){//elimina una cita de un expediente
        try{            
                    this.sql="DELETE FROM expediente_terapeuta\n" +
                            " WHERE id_expediente_terapeuta=?";
            this.conectar();
            this.pstm.setInt(1, id);
            this.pstm.execute();
            }
        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }

     
     public void modificarExpedienteGeno(Collection<SetGetExp> agenda, int id){//modifica cualquier dato del expediente SI se modifica genograma     
        try{            
            this.sql="UPDATE expediente\n" +
"   SET  escolaridad=?, edad=?, sexo=?, ocupacion=?, \n" +
"       \"estadoCivil\"=?, religion=?, domicilio=?, parroquia=?, colonia=?, \n" +
"       municipio=?, \"primeraVez\"=?, cuando=?, \"quienDerivo\"=?, \"disposicionParaConsulta\"=?, \n" +
"       \"dependienteEconomico\"=?, \"quienLabora\"=?, \"funEnTrabajo\"=?, \n" +
"       \"DesdeCuando\"=?, \"ingresoAlMes\"=?, \"estadoLaboral\"=?, \"nDependientes\"=?, \n" +
"       \"nPersonasQueIngresan\"=?, \"posesionDeCasa\"=?, \"serviciosMedicos\"=?, \n" +
"       \"enfermedadCronica\"=?, \"exploracionClinica\"=?, \"atencionRA\"=?, \n" +
"       \"lugarRA\"=?, \"terminoTratamientoRA\"=?, \"motivoTerminoRA\"=?, \"estaBajoTratamiento\"=?, \n" +
"       medicamentos=?, peso=?, talla=?, imc=?, higiene=?, \"alteracionesEnMarcha\"=?, \n" +
"       \"alteracionesEnHabla\"=?, fuma=?, \"frecFuma\"=?, \"bebeAlcohol\"=?, \n" +
"       \"frecBebeAlcohol\"=?, \"otrasDrogas\"=?, \"cualesDrogas\"=?, \"frecDrogas\"=?, \n" +
"       \"alteracionesSueño\"=?, \"tipoAlteracionesS\"=?, \"alteracionesAlimenticias\"=?, \n" +
"       \"tipoAlteracionesA\"=?, \"cambiosDeAnimo\"=?, \"desdeCuandoCA\"=?, \n" +
"       \"diagPresuntivo\"=?, \"derivadoA\"=?, \"proQueAtiendo\"=?, cuota=?, \n" +
"       id_persona=?, \"antecedentesPenales\"=?, \n" +
"       \"cualesAntecedentes\"=?, \"estadoPaciente\"=?, \"tipoExpediente\"=?, \n" +
"       nacimiento=?, anotaciones=?, \"desdeCuandoAlterA\"=?, \"desdeCuandoAlterS\"=?, \n" +
"       \"tiempoLaborando\"=?, \"nOcacionesRA\"=?, \"tiempoEstadoLaboral\"=?, \n" +
"        \"dondeLabora\"=?,\"genograma\"=?"+
        " WHERE id_expediente="+id+"";
            this.conectar();
            Iterator<SetGetExp> it=agenda.iterator();
            SetGetExp m;
            if(it.hasNext()){
                m=(SetGetExp)it.next();
                    pstm.setString(1, m.getEscolaridad());
                pstm.setInt(2,m.getEdad());
                pstm.setString(3, m.getSexo());
                pstm.setString(4, m.getOcupacion());
                pstm.setString(5, m.getEstadoCivil());
                pstm.setString(6, m.getReligion());
                pstm.setString(7, m.getDomicilo());
                pstm.setString(8, m.getParroquia());
                pstm.setString(9, m.getColonia());
                pstm.setString(10, m.getMunicipio());
                pstm.setBoolean(11, m.isPrimeraVez());
                pstm.setString(12, m.getCuando());
                pstm.setString(13, m.getQuienDerivo());
                pstm.setBoolean(14, m.isDisposicion());
                pstm.setBoolean(15, m.isDependienteEc());
                pstm.setString(16, m.getQuienLabora());
                pstm.setString(17, m.getFuncionTrabajo());
                pstm.setString(18,m.getDesdeCuandoTra());
       /*-*/    pstm.setDouble(19, m.getIngresoMes());
                pstm.setString(65, m.getTiempoLaborando());
                
                pstm.setString(20, m.getEstadoLaboral());
                //pstm.setString(67, m.getCantTiempoSituacion());
                pstm.setInt(21, m.getnDependientes());
                pstm.setInt(22, m.getnPersonaIngresan());
                pstm.setString(23, m.getPosesionCasa());
                pstm.setString(24, m.getServiciosMedicos());
                pstm.setString(25, m.getEnfermedadCronica());
                pstm.setString(26, m.getExploracionClinica());
                pstm.setString(27, m.getAtencionRA());
                pstm.setString(66, m.getnOcaiconesRA());
                pstm.setString(28, m.getLugraRA());
                pstm.setBoolean(29, m.isTerminoRA());
                pstm.setString(30, m.getMotivoTerminoRa());
                pstm.setBoolean(31, m.isEstaBajoTrata());
                pstm.setString(32, m.getMedicamentos());
                pstm.setDouble(33, m.getPeso());
                pstm.setDouble(34, m.getTalla());
                pstm.setDouble(35, m.getImc());
                pstm.setString(36, m.getHigiene());
                pstm.setString(37, m.getAlteracionesMarcha());
                pstm.setString(38, m.getAlteracionesHabla());
                pstm.setBoolean(39, m.isFuma());
                pstm.setString(40, m.getFrecFuma());
                pstm.setBoolean(41, m.isBebeAlcohol());
                pstm.setString(42, m.getFrecAlcohol());
                pstm.setBoolean(43, m.isDrogas());
                pstm.setString(44, m.getCualesDrogas());
                pstm.setString(45, m.getFrecDrogas());
                pstm.setBoolean(46, m.isAlteracionesSueño());
                pstm.setString(47, m.getTipoAlteraionesSueño());
                pstm.setBoolean(48, m.isAlteracionesAlimenticias());
                pstm.setString(49, m.getTipoAlteracionesAlim());
      /**/      pstm.setString(50, m.getCambiosAnimo());
                pstm.setString(51, m.getDesdeCuandoCA());              
                pstm.setBinaryStream(69, m.getImagen(), m.getLongitug());
                pstm.setString(52, m.getDiagPresuntivo());                
                pstm.setString(53, m.getDerivadoA());
                pstm.setString(54, m.getProQueAtendio());
                pstm.setString(55, m.getCuota());
                //pstm.setInt(56, m.getId_terapeuta());
                pstm.setInt(56, m.getId_persona());
                //pstm.setDate(58,m.getFechaCreacion());
                pstm.setBoolean(57, m.isSantecedentesPenales());
                pstm.setString(58, m.getAntecedentesPenales());
                pstm.setString(59, m.getEstadoPaciente());
                pstm.setString(60, m.getTipoExp());
                pstm.setDate(61, m.getNacimiento());
                pstm.setString(62, m.getAnotaciones());
                pstm.setString(63, m.getDesdeCuandoAlterA());
                pstm.setString(64, m.getDesdeCuandoAlterS());
                pstm.setString(67, m.getTiempoEstadoLaboral());
                pstm.setString(68, m.getDondeLabora());
                this.pstm.execute();
            }
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
     public void modificarExpedienteNoGeno(Collection<SetGetExp> agenda, int id){//modifica cualquier dato del expediente NO se modifica genograma     
        try{            
            this.sql="UPDATE expediente\n" +
"   SET  escolaridad=?, edad=?, sexo=?, ocupacion=?, \n" +
"       \"estadoCivil\"=?, religion=?, domicilio=?, parroquia=?, colonia=?, \n" +
"       municipio=?, \"primeraVez\"=?, cuando=?, \"quienDerivo\"=?, \"disposicionParaConsulta\"=?, \n" +
"       \"dependienteEconomico\"=?, \"quienLabora\"=?, \"funEnTrabajo\"=?, \n" +
"       \"DesdeCuando\"=?, \"ingresoAlMes\"=?, \"estadoLaboral\"=?, \"nDependientes\"=?, \n" +
"       \"nPersonasQueIngresan\"=?, \"posesionDeCasa\"=?, \"serviciosMedicos\"=?, \n" +
"       \"enfermedadCronica\"=?, \"exploracionClinica\"=?, \"atencionRA\"=?, \n" +
"       \"lugarRA\"=?, \"terminoTratamientoRA\"=?, \"motivoTerminoRA\"=?, \"estaBajoTratamiento\"=?, \n" +
"       medicamentos=?, peso=?, talla=?, imc=?, higiene=?, \"alteracionesEnMarcha\"=?, \n" +
"       \"alteracionesEnHabla\"=?, fuma=?, \"frecFuma\"=?, \"bebeAlcohol\"=?, \n" +
"       \"frecBebeAlcohol\"=?, \"otrasDrogas\"=?, \"cualesDrogas\"=?, \"frecDrogas\"=?, \n" +
"       \"alteracionesSueño\"=?, \"tipoAlteracionesS\"=?, \"alteracionesAlimenticias\"=?, \n" +
"       \"tipoAlteracionesA\"=?, \"cambiosDeAnimo\"=?, \"desdeCuandoCA\"=?, \n" +
"       \"diagPresuntivo\"=?, \"derivadoA\"=?, \"proQueAtiendo\"=?, cuota=?, \n" +
"       id_persona=?, \"antecedentesPenales\"=?, \n" +
"       \"cualesAntecedentes\"=?, \"estadoPaciente\"=?, \"tipoExpediente\"=?, \n" +
"       nacimiento=?, anotaciones=?, \"desdeCuandoAlterA\"=?, \"desdeCuandoAlterS\"=?, \n" +
"       \"tiempoLaborando\"=?, \"nOcacionesRA\"=?, \"tiempoEstadoLaboral\"=?, \n" +
"        \"dondeLabora\"=?"+
        " WHERE id_expediente="+id+"";
            this.conectar();
            Iterator<SetGetExp> it=agenda.iterator();
            SetGetExp m;
            if(it.hasNext()){
                m=(SetGetExp)it.next();
                    pstm.setString(1, m.getEscolaridad());
                pstm.setInt(2,m.getEdad());
                pstm.setString(3, m.getSexo());
                pstm.setString(4, m.getOcupacion());
                pstm.setString(5, m.getEstadoCivil());
                pstm.setString(6, m.getReligion());
                pstm.setString(7, m.getDomicilo());
                pstm.setString(8, m.getParroquia());
                pstm.setString(9, m.getColonia());
                pstm.setString(10, m.getMunicipio());
                pstm.setBoolean(11, m.isPrimeraVez());
                pstm.setString(12, m.getCuando());
                pstm.setString(13, m.getQuienDerivo());
                pstm.setBoolean(14, m.isDisposicion());
                pstm.setBoolean(15, m.isDependienteEc());
                pstm.setString(16, m.getQuienLabora());
                pstm.setString(17, m.getFuncionTrabajo());
                pstm.setString(18,m.getDesdeCuandoTra());
       /*-*/    pstm.setDouble(19, m.getIngresoMes());
                pstm.setString(65, m.getTiempoLaborando());
                
                pstm.setString(20, m.getEstadoLaboral());
                //pstm.setString(67, m.getCantTiempoSituacion());
                pstm.setInt(21, m.getnDependientes());
                pstm.setInt(22, m.getnPersonaIngresan());
                pstm.setString(23, m.getPosesionCasa());
                pstm.setString(24, m.getServiciosMedicos());
                pstm.setString(25, m.getEnfermedadCronica());
                pstm.setString(26, m.getExploracionClinica());
                pstm.setString(27, m.getAtencionRA());
                pstm.setString(66, m.getnOcaiconesRA());
                pstm.setString(28, m.getLugraRA());
                pstm.setBoolean(29, m.isTerminoRA());
                pstm.setString(30, m.getMotivoTerminoRa());
                pstm.setBoolean(31, m.isEstaBajoTrata());
                pstm.setString(32, m.getMedicamentos());
                pstm.setDouble(33, m.getPeso());
                pstm.setDouble(34, m.getTalla());
                pstm.setDouble(35, m.getImc());
                pstm.setString(36, m.getHigiene());
                pstm.setString(37, m.getAlteracionesMarcha());
                pstm.setString(38, m.getAlteracionesHabla());
                pstm.setBoolean(39, m.isFuma());
                pstm.setString(40, m.getFrecFuma());
                pstm.setBoolean(41, m.isBebeAlcohol());
                pstm.setString(42, m.getFrecAlcohol());
                pstm.setBoolean(43, m.isDrogas());
                pstm.setString(44, m.getCualesDrogas());
                pstm.setString(45, m.getFrecDrogas());
                pstm.setBoolean(46, m.isAlteracionesSueño());
                pstm.setString(47, m.getTipoAlteraionesSueño());
                pstm.setBoolean(48, m.isAlteracionesAlimenticias());
                pstm.setString(49, m.getTipoAlteracionesAlim());
      /**/      pstm.setString(50, m.getCambiosAnimo());
                pstm.setString(51, m.getDesdeCuandoCA());              
                //pstm.setBinaryStream(69, m.getImagen(), m.getLongitug());
                pstm.setString(52, m.getDiagPresuntivo());                
                pstm.setString(53, m.getDerivadoA());
                pstm.setString(54, m.getProQueAtendio());
                pstm.setString(55, m.getCuota());
                //pstm.setInt(56, m.getId_terapeuta());
                pstm.setInt(56, m.getId_persona());
                //pstm.setDate(58,m.getFechaCreacion());
                pstm.setBoolean(57, m.isSantecedentesPenales());
                pstm.setString(58, m.getAntecedentesPenales());
                pstm.setString(59, m.getEstadoPaciente());
                pstm.setString(60, m.getTipoExp());
                pstm.setDate(61, m.getNacimiento());
                pstm.setString(62, m.getAnotaciones());
                pstm.setString(63, m.getDesdeCuandoAlterA());
                pstm.setString(64, m.getDesdeCuandoAlterS());
                pstm.setString(67, m.getTiempoEstadoLaboral());
                pstm.setString(68, m.getDondeLabora());
                this.pstm.execute();
            }
        }
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetExp> buscarExp(int id){//filtra personas a la hora que se quiere agregar un expediente
        SetGetExp persona=new SetGetExp();      
        try{
        SetGetExp dato;
        Vector<SetGetExp> vr = new Vector<>();
        this.sql="select expediente.id_expediente, persona.nombre, persona.apellidop from expediente inner join persona on\n" +
                "expediente.id_persona= persona.id_persona where id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetExp();
            dato.setNombre(rs.getString("nombre").concat(" ".concat(rs.getString("apellidop"))));
            dato.setId_exp(rs.getInt("id_expediente"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetExp> buscarExpaAsignar(int id){//filtra los expedientes a  la hora que se requieres asignar terapeutas
        //SetGetExp persona=new SetGetExp();      
        try{
        SetGetExp dato;
        Vector<SetGetExp> vr = new Vector<>();
        this.sql="select expediente.id_expediente, persona.nombre, persona.apellidop, persona.apellidom from expediente inner join persona on\n" +
"                expediente.id_persona= persona.id_persona where id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetExp();
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidos(rs.getString("apellidop").concat(" ").concat(rs.getString("apellidom")));
            dato.setId_exp(rs.getInt("id_expediente"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public int buscarExpRepetido(int id){//devuelve el numero de expediente que ya tiene una persona      
        try{
        SetGetExp dato = null;
        Vector<SetGetExp> vr = new Vector<>();
        this.sql="select id_expediente from expediente where id_persona =? ";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetExp();
            dato.setId_exp(rs.getInt("id_expediente"));           
            vr.add(dato);
        }
        return dato.getId_exp();
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetPcontacto> buscarTerapeutasAsig(String nombre){//filtra los terapeutas para asignar terapeutas
        //SetGetExp persona=new SetGetExp();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="select * from terapeuta where nombret like '%" + nombre + "%'";
        this.conectar();
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setNombre(rs.getString("nombret"));
            dato.setApellidoP(rs.getString("apellidopt").concat(" ").concat(rs.getString("apellidomt")));
            dato.setId_persona(rs.getInt("id_terapeuta"));
            dato.setEspecialidad(rs.getString("especialidad"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public  void asignarTerapeuta(Collection<SetGetPcontacto> persona){//guarda una nueva persona        
        try{
                    this.sql="INSERT INTO expediente_terapeuta(\n" +
        "            id_expediente, id_terapeuta)\n" +
        "    VALUES (?, ?);";
            this.conectar();
            Iterator<SetGetPcontacto> it = persona.iterator();
            SetGetPcontacto m;
            
            if(it.hasNext()){
                m = (SetGetPcontacto)it.next();
                pstm.setInt(1, m.getId_persona());
                pstm.setInt(2, m.getId_terapeuta());               
               pstm.execute();          
            }          
        }        
        catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            this.cerrarConexion();
        }              
    }
    public Vector<SetGetPcontacto> buscarTerapeutasAsignados(int exp){//filtra los terapeutas asignados a un expediente
        //SetGetExp persona=new SetGetExp();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="select expediente_terapeuta.id_expediente_terapeuta, terapeuta.nombret, terapeuta.apellidopt, "
                + "terapeuta.apellidomt, "
                + "terapeuta.especialidad from expediente_terapeuta\n" +
                "inner join terapeuta on expediente_terapeuta.id_terapeuta = terapeuta.id_terapeuta where "
                + "expediente_terapeuta.id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, exp);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_expediente_terapeuta"));
            dato.setNombre(rs.getString("nombret"));
            dato.setApellidoP(rs.getString("apellidopt").concat(" ").concat(rs.getString("apellidomt")));
            dato.setEspecialidad(rs.getString("especialidad"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetExp> cargarModificaExp(int id){
        //SetGetExp persona=new SetGetExp();      
        try{
            
        SetGetExp dato;
        Vector<SetGetExp> vr = new Vector<>();
                this.sql="SELECT escolaridad, edad, sexo, ocupacion, \"estadoCivil\", \n" +
        "       religion, domicilio, parroquia, colonia, municipio, \"primeraVez\", \n" +
        "       cuando, \"quienDerivo\", \"disposicionParaConsulta\", \"dependienteEconomico\", \n" +
        "       \"quienLabora\", \"funEnTrabajo\", \"DesdeCuando\", \"ingresoAlMes\", \n" +
        "       \"estadoLaboral\", \"nDependientes\", \"nPersonasQueIngresan\", \"posesionDeCasa\", \n" +
        "       \"serviciosMedicos\", \"enfermedadCronica\", \"exploracionClinica\", \n" +
        "       \"atencionRA\", \"lugarRA\", \"terminoTratamientoRA\", \"motivoTerminoRA\", \n" +
        "       \"estaBajoTratamiento\", medicamentos, peso, talla, imc, higiene, \n" +
        "       \"alteracionesEnMarcha\", \"alteracionesEnHabla\", fuma, \"frecFuma\", \n" +
        "       \"bebeAlcohol\", \"frecBebeAlcohol\", \"otrasDrogas\", \"cualesDrogas\", \n" +
        "       \"frecDrogas\", \"alteracionesSueño\", \"tipoAlteracionesS\", \"alteracionesAlimenticias\", \n" +
        "       \"tipoAlteracionesA\", \"cambiosDeAnimo\", \"desdeCuandoCA\", \"diagPresuntivo\", \n" +
        "       \"derivadoA\", \"proQueAtiendo\", cuota,id_persona, \n" +
        "       fecha_creacion, \"antecedentesPenales\", \"cualesAntecedentes\", \n" +
        "       \"estadoPaciente\", \"tipoExpediente\", nacimiento, anotaciones, \n" +
        "       \"desdeCuandoAlterA\", \"desdeCuandoAlterS\", \"tiempoLaborando\", \n" +
        "       \"nOcacionesRA\", \"tiempoEstadoLaboral\",\"dondeLabora\",\"genograma\"\n" +
        "  FROM expediente where id_expediente=?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetExp();
            dato.setGeno(rs.getBinaryStream("genograma"));
            dato.setEscolaridad(rs.getString("escolaridad"));
            dato.setEdad(rs.getInt("edad"));
            dato.setSexo(rs.getString("sexo"));
            dato.setOcupacion(rs.getString("ocupacion"));
            dato.setEstadoCivil(rs.getString("estadoCivil"));
            dato.setReligion(rs.getString("religion"));
            dato.setDomicilo(rs.getString("domicilio"));
            dato.setParroquia(rs.getString("parroquia"));
            dato.setColonia(rs.getString("colonia"));
            dato.setMunicipio(rs.getString("municipio"));
            dato.setPrimeraVez(rs.getBoolean("primeraVez"));
            dato.setCuando(rs.getString("cuando"));
            dato.setQuienDerivo(rs.getString("quienDerivo"));
            dato.setDisposicion(rs.getBoolean("disposicionParaConsulta"));
            dato.setDependienteEc(rs.getBoolean("dependienteEconomico"));
            dato.setQuienLabora(rs.getString("quienLabora"));
            dato.setFuncionTrabajo(rs.getString("funEnTrabajo"));
            dato.setDesdeCuandoTra(rs.getString("DesdeCuando"));
            dato.setIngresoMes(rs.getInt("ingresoAlMes"));
            dato.setEstadoLaboral(rs.getString("estadoLaboral"));
            dato.setnDependientes(rs.getInt("nDependientes"));
            dato.setnPersonaIngresan(rs.getInt("nPersonasQueIngresan"));
            dato.setPosesionCasa(rs.getString("posesionDeCasa"));
            dato.setServiciosMedicos(rs.getString("serviciosMedicos"));
            dato.setEnfermedadCronica(rs.getString("enfermedadCronica"));
            dato.setExploracionClinica(rs.getString("exploracionClinica"));
            dato.setAtencionRA(rs.getString("atencionRA"));
            dato.setLugraRA(rs.getString("lugarRA"));
            dato.setTerminoRA(rs.getBoolean("terminoTratamientoRA"));
            dato.setMotivoTerminoRa(rs.getString("motivoTerminoRA"));
            dato.setEstaBajoTrata(rs.getBoolean("estaBajoTratamiento"));
            dato.setMedicamentos(rs.getString("medicamentos"));
            dato.setPeso(rs.getDouble("peso"));
            dato.setTalla(rs.getDouble("talla"));
            dato.setImc(rs.getDouble("imc"));
            dato.setHigiene(rs.getString("higiene"));
            dato.setAlteracionesMarcha(rs.getString("alteracionesEnMarcha"));
            dato.setAlteracionesHabla(rs.getString("alteracionesEnHabla"));
            dato.setFuma(rs.getBoolean("fuma"));
            dato.setFrecFuma(rs.getString("frecFuma"));
            dato.setBebeAlcohol(rs.getBoolean("bebeAlcohol"));
            dato.setFrecAlcohol(rs.getString("frecBebeAlcohol"));
            dato.setDrogas(rs.getBoolean("otrasDrogas"));
            dato.setCualesDrogas(rs.getString("cualesDrogas"));
            dato.setFrecDrogas(rs.getString("frecDrogas"));
            dato.setAlteracionesSueño(rs.getBoolean("alteracionesSueño"));
            dato.setTipoAlteraionesSueño(rs.getString("tipoAlteracionesS"));
            dato.setAlteracionesAlimenticias(rs.getBoolean("alteracionesAlimenticias"));
            dato.setTipoAlteracionesAlim(rs.getString("tipoAlteracionesA"));
            dato.setCambiosAnimo(rs.getString("cambiosDeAnimo"));
            dato.setDesdeCuandoCA(rs.getString("desdeCuandoCA"));
            dato.setDiagPresuntivo(rs.getString("diagPresuntivo"));
            dato.setDerivadoA(rs.getString("derivadoA"));
            dato.setProQueAtendio(rs.getString("proQueAtiendo"));
            dato.setCuota(rs.getString("cuota"));
            //dato.setId_terapeuta(rs.getInt("id_terapeuta"));
            dato.setId_persona(rs.getInt("id_persona"));
            dato.setFechaCreacion(rs.getDate("fecha_creacion"));
            dato.setSantecedentesPenales(rs.getBoolean("antecedentesPenales"));
            dato.setAntecedentesPenales(rs.getString("cualesAntecedentes"));
            dato.setEstadoPaciente(rs.getString("estadoPaciente"));
            dato.setTipoExp(rs.getString("tipoExpediente"));
            dato.setNacimiento(rs.getDate("nacimiento"));
            dato.setAnotaciones(rs.getString("anotaciones"));
            dato.setDesdeCuandoAlterA(rs.getString("desdeCuandoAlterA"));
            dato.setDesdeCuandoAlterS(rs.getString("desdeCuandoAlterS"));
            dato.setTiempoLaborando(rs.getString("tiempoLaborando"));
            dato.setnOcaiconesRA(rs.getString("nOcacionesRA"));
            dato.setTiempoEstadoLaboral(rs.getString("tiempoEstadoLaboral"));
            dato.setDondeLabora(rs.getString("dondeLabora"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
        
    }
    public Integer guardarExpediente(Collection<SetGetExp> expediente){//guarda expediente de una persona
        
        try{
                    this.sql="INSERT INTO expediente(\n" +
        "            escolaridad, edad, sexo, ocupacion, \"estadoCivil\", \n" +
        "            religion, domicilio, parroquia, colonia, municipio, \"primeraVez\", \n" +
        "            cuando, \"quienDerivo\", \"disposicionParaConsulta\", \"dependienteEconomico\", \n" +
        "            \"quienLabora\", \"funEnTrabajo\", \"DesdeCuando\", \"ingresoAlMes\", \n" +
        "            \"estadoLaboral\", \"nDependientes\", \"nPersonasQueIngresan\", \"posesionDeCasa\", \n" +
        "            \"serviciosMedicos\", \"enfermedadCronica\", \"exploracionClinica\", \n" +
        "            \"atencionRA\", \"lugarRA\", \"terminoTratamientoRA\", \"motivoTerminoRA\", \n" +
        "            \"estaBajoTratamiento\", medicamentos, peso, talla, imc, higiene, \n" +
        "            \"alteracionesEnMarcha\", \"alteracionesEnHabla\", fuma, \"frecFuma\", \n" +
        "            \"bebeAlcohol\", \"frecBebeAlcohol\", \"otrasDrogas\", \"cualesDrogas\", \n" +
        "            \"frecDrogas\", \"alteracionesSueño\", \"tipoAlteracionesS\", \"alteracionesAlimenticias\", \n" +
        "            \"tipoAlteracionesA\", \"cambiosDeAnimo\", \"desdeCuandoCA\", \"diagPresuntivo\", \n" +
        "            \"derivadoA\", \"proQueAtiendo\", cuota, id_persona, \n" +
        "            fecha_creacion, \"antecedentesPenales\", \"cualesAntecedentes\", \n" +
        "            \"estadoPaciente\", \"tipoExpediente\", nacimiento, anotaciones, \n" +
        "            \"desdeCuandoAlterA\", \"desdeCuandoAlterS\", \"tiempoLaborando\", \n" +
        "            \"nOcacionesRA\", \"tiempoEstadoLaboral\", genograma, \"dondeLabora\")\n" +
        "    VALUES (?, ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, ?, ?, \n" +
        "            ?, ?, ?, \n" +
        "            ?, ?, ?, ?, \n" +
        "            ?, ?, ?, \n" +
        "            ?, ?, ?) RETURNING id_expediente";
            this.conectar();
            Iterator<SetGetExp> it =expediente.iterator();
            SetGetExp m;
            int nuevoID=0;
            while(it.hasNext()){
                m=(SetGetExp)it.next();
                pstm.setString(1, m.getEscolaridad());
                pstm.setInt(2,m.getEdad());
                pstm.setString(3, m.getSexo());
                pstm.setString(4, m.getOcupacion());
                pstm.setString(5, m.getEstadoCivil());
                pstm.setString(6, m.getReligion());
                pstm.setString(7, m.getDomicilo());
                pstm.setString(8, m.getParroquia());
                pstm.setString(9, m.getColonia());
                pstm.setString(10, m.getMunicipio());
                pstm.setBoolean(11, m.isPrimeraVez());
                pstm.setString(12, m.getCuando());
                pstm.setString(13, m.getQuienDerivo());
                pstm.setBoolean(14, m.isDisposicion());
                pstm.setBoolean(15, m.isDependienteEc());
                pstm.setString(16, m.getQuienLabora());
                pstm.setString(17, m.getFuncionTrabajo());
                pstm.setString(18,m.getDesdeCuandoTra());
       /*-*/    pstm.setDouble(19, m.getIngresoMes());
                pstm.setString(66, m.getTiempoLaborando());
                pstm.setString(20, m.getEstadoLaboral());
                //pstm.setString(67, m.getCantTiempoSituacion());
                pstm.setInt(21, m.getnDependientes());
                pstm.setInt(22, m.getnPersonaIngresan());
                pstm.setString(23, m.getPosesionCasa());
                pstm.setString(24, m.getServiciosMedicos());
                pstm.setString(25, m.getEnfermedadCronica());
                pstm.setString(26, m.getExploracionClinica());
                pstm.setString(27, m.getAtencionRA());
                pstm.setString(67, m.getnOcaiconesRA());
                pstm.setString(28, m.getLugraRA());
                pstm.setBoolean(29, m.isTerminoRA());
                pstm.setString(30, m.getMotivoTerminoRa());
                pstm.setBoolean(31, m.isEstaBajoTrata());
                pstm.setString(32, m.getMedicamentos());
                pstm.setDouble(33, m.getPeso());
                pstm.setDouble(34, m.getTalla());
                pstm.setDouble(35, m.getImc());
                pstm.setString(36, m.getHigiene());
                pstm.setString(37, m.getAlteracionesMarcha());
                pstm.setString(38, m.getAlteracionesHabla());
                pstm.setBoolean(39, m.isFuma());
                pstm.setString(40, m.getFrecFuma());
                pstm.setBoolean(41, m.isBebeAlcohol());
                pstm.setString(42, m.getFrecAlcohol());
                pstm.setBoolean(43, m.isDrogas());
                pstm.setString(44, m.getCualesDrogas());
                pstm.setString(45, m.getFrecDrogas());
                pstm.setBoolean(46, m.isAlteracionesSueño());
                pstm.setString(47, m.getTipoAlteraionesSueño());
                pstm.setBoolean(48, m.isAlteracionesAlimenticias());
                pstm.setString(49, m.getTipoAlteracionesAlim());
      /**/      pstm.setString(50, m.getCambiosAnimo());
                pstm.setString(51, m.getDesdeCuandoCA());
                pstm.setBinaryStream(69, m.getImagen(), m.getLongitug());
                pstm.setString(52, m.getDiagPresuntivo());
                pstm.setString(53, m.getDerivadoA());
                pstm.setString(54, m.getProQueAtendio());
                pstm.setString(55, m.getCuota());
                //pstm.setInt(56, m.getId_terapeuta());
                pstm.setInt(56, m.getId_persona());
                pstm.setDate(57,m.getFechaCreacion());
                pstm.setBoolean(58, m.isSantecedentesPenales());
                pstm.setString(59, m.getAntecedentesPenales());
                pstm.setString(60, m.getEstadoPaciente());
                pstm.setString(61, m.getTipoExp());
                pstm.setDate(62, m.getNacimiento());
                pstm.setString(63, m.getAnotaciones());
                pstm.setString(64, m.getDesdeCuandoAlterA());
                pstm.setString(65, m.getDesdeCuandoAlterS());
                pstm.setString(68, m.getTiempoEstadoLaboral());
                pstm.setString(70, m.getDondeLabora());
                pstm.execute();
               
                ResultSet id=pstm.getResultSet();
               id.next();
               nuevoID=id.getInt("id_expediente");              
            }
            return nuevoID;
            
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
        
    }
    public Vector<SetGetPcontacto> buscarPersona(String nombre){//filtra personas a la hora que se quiere agregar un expediente
        SetGetPcontacto persona=new SetGetPcontacto();      
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT id_persona, nombre, apellidop, apellidom\n" +
        "  FROM persona where nombre LIKE '%" + nombre + "%' OR apellidop LIKE '%" + nombre + "%'";
        this.conectar();
        //this.pstm.setString(1, nombre);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setId_persona(rs.getInt("id_persona"));
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidoP(rs.getString("apellidop").concat(" ".concat(rs.getString("apellidom"))));

            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    public Vector<SetGetPcontacto> cargarPersona(int id){//busca todos los atributos de una persona para ponerlos en el expediente
        SetGetPcontacto persona=new SetGetPcontacto();
        try{
        SetGetPcontacto dato;
        Vector<SetGetPcontacto> vr = new Vector<>();
        this.sql="SELECT nombre, apellidop, apellidom, telefono, id_persona\n" +
        "  FROM persona where id_persona = ?";
        this.conectar();
        this.pstm.setInt(1, id);
        this.rs=pstm.executeQuery();
        while(rs.next()){
            dato=new SetGetPcontacto();
            dato.setNombre(rs.getString("nombre"));
            dato.setApellidoP(rs.getString("apellidop"));
            dato.setApellidoM(rs.getString("apellidom"));
            dato.setTelefono(rs.getString("telefono"));
            dato.setId_persona(rs.getInt("id_persona"));
            vr.add(dato);
        }
        return vr;
    }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    

    
   
    
    }
    

