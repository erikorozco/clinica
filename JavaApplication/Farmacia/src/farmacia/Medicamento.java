package farmacia;

import java.sql.Date;
/**
 * Clase DTO Medicamento. Permite la encapsulación de los datos comunes de un medicamento.
 */
public class Medicamento {
	private Integer id_medicamento;
	/**
         * Getter de id_medicamento.
         * @return ID del medicamento.
	 * */
	public Integer getId_medicamento() {
		return id_medicamento;
	}
	/**
         * Modifica el ID del medicamento.
	 * @param id_medicamento the id_medicamento to set
	 */
	public void setId_medicamento(Integer id_medicamento) {
		this.id_medicamento = id_medicamento;
	}
	private String comercial;
	private String generico;
	private String laboratorio;
	private Date fechaIngreso;
	private Date fechaCad;
	private String presentacion;
	private Double miligramos;

	private String componente;
	/**
	 * Getter de componente.
	 * @return Componente del objeto.
	 * */
	public String getComponente() {
		return componente;
	}
	/**
	 * @param componente the componente to set
	 */
	public void setComponente(String componente) {
		this.componente = componente;
	}
	private Integer cantidad;
	
	/**
	 * Getter de comercial.
	 * @return String valor de comercial del objeto.
	 * */
	public String getComercial(){
		return this.comercial;
	}
	/**
	 * Setter de comercial.
	 * @param comercial Nuevo valor de comercial del objeto.
	 * */
	public void setComercial(String comercial){
		this.comercial = comercial;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Getter de generico.
	 * @return String valor de generico del objeto.
	 * */
	public String getGenerico(){
		return this.generico;
	}
	/**
	 * Setter de generico.
	 * @param generico Nuevo valor de generico del objeto.
	 * */
	public void setGenerico(String generico){
		this.generico = generico;
	}
	
	/**
	 * Getter de laboratorio.
	 * @return String valor de laboratorio del objeto.
	 * */
	public String getLaboratorio(){
		return this.laboratorio;
	}
	/**
	 * Setter de laboratorio.
	 * @param laboratorio Nuevo valor de laboratorio del objeto.
	 * */
	public void setLaboratorio(String laboratorio){
		this.laboratorio = laboratorio;
	}
	
	/**
	 * Getter de fechaIngreso.
	 * @return Date valor de fechaIngreso del objeto.
	 * */
	public Date getFechaIngreso(){
		return this.fechaIngreso;
	}
	/**
	 * Setter de fechaIngreso.
	 * @param fechaIngreso Nuevo valor de fechaIngreso del objeto.
	 * */
	public void setFechaIngreso(Date fechaIngreso){
		this.fechaIngreso = fechaIngreso;
	}
	
	/**
	 * Getter de fechaCad.
	 * @return Date valor de fechaCad del objeto.
	 * */
	public Date getFechaCad(){
		return this.fechaCad;
	}
	/**
	 * Setter de fechaIngreso.
	 * @param fechaCad Nuevo valor de fechaIngreso del objeto.
	 * */
	public void setFechaCad(Date fechaCad){
		this.fechaCad = fechaCad;
	}
	
	/**
	 * Getter de presentacion.
	 * @return String valor de presentacion del objeto.
	 * */
	public String getPresentacion(){
		return this.presentacion;
	}
	/**
	 * Setter de presentacion.
	 * @param presentacion Nuevo valor de presentacion del objeto.
	 * */
	public void setPresentacion(String presentacion){
		this.presentacion = presentacion;
	}
	
	/**
	 * Getter de miligramos.
	 * @return Double valor de miligramos del objeto.
	 * */
	public Double getMiligramos(){
		return this.miligramos;
	}
	/**
	 * Setter de miligramos.
	 * @param miligramos Nuevo valor de miligramos del objeto.
	 * */
	public void setMiligramos(Double miligramos){
		this.miligramos = miligramos;
	}

    
    /**
     * Devuelve un arreglo de objetos con todos los atributos del objeto.
     * @return  Arreglo de objetos conteniendo los atributos del objeto.
     */
    public Object[] toObjectArray(){
        Object[] on = new Object[]{
            this.id_medicamento,
            this.generico,
            this.comercial,
            this.laboratorio,
            this.fechaIngreso.toString(),
            this.miligramos,
            this.cantidad
        };
        return on;
    }
    
    /**
     * Devuelve un arreglo de objetos con una selección los atributos del objeto.
     * @return  Arreglo de objetos seleccionados de los atributos del objeto.
     */
    public Object[] toReducedObjectArray(){
        Object[] on = new Object[]{
            this.id_medicamento,
            this.generico,
            this.miligramos,
            this.cantidad
        };
        return on;
    }
}
