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
			conductor.cantidad = rand.nextInt(maximo_conductores);	//	Conductores dentro del radio del pasajero;
			String[] cantidad_conductores = new String[obj.getPosicion().length];
			double[] cantidad_latitud = new double[obj.getPosicion().length];
			double[] cantidad_longitud = new double[obj.getPosicion().length];
			conductor.posicion = obj.getPosicion();
			conductor.latitud = obj.getLat();
			conductor.longitud = obj.getLon();
			System.out.println("Conductores cercanos al pasajero: "+conductor.cantidad);
			for (int j=0; j<conductor.cantidad; j++) {
					int i;
					i = rand.nextInt(obj.getPosicion().length);	
					cantidad_conductores[i] = conductor.posicion[i];
					cantidad_latitud[i] = conductor.latitud[i];
					cantidad_longitud[i] = conductor.longitud[i];
					System.out.println("El conductor" +(j+1) + " se encuentra en: " +cantidad_conductores[i]);
					System.out.println(cantidad_latitud[i]);
					System.out.println(cantidad_longitud[i]);
			}
			}
		}
	}

		
		
