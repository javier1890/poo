package ejercicios_poo.clase20.ejercicio02;

public class Refrigerados extends Productos{
	private long código_supervisión;

	
	
	public Refrigerados(String fecha_caducidad, int numero_lote) {
		super(fecha_caducidad, numero_lote);
		this.código_supervisión = (int)(Math.random()*200000);
	}

	public long getCódigo_supervisión() {
		return código_supervisión;
	}

	public void setCódigo_supervisión(long código_supervisión) {
		this.código_supervisión = código_supervisión;
	}

	@Override
	public String toString() {
		return "Refrigerados [fecha de caducidad="+this.getFecha_cadicidad()+",código_supervisión=" + código_supervisión + "]";
	}
	
	
	
}
