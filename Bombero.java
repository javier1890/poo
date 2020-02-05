package ejercicios_poo.clase20.ejercicio01;

public class Bombero {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private boolean especialista;

	public Bombero(String nombre, String apellidos, int edad, boolean casado, boolean especialista) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.especialista = especialista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public boolean isEspecialista() {
		return especialista;
	}

	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}

	@Override
	public String toString() {
		return "Bombero [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado
				+ ", especialista=" + especialista + "]";
	}

}
