package ejercicios_poo.clase20.ejercicio02;

public class Congelados extends Productos {
	private int temperatura_congelaci�n;

	public Congelados(String fecha_caducidad, int numero_lote, int temperatura_congelaci�n) {
		super(fecha_caducidad, numero_lote);

		if (temperatura_congelaci�n < -180) {
			System.out.println("\ningreso su temperatura m�nima");
			this.temperatura_congelaci�n = temperatura_congelaci�n;
			
		} else if (temperatura_congelaci�n > 5) {
			System.out.println("\nIngreso su temperatura maxima de congelacion");
			this.temperatura_congelaci�n = 5;
		}else {
			this.temperatura_congelaci�n = temperatura_congelaci�n;
		}

	}

	public int getTemperatura_congelaci�n() {
		return temperatura_congelaci�n;
	}

	public void setTemperatura_congelaci�n(int temperatura_congelaci�n) {
		this.temperatura_congelaci�n = temperatura_congelaci�n;
	}

	@Override
	public String toString() {
		return "Congelados [fecha de caducidad="+this.getFecha_cadicidad()+",temperatura_congelaci�n=" + temperatura_congelaci�n+"]";
	}

}
