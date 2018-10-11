package backend.farmacia;

import java.sql.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

public class Ticket {
    private Integer id_ticket;
    private Integer id_paciente;
    private String nombre_paciente;
    private Date fecha;
    private Double total;
    private String concepto;
    private Vector<Medicamento> medicamentos;
    
    public Integer getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(Integer id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Vector<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Vector<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    /**
     * Agrega un medicamento a su lista de medicamentos.
     * @param m Medicamento a agregar al ticket.
     */
    public void agregarMedicamento(Medicamento m){
        if(this.medicamentos == null){
            this.medicamentos = new Vector<>();
        }
        System.out.print(this.medicamentos);
        this.medicamentos.add(m);
        
    }
    
    /**
     * Busca un medicamento en la lista.
     * @param m Medicamento a buscar.
     * @return Entero con la posición del medicamento (-1, no encontrado).
     */
    public Integer buscarEnLista(Medicamento m){
        if(this.medicamentos == null){
            this.medicamentos = new Vector<>();
        }
        Integer pos = -1;
        Iterator<Medicamento> it = this.medicamentos.iterator();
        Medicamento actual;
        while (it.hasNext()){
            actual = it.next();
            ++pos;
            if(Objects.equals(m.getId_medicamento(), actual.getId_medicamento())){
                return pos;
            }
        }
        return -1;
    }
}
