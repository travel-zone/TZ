package Tuber;

import java.util.Random;

public class Autos {
	Random rand = new Random();
	public String auto_matricula;
	
	//	CONTENIDO DE MATRICULA 
	char[] Letras = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','N','Ñ','O','P','Q','R','S','T','U','W','X','Y','Z'};
	char[] Numeros = new char[] {'0','1','2','3','4','5','6','7','8','9'};
	char[] matricula_Letras = new char[4];
	char[] matricula_Numeros = new char[2];
	
	//	CONTENIDO AUTOS
	String[] Autos = new String[] {"Chevrolet Spark ", "Toyota Yaris", "Volkswagen Vento", "Nissan Versa", "Hyundai Grand i10", "Suzuki Ciaz", "Toyota Prius", "Ford Fusion", "Hyundai Sonata", "Chevrolet Equinox"};

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
		
		matricula = matricula_Letras;
		numeros = matricula_Numeros;
		
		
		
		auto_matricula = String.valueOf(matricula_Letras) + String.valueOf(matricula_Numeros);
	}
	
	public String getMatricula() {
		return auto_matricula;
	}
	
	
	public void dataMatricula() {
		Autos obj = new Autos();
		System.out.println("Matricula: " + obj.auto_matricula);
	}
}
