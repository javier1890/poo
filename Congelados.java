package ejercicios_poo.clase20.ejercicio02;

public class Congelados extends Productos {
	private int temperatura_congelación;

	public Congelados(String fecha_caducidad, int numero_lote, int temperatura_congelación) {
		super(fecha_caducidad, numero_lote);

		if (temperatura_congelación < -180) {
			System.out.println("\ningreso su temperatura mínima");
			this.temperatura_congelación = temperatura_congelación;
			
		} else if (temperatura_congelación > 5) {
			System.out.println("\nIngreso su temperatura maxima de congelacion");
			this.temperatura_congelación = 5;
		}else {
			this.temperatura_congelación = temperatura_congelación;
		}

	}

	public int getTemperatura_congelación() {
		return temperatura_congelación;
	}

	public void setTemperatura_congelación(int temperatura_congelación) {
		this.temperatura_congelación = temperatura_congelación;
	}

	@Override
	public String toString() {
		return "Congelados [fecha de caducidad="+this.getFecha_cadicidad()+",temperatura_congelación=" + temperatura_congelación+"]";
	}

}
