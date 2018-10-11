package backend;
import java.util.Vector;

import farmacia.Medicamento;
import farmacia.Ticket;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.SQLException;
/**
 * Clase DAO para acceso de información de la aplicación de "farmacia".
 */
public class FarmaciaDAO {
    //- Esta es la URL de conexión a la base de datos, y hay que modificarla
    //- según la implementación que se le vaya a dar.
    private final String url = "jdbc:postgresql://192.168.1.100/Aplicacion";
    
    private String sql;             //- Almacena el query que se va a ejecutar.
    private Connection con;         //- Instancia de la conexión a la BD.
    private PreparedStatement pstm; //- Herramienta para ejecutar las querys.
    private ResultSet rs;           //- Almacen de los resultados.
    
    /**
     * Crea una conexión a la base de datos modificando el atributo con.
     * <p>
     * Este método se invoca sólo de manera interna y se utiliza para preparar
     * el entorno para ejecutar un query.
     */
    private void conectar() throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        this.con = DriverManager.getConnection(this.url, "postgres", "$@Lud1n73gral");
        this.pstm = con.prepareStatement(this.sql);
    }
    
    private void cerrarConexion(){
        try{
            if(rs != null) rs.close();
            if(pstm != null) pstm.close();
            if(con != null) con.close();
        }catch (SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    /**
     * Guarda una lista de objetos tipo Medicamento en la base de datos.
     * @param medicamento Lista de objetos tipo Medicamento.
     * @return El ID del primer medicamento guardado.
     * @see Medicamento
     */
    public Integer guardarMedicamento(Medicamento medicamento){
        try{
            this.sql = "INSERT INTO farmacia(comercial, generico, laboratorio, \"fechaIngreso\", presentacion, miligramos, cantidad)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?) RETURNING id_medicamento";
            this.conectar();
            Integer nuevoID = 0;
            
            pstm.setString(1, medicamento.getComercial().toUpperCase());
            pstm.setString(2, medicamento.getGenerico().toUpperCase());
            pstm.setString(3, medicamento.getLaboratorio().toUpperCase());
            pstm.setDate(4, medicamento.getFechaIngreso());
            pstm.setString(5,  medicamento.getPresentacion().toUpperCase());
            pstm.setDouble(6, medicamento.getMiligramos());
            pstm.setInt(7, medicamento.getCantidad());

            pstm.execute();
            ResultSet id = pstm.getResultSet();
            id.next();
            nuevoID = id.getInt("id_medicamento");
            
            return nuevoID;
        } catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    
    /**
     * Busca por la cadena especificada en el campo dado dentro de la base de datos.
     * @param busqueda Palabra a buscar dentro de la base de datos.
     * @return Lista de los medicamentos resultantes de la búsqueda.
     */
    public Collection<Medicamento> buscar(String busqueda){
        //Atrapando errores en el tiempo de ejecución.
        try{
            
            //Los resultados obtenidos se almacenarán en una colección
            Vector<Medicamento> vr = new Vector<>();
            Medicamento m;  //Objeto temporal de medicamento.
            
            // Cadena que almacena el SQL de del DAO.
            this.sql = "SELECT * FROM farmacia WHERE\n" +
                    "(comercial LIKE '%" + busqueda + "%' OR generico LIKE '%"
                    + busqueda + "%' OR laboratorio LIKE '%" + busqueda + "%' "
                    + ")AND cantidad > 0";
            
            //Invoca al método conectar del objeto.
            this.conectar();

            rs = pstm.executeQuery();
            // Se actúa sobre los resultados objenidos de la consulta.
            // Mientras el resultado que se obtenga sea diferente a null...
            while(rs.next()){
                // Crea un medicamento y jala sus propiedades del resultado.
                m = new Medicamento();
                m.setId_medicamento(rs.getInt("id_medicamento"));
                m.setCantidad(rs.getInt("cantidad"));
                m.setComercial(rs.getString("comercial"));
                m.setFechaIngreso(rs.getDate("fechaIngreso"));
                m.setGenerico(rs.getString("generico"));
                m.setLaboratorio(rs.getString("laboratorio"));
                m.setMiligramos(rs.getDouble("miligramos"));
                m.setPresentacion(rs.getString("presentacion"));
                
                //Agregar el nuevo objeto a la colección.
                vr.add(m);
            }
            
            //El resultado de una búsqueda será la colección de un 
            //conjunto de medicamentos.
            return vr;
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{   //Al finalizar, cerrar la conexión.
            this.cerrarConexion();
        }
    }
    
    
    /**
     * Busca un medicamento por su ID. Debido a la unicidad de los datos
     * este método debe de devolver un único valor.
     * @param id    Identificador a buscar dentro de los medicamentos.
     * @return      El medicamento encontrado.
     */
    public Medicamento buscarMedicamento(Integer id){
        try{
            Medicamento m = null;
            this.sql = "SELECT * FROM farmacia WHERE id_medicamento = ?";
            
            this.conectar();
            
            this.pstm.setInt(1, id);
            this.rs = this.pstm.executeQuery();

            if(this.rs.next()){
                m = new Medicamento();
                m.setId_medicamento(rs.getInt("id_medicamento"));
                m.setCantidad(rs.getInt("cantidad"));
                m.setComercial(rs.getString("comercial"));
                m.setFechaIngreso(rs.getDate("fechaIngreso"));
                m.setGenerico(rs.getString("generico"));
                m.setLaboratorio(rs.getString("laboratorio"));
                m.setMiligramos(rs.getDouble("miligramos"));
                m.setPresentacion(rs.getString("presentacion"));
            }
            return m;
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    /**
     * Guarda los datos de una compra.
     * @param ticket Objeto de tipo Ticket que encapsula los datos de una compra.
     * @return El número del ticket creado.
     * @see Ticket
     */
    public Integer guardarCompra(Ticket ticket){
        try{
            this.conectar();
            
            this.sql = "INSERT INTO "
                    + "ticketfarm(id_expediente,\"cantidadAportacion\", \"fechaAportacion\") "
                    + "VALUES (?, ?, ?) RETURNING id_ticket";
            this.pstm = con.prepareStatement(sql);
            this.pstm.setInt(1, ticket.getId_paciente());
            this.pstm.setDouble(2, ticket.getTotal());
            this.pstm.setDate(3, ticket.getFecha());
            
            this.pstm.execute();
            ResultSet id = this.pstm.getResultSet();
            id.next();
            ticket.setId_ticket(id.getInt("id_ticket"));
            
            this.sql = "INSERT INTO salida(id_medicamento, id_ticket, cantidad)"+
            "VALUES (?, ?, ?)";
            
            this.pstm = this.con.prepareStatement(sql);
            
            this.pstm.setInt(2, ticket.getId_ticket());
            
            Collection<Medicamento> lista = ticket.getMedicamentos();
            Iterator<Medicamento> medicamentos = lista.iterator();
            Integer nuevoID = ticket.getId_ticket();
            Medicamento m;
            while(medicamentos.hasNext()){
                m = (Medicamento)medicamentos.next();
                this.pstm.setInt(1, m.getId_medicamento());
                this.pstm.setInt(3, m.getCantidad());
                this.pstm.execute();
            }
            
            this.sql = "UPDATE farmacia SET cantidad=cantidad-? WHERE id_medicamento=?";
            this.pstm = con.prepareStatement(sql);
            Iterator<Medicamento> actualizaciones = ticket.getMedicamentos().iterator();
            while(actualizaciones.hasNext()){
                m = (Medicamento)actualizaciones.next();
                System.out.println("Actualizando ID # " + m.getId_medicamento());
                this.pstm.setInt(1, m.getCantidad());
                this.pstm.setInt(2, m.getId_medicamento());
                pstm.executeUpdate();
            }
            return nuevoID;
            
        } catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally{
            this.cerrarConexion();
        }
    }
    
    /**
     * Elimina un medicamento del inventario poniendo su cantidad a 0.
     * @param id Identificador del medicamento a eliminar.
     */
    public void eliminarMedicamento(Integer id){
        this.sql = "UPDATE farmacia SET cantidad = 0 WHERE id_medicamento = ?";
        try{
            this.conectar();
            pstm.setInt(1, id);
            pstm.execute();
        }catch(SQLException sex){
            sex.printStackTrace();
            throw new RuntimeException(sex);
        }catch(ClassNotFoundException cex){
            cex.printStackTrace();
            throw new RuntimeException(cex);
        }
    }
    
    /**
     * Actualiza la cantidad disponible de un medicamento dentro del inventario.
     * @param id ID del medicamento a modificar.
     * @param cantidad Nueva cantidad disponible del medicamento.
     * @see Medicamento
     */
    public void actualizarCantidad(Integer id, Integer cantidad){
        try{    
            // - Obtenemos la cantidad disponible en el inventario.
            Integer actual, nueva;
            this.sql = "SELECT cantidad FROM farmacia WHERE id_medicamento = ?";
            this.conectar();
            this.pstm.setInt(1, id);
            this.rs = this.pstm.executeQuery();
            if(this.rs.next()){
                actual = rs.getInt(1);
            }else {
                return;
            }
            System.out.println(actual);
            nueva = actual + cantidad;
        
            this.sql = "UPDATE farmacia SET cantidad=? WHERE id_medicamento=?";
            this.conectar();
            this.pstm.setInt(1, nueva);
            this.pstm.setInt(2, id);
            this.pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    
    /**
     * Consulta el nombre del paciente con el ID de expediente dado.
     * @param id    Identificador del paciente a consultar.
     * @return      Nombre del paciente que coincide con el ID o null si no se encuentra.
     */
    public String obtenerNombre(Integer id){
        this.sql = "SELECT nombre, apellidop, apellidom FROM expediente "
                + "INNER JOIN persona ON expediente.id_persona = persona.id_persona WHERE expediente.id_expediente=?";
        try{    
            this.conectar();
            this.pstm.setInt(1, id);
            this.rs = this.pstm.executeQuery();
            String nombre = "";
            if(rs.next()){
                nombre = rs.getString("nombre") + " " + 
                        rs.getString("apellidop") + " "+
                        rs.getString("apellidom");
                
                return nombre;
            }
            return null;
        }catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
