package Tuber;

import java.util.Random;

public class Autos {
	Random rand = new Random();
	public String auto_matricula;
	public String auto_modelo;
	
	//	CONTENIDO DE MATRICULA 
	String[] Letras1 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras2 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras3 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras4 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Numeros1 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	String[] Numeros2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	
	//	CONTENIDO AUTOS
	String[] Autos = new String[] {"Chevrolet Spark ", "Toyota Yaris", "Volkswagen Vento", "Nissan Versa", "Hyundai Grand i10", "Suzuki Ciaz", "Toyota Prius", "Ford Fusion", "Hyundai Sonata", "Chevrolet Equinox"};

	public Autos() {
	//	CREANDO MATRICULA RANDOM
		String letras1, letras2, letras3, letras4, numeros1, numeros2;
			
			letras1 = Letras1[rand.nextInt(Letras1.length)];	
			letras2 = Letras2[rand.nextInt(Letras2.length)];
			letras3 = Letras3[rand.nextInt(Letras3.length)];
			letras4 = Letras4[rand.nextInt(Letras4.length)];
			numeros1 = Numeros1[rand.nextInt(Numeros1.length)];
			numeros2 = Numeros2[rand.nextInt(Numeros2.length)];

			auto_matricula = letras1 + letras2 + letras3 + letras4 + numeros1 + numeros2;
			
	//	CREANDO AUTO RANDOM	
		String auto;
		
			auto = Autos[rand.nextInt(Autos.length)];
		
			auto_modelo = auto;
	}
	
	public String getMatricula() {
		return auto_matricula;
	}
	
	public String getModelo() {
		return auto_modelo;
	}
	
	
	public void dataMatricula() {
		Autos obj = new Autos();
		System.out.println("Matricula del Auto: " + obj.auto_matricula);
		System.out.println("Modelo del auto: " + obj.auto_modelo);
	}
}
