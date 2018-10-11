/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author engine
 */
public class Principal extends JFrame{
    public Principal(){
        try{
            
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://192.168.1.100/Aplicacion",
                    "postgres",
                    "$@Lud1n73gral");
            con.createStatement();
            if(con != null) con.close();
            
            this.setTitle("Sistema de Farmacia.");
            this.setIconImage((new ImageIcon(getClass().getResource("icono.jpg")).getImage()));
            this.add(new Farmacia());
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setSize(950, 700);
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }catch(SQLException | ClassNotFoundException sqex){
            sqex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "No se pudo comunicar con el servidor de la base de datos.\n"
                            + "¿Está encendida la computadora cental?.",
                    "Error de comunicación.",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
