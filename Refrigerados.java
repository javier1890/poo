package ejercicios_poo.clase20.ejercicio02;

public class Refrigerados extends Productos{
	private long c�digo_supervisi�n;

	
	
	public Refrigerados(String fecha_caducidad, int numero_lote) {
		super(fecha_caducidad, numero_lote);
		this.c�digo_supervisi�n = (int)(Math.random()*200000);
	}

	public long getC�digo_supervisi�n() {
		return c�digo_supervisi�n;
	}

	public void setC�digo_supervisi�n(long c�digo_supervisi�n) {
		this.c�digo_supervisi�n = c�digo_supervisi�n;
	}

	@Override
	public String toString() {
		return "Refrigerados [fecha de caducidad="+this.getFecha_cadicidad()+",c�digo_supervisi�n=" + c�digo_supervisi�n + "]";
	}
	
	
	
}
