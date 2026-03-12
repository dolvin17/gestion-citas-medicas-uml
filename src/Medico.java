public class Medico extends Usuario {

	private String numColegiado;

	public String getNumColegiado() {
		return this.numColegiado;
	}

	/**
	 * 
	 * @param numColegiado
	 */
	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	/**
	 * 
	 * @param citaId
	 */
	public void generarInforme(int citaId) {
		// TODO - implement Medico.generarInforme
		throw new UnsupportedOperationException();
	}

	public List<Cita> consultarAgenda() {
		// TODO - implement Medico.consultarAgenda
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Paciente consultarDatosPaciente(int id) {
		// TODO - implement Medico.consultarDatosPaciente
		throw new UnsupportedOperationException();
	}

}