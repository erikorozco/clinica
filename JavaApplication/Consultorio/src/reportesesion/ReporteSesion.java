/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportesesion;

/**
 *
 * @author engine
 */
public class ReporteSesion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sesion sesion = new Sesion("127.0.0.1", "Aplicacion", "postgres", "r00t");
        sesion.imprimir(1);
    }
    
}
