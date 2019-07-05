package Tuber;

import java.util.Random;

public class Cars {
	Random rand = new Random();
	public String[] letra_matricula1;
	public String[] letra_matricula2;
	public String[] letra_matricula3;
	public String[] letra_matricula4;
	public String[] numero_matricula1;
	public String[] numero_matricula2;
	public String[] modelo_auto;
	
	//	CONTENIDO DE MATRICULA 
	String[] Letras1 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras2 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras3 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Letras4 = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] Numeros1 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	String[] Numeros2 = new String[] {"0","1","2","3","4","5","6","7","8","9"};
	
	//	CONTENIDO AUTOS
	String[] Autos = new String[] {"Chevrolet Spark ", "Toyota Yaris", "Volkswagen Vento", "Nissan Versa", "Hyundai Grand i10", "Suzuki Ciaz", "Toyota Prius", "Ford Fusion", "Hyundai Sonata", "Chevrolet Equinox"};

	public Cars() {
	//	CREANDO MATRICULA RANDOM
			
		letra_matricula1 = Letras1;	
		letra_matricula2 = Letras2;
		letra_matricula3 = Letras3;
		letra_matricula4 = Letras4;
		numero_matricula1 = Numeros1;
		numero_matricula2 = Numeros2;
			
	//	CREANDO AUTO RANDOM	
		
		modelo_auto = Autos;
	}
	
	public String[] getMatriculaLet1() {
		return letra_matricula1;
	}
	public String[] getMatriculaLet2() {
		return letra_matricula2;
	}
	public String[] getMatriculaLet3() {
		return letra_matricula3;
	}
	public String[] getMatriculaLet4() {
		return letra_matricula4;
	}
	public String[] getMatriculaNum1() {
		return numero_matricula1;
	}
	public String[] getMatriculaNum2() {
		return numero_matricula2;
	}
	
	public String[] getModelo() {
		return modelo_auto;
	}
	
	
	public void dataMatricula() {
		Cars obj = new Cars();
	}
}