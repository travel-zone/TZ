package Tuber;

import java.util.Random;

public class Randomcreate {
	Random rand = new Random();
	
	String[] nombres = new String[] {"Elías", "Juan", "Carmen", "Jennifer"};
	String[] apellidos = new String[] {"Muñoz", "Fernández", "Soto", "Troncoso"};

	public void randomName() {
		String nombre1, apellido1;
		Randomcreate obj1 = new Randomcreate();
		
		nombre1 = obj1.nombres[rand.nextInt(obj1.nombres.length)];
		apellido1 = obj1.apellidos[rand.nextInt(obj1.apellidos.length)];
		System.out.print("Nombre del conductor/a: "+(nombre1 + " "+apellido1));
	}
}