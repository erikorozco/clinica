/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ticket;

import java.sql.Date;
public class TicketDTO {

    public TicketDTO(Integer ID, String nombre, Date fecha, Double total) {
        this.ID = ID;
        this.nombre = nombre;
        this.fecha = fecha;
        this.total = total;
    }
    private Integer ID;
    private String nombre;
    private Date fecha;
    private Double total;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
    public Object[] toObjectArray(){
        return new Object[] {
            this.ID,
            this.nombre,
            this.fecha,
            this.total
        };
    }
}
