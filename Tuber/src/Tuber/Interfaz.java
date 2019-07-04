package Tuber;

import java.util.Random;

public class Interfaz {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Client pasajero = new Client();
		Mapa obj = new Mapa();
		Driver conductor = new Driver();
		int maximo_conductores = 20;

		//	Entregando coordenada al Pasajero
		if(pasajero.getQuerying() == true) {
			pasajero.posicion = obj.getStart();
			System.out.println("El cliente se encuentra en: "+pasajero.posicion);
			conductor.cantidad = rand.nextInt(maximo_conductores);	//	Conductores dentro del radio del pasajero
			System.out.println("Conductores cercanos al pasajero: "+conductor.cantidad);
			conductor.posicion = obj.getStart();

			
			
		}else {
			System.out.print("No se ha solicitado Tuber.");
		}
		
	}
}
