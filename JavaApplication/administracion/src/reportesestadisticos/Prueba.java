/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportesestadisticos;

/**
 *
 * @author engine
 */
public class Prueba {
    public static void main(String[] args) {
        ReportesEstadisticos ps = new ReportesEstadisticos("127.0.0.1", "Aplicacion", "postgres", "r00t");
        java.sql.Date inicio = new java.sql.Date(java.sql.Date.valueOf("2014-10-10").getTime());
        System.out.println(inicio.toString());
        
        java.sql.Date fin = new java.sql.Date(java.sql.Date.valueOf("2016-10-10").getTime());
        System.out.println(fin.toString());
        
        ps.generarReporte(ReportesEstadisticos.Tipo.REPORTE_TIPO_ATENCION, inicio, fin);
        ps.mostrarReporte();
    }
    
}
