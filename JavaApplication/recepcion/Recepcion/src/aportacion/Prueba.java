package aportacion;

/**
 * @author engine
 */
public class Prueba {
    public static void main(String[] args) {
        Aportacion aportacion = new Aportacion("127.0.0.1", "Aplicacion", "postgres", "r00t");
        aportacion.generarAportación(3, "2015-11-15 12:00:00", 50.6, "Consulta en general. Sigue volviendo aunque le decimos que no.");
        aportacion.imprimir();
    }
}
