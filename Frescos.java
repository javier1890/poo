package ejercicios_poo.clase20.ejercicio02;
import java.util.Date;

public class Frescos extends Productos{
	
	private Date fecha_envasado;
	private String país_origen;
	
	
	public Frescos(String fecha_caducidad, int numero_lote,String país_origen) {
		super(fecha_caducidad, numero_lote);
		this.fecha_envasado =new Date();
		this.país_origen = país_origen;
	}


	public String getPaís_origen() {
		return país_origen;
	}


	public void setPaís_origen(String país_origen) {
		this.país_origen = país_origen;
	}


	@Override
	public String toString() {
		return "Frescos [ fecha de caducidad="+this.getFecha_cadicidad()+", fecha_envasado=" + fecha_envasado + ", país_origen=" + país_origen + "]";
	}


	


	
	
	
	
	
}
