package Tuber;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
//	Librería "random"
		Random rand = new Random();
		
		Driver d = new Driver();
		d.dataDriver();
		
		Cars a = new Cars();
		a.dataMatricula();
		
		Mapa m = new Mapa();
		m.dataMapa();

	}
}
