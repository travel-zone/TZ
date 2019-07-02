package Tuber;

import java.util.Random;

public class matricula {
	Random rand = new Random();

	char[] Letras = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','N','Ñ','O','P','Q','R','S','T','U','W','X','Y','Z'};
	char[] Numeros = new char[] {'0','1','2','3','4','5','6','7','8','9'};
	char[] matricula_Letras = new char[4];
	char[] matricula_Numeros = new char[2];
	
	public void randomMatricula() {
		char[] matricula = new char[4];
		char[] numeros = new char[2];
		
		matricula obj1 = new matricula();
		for(int i = 0; i < 4; i++) {
			matricula[i] = obj1.Letras[rand.nextInt(obj1.Letras.length)];
		}
		for(int i = 0; i < 2; i++) {
			numeros[i] = obj1.Numeros[rand.nextInt(obj1.Numeros.length)];
		}
		
		obj1.matricula_Letras = matricula;
		obj1.matricula_Numeros = numeros;
		System.out.print(obj1.matricula_Letras); System.out.print(obj1.matricula_Numeros);
	}
}
	
