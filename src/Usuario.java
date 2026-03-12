public abstract class Usuario {

	private int idUsuario;
	private String nombre;
	private String dni;
	private String email;
	private String password;

	public int getIdUsuario() {
		return this.idUsuario;
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void registrarse() {
		// TODO - implement Usuario.registrarse
		throw new UnsupportedOperationException();
	}

	public boolean iniciarSesion() {
		// TODO - implement Usuario.iniciarSesion
		throw new UnsupportedOperationException();
	}

}