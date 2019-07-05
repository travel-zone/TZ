package Tuber;
import java.util.Random;

public class Driver {
	Random rand = new Random();
	
	//	Atributos 
	public String[] driver_name_nombre;
	public String[] driver_name_apellido;
	public String[] driver_age1;
	public String[] driver_age2;
	public int driver_personality;
	public int cantidad;
	public String[] posicion;
	public double[] latitud;
	public double[] longitud;
	public boolean preferences_km;
	
	//	Data para el conductor
	String[] nombres = new String[] {"Elías", "Juan", "Carmen", "Jennifer","Nicolas","Gabriela","Manuel","Macarena","Daniel","Elizabeth","Felipe","Matias","Catalina"};
	String[] apellidos = new String[] {"Muñoz", "Fernández", "Soto", "Troncoso","Pérez","Gonzales","Silva","Espinoza","Molina","Sandoval","Escobar","Alarcon","Correa"};
	String[] num1 = new String[] {"2","3","4","5",};
	String[] num2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	int[] rango_personalidad = new int[] {1,2,3,4,5};
	
	
	//	Creando conductor Random
	public Driver() {
		String[] nombre1, apellido1, edad1, edad2;
		int personalidad1;
		int preferencia_km;
		
		nombre1 = nombres;
		apellido1 = apellidos;
		edad1 = num1;
		edad2 = num2;
		personalidad1 = rango_personalidad[rand.nextInt(rango_personalidad.length)];
		
		if(personalidad1 == 1) {
			preferencia_km = 5; 
		}else if(personalidad1 == 2){
			preferencia_km = 10; 
		}else if(personalidad1 == 3) {
			preferencia_km = 15;
		}else if(personalidad1 == 4) {
			preferencia_km = 20;
		}else {
			preferencia_km = 30;
		}
		
		driver_name_nombre = nombre1 ;
		driver_name_apellido = apellido1;
		driver_age1 = edad1;
		driver_age2 = edad2;
		driver_personality = preferencia_km;
		
	}
	
	public String[] getDrivername1() {
		return driver_name_nombre;
	}
	
	public String[] getDrivername2() {
		return driver_name_apellido;
	}
	
	public String[] getDriverage1() {
		return driver_age1;
	}
	
	public String[] getDriverage2() {
		return driver_age2;
	}
	public void dataDriver() {
		Driver obj = new Driver();

	}
	public int getPreference() {
		return driver_personality;
	}
	 
}
