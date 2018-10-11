package backend.aportacion;

/**
 * Clase para transporte de datos de Aportación.
 * Incluye sus atributos y sus respectivos getters y setters.
 * @author engine
 */
public class AportacionDTO {
    private Integer id_expediente;
    private String fecha_hora;
    private Double total;
    private String concepto;

    public Integer getId_expediente() {
        return id_expediente;
    }

    public void setId_expediente(Integer id_expediente) {
        this.id_expediente = id_expediente;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
}
