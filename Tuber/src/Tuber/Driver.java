package Tuber;

import java.util.Random;

public class Driver {
	//	Atributos 
	Random rand = new Random();
	public String driver_name;
	public String driver_age;
	public byte driver_personality;
	
	//	Data para el conductor
	String[] nombres = new String[] {"Elías", "Juan", "Carmen", "Jennifer","Nicolas","Gabriela","Manuel","Macarena","Daniel","Elizabeth","Felipe","Matias","Catalina"};
	String[] apellidos = new String[] {"Muñoz", "Fernández", "Soto", "Troncoso","Pérez","Gonzales","Silva","Espinoza","Molina","Sandoval","Escobar","Alarcon","Correa"};
	String[] num1 = new String[] {"2","3","4","5",};
	String[] num2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	
	//	Creando conductor Random
	public Driver() {
		String nombre1, apellido1, edad1, edad2;
		Randomcreate obj1 = new Randomcreate();
		
		nombre1 = obj1.nombres[rand.nextInt(obj1.nombres.length)];
		apellido1 = obj1.apellidos[rand.nextInt(obj1.apellidos.length)];
		edad1 = obj1.num1[rand.nextInt(obj1.num1.length)];
		edad2 = obj1.num2[rand.nextInt(obj1.num2.length)];

		driver_name = nombre1 + " " + apellido1;
		driver_age = edad1 + edad2;

	}
	
	public String getDrivername() {
		return driver_name;
	}
	
	public String getDriverage() {
		return driver_age;
	}
}

	

