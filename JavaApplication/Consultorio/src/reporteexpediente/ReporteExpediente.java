/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporteexpediente;

/**
 *
 * @author engine
 */
public class ReporteExpediente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expediente exp = new Expediente("127.0.0.1", "Aplicacion", "postgres", "r00t");
        exp.imprimir(12);
    }
    
}
