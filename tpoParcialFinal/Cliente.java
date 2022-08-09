package tpoParcialFinal;

public class Cliente {

	private String nombre;
	private String apellido;
	private int dni;
	
	public Cliente(String nombre, String apellido, int dni) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "MIS DATOS:\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nDNI: " + getDni();
	}
}
