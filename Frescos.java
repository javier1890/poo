package ejercicios_poo.clase20.ejercicio02;
import java.util.Date;

public class Frescos extends Productos{
	
	private Date fecha_envasado;
	private String pa�s_origen;
	
	
	public Frescos(String fecha_caducidad, int numero_lote,String pa�s_origen) {
		super(fecha_caducidad, numero_lote);
		this.fecha_envasado =new Date();
		this.pa�s_origen = pa�s_origen;
	}


	public String getPa�s_origen() {
		return pa�s_origen;
	}


	public void setPa�s_origen(String pa�s_origen) {
		this.pa�s_origen = pa�s_origen;
	}


	@Override
	public String toString() {
		return "Frescos [ fecha de caducidad="+this.getFecha_cadicidad()+", fecha_envasado=" + fecha_envasado + ", pa�s_origen=" + pa�s_origen + "]";
	}


	


	
	
	
	
	
}
