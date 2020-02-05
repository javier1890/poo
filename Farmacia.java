package poo.ejercicio03;

import java.util.Scanner;

public class Farmacia {

	public static void main(String[] args) {
		
//		El usuario debe poder ingresar 5 productos para que luego el sistema le dé el 
//		nombre del producto más caro que se vende con receta y el más caro que se vende 
//		sin receta.
		
//		Permita al usuario seleccionar 3 productos por su nombre y que le entregue 
//		el valor a pagar con y sin descuento aplicado
//		String nombre, int precio, boolean receta
		
		
		Producto a[]= new Producto[5];
		Scanner leer=new Scanner(System.in);
		String nombre;
		int precio;
		boolean receta;
		int valor1,valor2,valor3;
		
		int op;

		System.out.println("******************************************************");
		System.out.println("********************* M E N U ************************");
		System.out.println("1) Ingresar 5 productos                               ");
		System.out.println("2) seleccionar 3 productos por su nombre              ");
		System.out.println("3) Salir                                              ");  
		
			op=leer.nextInt();
	
		
		
		switch (op) {
		case 1:
			for (int i = 0; i < 5; i++) {

				 a[i]= new Producto();
				
					System.out.println("\n\n");
					
					System.out.println("Ingrese el nombre:");
					nombre=leer.nextLine();
					a[i].setNombre(nombre);
					

					System.out.println("Ingrese el precio:");
					precio=leer.nextInt();
					a[i].setPrecio(precio);
					
					System.out.println("\n");
					System.out.println("Ingrese la receta [1)Si - 2)No]:");
					receta=leer.nextBoolean();
					a[i].setReceta(receta);

			
			}
			break;

		case 2:
			
				System.out.println("Ingrese el indice del primer producto que desea mostrar entre[1-5]:");
				valor1=leer.nextInt();
			
				System.out.println("Ingrese el indice del segundo producto que desea mostrar entre[1-5]:");
				valor2=leer.nextInt();
			
			
				System.out.println("Ingrese el indice del tercero producto que desea mostrar entre[1-5]:");
				valor3=leer.nextInt();
				
				
				System.out.println("\n\n");
						
				
				
				
				System.out.println(a[valor1-1].toString());
				System.out.println(a[valor2-1].toString());
				System.out.println(a[valor3-1].toString());
				
			break;
		default:
			System.out.println("Adios");
			break;
		}
		


		
		}
}
