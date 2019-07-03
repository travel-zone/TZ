package Tuber;
import tuber.drivers.DriverBehavior;
import java.util.Random;
import tuber.types.Driver;

public class Conductor extends DriverBehavior implements Driver {
	Random rand = new Random();
	
	//	Atributos 
	public String driver_name;
	public String driver_age;
	public byte driver_personality;
	
	//	Data para el conductor
	String[] nombres = new String[] {"Elías", "Juan", "Carmen", "Jennifer","Nicolas","Gabriela","Manuel","Macarena","Daniel","Elizabeth","Felipe","Matias","Catalina"};
	String[] apellidos = new String[] {"Muñoz", "Fernández", "Soto", "Troncoso","Pérez","Gonzales","Silva","Espinoza","Molina","Sandoval","Escobar","Alarcon","Correa"};
	String[] num1 = new String[] {"2","3","4","5",};
	String[] num2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	
	//	Creando conductor Random
	public Conductor() {
		String nombre1, apellido1, edad1, edad2;
		
		nombre1 = nombres[rand.nextInt(nombres.length)];
		apellido1 = apellidos[rand.nextInt(apellidos.length)];
		edad1 = num1[rand.nextInt(num1.length)];
		edad2 = num2[rand.nextInt(num2.length)];

		driver_name = nombre1 + " " + apellido1;
		driver_age = edad1 + edad2;
	}
	
	public String getDrivername() {
		return driver_name;
	}
	
	public String getDriverage() {
		return driver_age;
	}
	public void dataDriver() {
		Conductor obj = new Conductor();
		System.out.println("Nombre del conductor/a: "+obj.driver_name);
		System.out.println("Edad: "+(obj.driver_age)+ " años." );
	}
	

	@Override
	public boolean busy() {
		return false;
	}

	@Override
	public int getPersonality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean likeLargeServices() {
		// TODO Auto-generated method stub
		return false;
	}
		
	
	 
}

	

