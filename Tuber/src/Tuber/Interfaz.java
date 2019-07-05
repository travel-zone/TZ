package Tuber;

import java.util.Random;

public class Interfaz {
	public static void main(String[] args) {
		Random rand = new Random();	
		Client client = new Client();
		Mapa obj = new Mapa();
		Driver driver = new Driver();
		int maximo_conductores = 20;

		//	Entregando coordenada al Pasajero
		if(client.getQuerying() == true) {
			
			//CLIENTES
			client.posicion = obj.getPosicion();
			client.latitud = obj.getLat();
			client.longitud = obj.getLon();
			double[] client_lat = new double[obj.getPosicion().length];
			double[] client_lon = new double[obj.getPosicion().length];
			int k;
			k = rand.nextInt(obj.getPosicion().length);
			System.out.println("El cliente se encuentra en: " + client.posicion[k]);
			System.out.println(client.latitud[k]);
			System.out.println(client.longitud[k]);
			
			
			//CONDUCTORES
			driver.posicion = obj.getPosicion();
			driver.latitud = obj.getLat();
			driver.longitud = obj.getLon();
			driver.cantidad = rand.nextInt(maximo_conductores);	//	Conductores dentro del radio del pasajero;
			String[] cantidad_conductores = new String[obj.getPosicion().length];
			double[] driver_lat = new double[obj.getPosicion().length];
			double[] driver_lon = new double[obj.getPosicion().length];
			System.out.println("Conductores cercanos al pasajero: "+driver.cantidad);
			for (int j=0; j<driver.cantidad; j++) {
					int i;
					i = rand.nextInt(obj.getPosicion().length);	
					cantidad_conductores[i] = driver.posicion[i];
					driver_lat[i] = driver.latitud[i];
					driver_lon[i] = driver.longitud[i];
					System.out.println("El conductor" +(j+1) + " se encuentra en: " +cantidad_conductores[i]);
					System.out.println(driver_lat[i]);
					System.out.println(driver_lon[i]);
			}
		}
	}
}

		
		
