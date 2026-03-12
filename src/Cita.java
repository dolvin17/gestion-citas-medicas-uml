public class Cita {

	private int idCita;
	private Date fecha;
	private String hora;
	private String estado;

	public int getIdCita() {
		return this.idCita;
	}

	/**
	 * 
	 * @param idCita
	 */
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return this.hora;
	}

	/**
	 * 
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void confirmar() {
		// TODO - implement Cita.confirmar
		throw new UnsupportedOperationException();
	}

	public void cancelar() {
		// TODO - implement Cita.cancelar
		throw new UnsupportedOperationException();
	}

}