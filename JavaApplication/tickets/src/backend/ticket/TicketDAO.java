/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ticket;

import backend.farmacia.Medicamento;
import backend.farmacia.Ticket;
import backend.aportacion.Aportacion;
import backend.aportacion.AportacionDTO;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Iterator;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketDAO {
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
    
    public enum Tipo {
        FARMACIA,
        APORTACION
    };
    
    public Collection<TicketDTO> buscar(String busqueda, Tipo tipo){
        Vector resultados = new Vector();
        try {
            
            switch(tipo){
                case APORTACION:
                    this.sql =  "SELECT id_aportacion, nombre, apellidop, apellidom, \"fechaTransaccion\", total\n" +
                            "FROM aportacion \n" +
                            "INNER JOIN expediente ON aportacion.id_expediente = expediente.id_expediente\n" +
                            "INNER JOIN persona ON expediente.id_persona = persona.id_persona\n" +
                            "WHERE nombre like '%"+ busqueda +"%'";
                    break;
                case FARMACIA:
                    this.sql =  "SELECT id_ticket, nombre, apellidop, apellidom, \"fechaAportacion\", \"cantidadAportacion\"\n" +
                            "FROM ticketfarm \n" +
                            "INNER JOIN expediente ON ticketfarm.id_expediente = expediente.id_expediente\n" +
                            "INNER JOIN persona ON expediente.id_persona = persona.id_persona\n" + 
                            "WHERE nombre like '%"+ busqueda +"%'";
                    break;
            }
            this.conectar();
            this.rs = this.pstm.executeQuery();
            
            while(rs.next()){
                System.out.println(rs.getInt(1));
                resultados.insertElementAt(new TicketDTO(
                        rs.getInt(1), 
                        rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4), 
                        rs.getDate(5), 
                        rs.getDouble(6)
                ), 0);
            }
            return resultados;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return resultados;
    }
}
