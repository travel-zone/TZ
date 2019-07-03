package Tuber;

import java.util.Random;

public class Randomcreate {
	Random rand = new Random();
	
	//	INFO CONDUCTOR
	String[] nombres = new String[] {"Elías", "Juan", "Carmen", "Jennifer","Nicolas","Gabriela","Manuel","Macarena","Daniel","Elizabeth","Felipe","Matias","Catalina"};
	String[] apellidos = new String[] {"Muñoz", "Fernández", "Soto", "Troncoso","Pérez","Gonzales","Silva","Espinoza","Molina","Sandoval","Escobar","Alarcon","Correa"};
	String[] num1 = new String[] {"2","3","4","5",};
	String[] num2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	
	//	CONTENIDO DE MATRICULA 
	char[] Letras = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','N','Ñ','O','P','Q','R','S','T','U','W','X','Y','Z'};
	char[] Numeros = new char[] {'0','1','2','3','4','5','6','7','8','9'};
	char[] matricula_Letras = new char[4];
	char[] matricula_Numeros = new char[2];

	//	CREANDO CONDUCTOR RANDOM
	public void randomName() {
		String nombre1, apellido1, edad1, edad2;
		Randomcreate obj1 = new Randomcreate();
		
		nombre1 = obj1.nombres[rand.nextInt(obj1.nombres.length)];
		apellido1 = obj1.apellidos[rand.nextInt(obj1.apellidos.length)];
		edad1 = obj1.num1[rand.nextInt(obj1.num1.length)];
		edad2 = obj1.num2[rand.nextInt(obj1.num2.length)];
		
		System.out.println("Nombre del conductor/a: "+(nombre1 + " "+apellido1));
		System.out.println("Edad del conductor/a: "+(edad1 + edad2));
	}
	//	CREANDO MATRICULA RANDOM
	public void randomMatricula() {
		char[] matricula = new char[4];
		char[] numeros = new char[2];
		
		for(int i = 0; i < 4; i++) {
			matricula[i] = Letras[rand.nextInt(Letras.length)];
		}
		for(int i = 0; i < 2; i++) {
			numeros[i] = Numeros[rand.nextInt(Numeros.length)];
		}
		
		matricula_Letras = matricula;
		matricula_Numeros = numeros;
		System.out.print(matricula_Letras); System.out.print(matricula_Numeros);
	}
}
