package ejercicios_poo.clase20.ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bombero a1=new Bombero("mario", "rojas", 45,true, true);
		a1.isCasado();
		System.out.println("El bombero "+a1.getNombre()+" "+(a1.isCasado()?"si":"no")+" es casado");
		
		Bombero a2=new Bombero("mrtin", "pineda", 45,false, true);
		a2.isCasado();
		System.out.println("El bombero "+a2.getNombre()+" "+(a2.isCasado()?"si":"no")+" es casado");
	}

}
