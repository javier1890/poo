package ejercicios_poo.clase20.ejercicio02;

public class Principal02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frescos a1=new Frescos("5 de enero", 5422, "china");
		System.out.println(a1.toString());

		
		Refrigerados a2=new Refrigerados("7 de marzo del 2021", 96555);
		System.out.println(a2.toString());
		
		Congelados a3= new Congelados("12 de diciembre del 2020", 5126, 8);
		System.out.println(a3.toString());
	}

}
