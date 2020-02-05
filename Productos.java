package ejercicios_poo.clase20.ejercicio02;


public class Productos {

	private String fecha_caducidad;
	private int numero_lote;
	
	public Productos(String fecha_caducidad, int numero_lote) {
		this.fecha_caducidad = fecha_caducidad;
		this.numero_lote = numero_lote;
	}

	public String getFecha_cadicidad() {
		return fecha_caducidad;
	}

	public void setFecha_cadicidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getNumero_lote() {
		return numero_lote;
	}

	public void setNumero_lote(int numero_lote) {
		this.numero_lote = numero_lote;
	}
	
	
	
}
