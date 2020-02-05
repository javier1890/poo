package poo.ejercicio03;

public class Producto {

	
	private String nombre;
	private int precio;
	private boolean receta;
	
	
	
	public Producto() {
		super();
	}

	public Producto(String nombre, int precio, boolean receta) {;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public boolean isReceta() {
		return receta;
	}
	public void setReceta(boolean receta) {
		this.receta = receta;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", receta=" + receta + "]";
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////77
//	El usuario debe poder ingresar 5 productos para que luego el sistema le dé el 
//	nombre del producto más caro que se vende con receta y el más caro que se vende 
//	sin receta.
//
//	Agregué un método a Producto que entregue el valor del producto con un 
//	50% de descuento si es sin receta médica y un 
//	10% de descuento si es con receta.
//
//	Permita al usuario seleccionar 3 productos por su nombre y que le entregue 
//	el valor a pagar con y sin descuento aplicado
	
	private void descuento_receta(){
		if (receta==false) {
			System.out.println("Tiene un descuento de 50% por lo tanto su valor es de $"+(float)(precio*0.50));
		}else {
			System.out.println("Tiene un descuento de 10% por lo tanto su valor es de $"+(float)(precio*0.90));
		}
	}
	
	
	
	
}
