package Tuber;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

		//NUESTRO TUBER; TRABAJA CON UN RADIO DE BUSQUEDA DE 10KM, CON UN MAXIMO PERMITIDO DE CONDUCTORES POR AREA DE 30
public class Interfaz {
	public static void main(String[] args) {
		Random rand = new Random();	
		Client client = new Client();
		Mapa obj = new Mapa();
		Driver driver = new Driver();
		int maximo_conductores = 30;

		//	Entregando coordenada al Pasajero
		if(client.getQuerying() == true) {
			double distancia_driver_client_lat;
			double distancia_driver_client_lon;
			double distancia_driver_client_total;
			double distancia_viaje_inicio_final_lat;
			double distancia_viaje_inicio_final_lon;
			double distancia_viaje_inicio_final_total;
			
			//CLIENTES
			client.posicion = obj.getPosicion();
			client.latitud = obj.getLat();
			client.longitud = obj.getLon();
			client.posicion_final = obj.getPosicion();
			client.latitud_final = obj.getLat();
			client.longitud_final = obj.getLon();
			double[] client_lat = new double[obj.getPosicion().length];
			double[] client_lon = new double[obj.getPosicion().length];
			double[] client_lat_final = new double[obj.getPosicion().length];
			double[] client_lon_final = new double[obj.getPosicion().length];
			int k;
			k = rand.nextInt(obj.getPosicion().length);
			System.out.println("El cliente se encuentra en:	" + client.posicion[k]);
			int l;
			l = rand.nextInt(obj.getPosicion().length);
			System.out.println("El cliente desea llegar a:	" + client.posicion[l]);
			distancia_viaje_inicio_final_lat = - client.latitud[k] + client.latitud[l];
			if (distancia_viaje_inicio_final_lat<0) {
				distancia_viaje_inicio_final_lat = -distancia_viaje_inicio_final_lat;
			}else {}
			distancia_viaje_inicio_final_lon = - client.longitud[k] + client.longitud[l];
			if (distancia_viaje_inicio_final_lon<0) {
				distancia_viaje_inicio_final_lon = -distancia_viaje_inicio_final_lon;
			}else {}
			distancia_viaje_inicio_final_total = (distancia_viaje_inicio_final_lat + distancia_viaje_inicio_final_lon)*100;
			System.out.println("Distancia entre punto de partida y de llegada: " + Math.ceil(distancia_viaje_inicio_final_total) + "Km.");
			
			// LATITUD CLIENT  	client.latitud[k];
			// LONGITUD CLIENT	client.longitud[k];
			
			
			//CONDUCTORES
			driver.posicion = obj.getPosicion();
			driver.latitud = obj.getLat();
			driver.longitud = obj.getLon();
			driver.cantidad = maximo_conductores;	//	Conductores dentro del radio del pasajero;
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
			// LATITUD DRIVER	driver_lat[i]);
			// LONGITUD DRIVER	driver_lon[i];
					distancia_driver_client_lat = -client.latitud[k] + driver_lat[i];
					if (distancia_driver_client_lat <0) {
						distancia_driver_client_lat = -distancia_driver_client_lat;
					} else {}
					distancia_driver_client_lon = -client.longitud[k] + driver_lon[i];
					if (distancia_driver_client_lon <0) {
						distancia_driver_client_lon = -distancia_driver_client_lon;
					} else {}
					distancia_driver_client_total = (distancia_driver_client_lat + distancia_driver_client_lon)*100;
					if (distancia_driver_client_total <=10) {
					System.out.println("El conductor" +(j+1) + " se encuentra en: " +cantidad_conductores[i]);
					System.out.println(Math.ceil(distancia_driver_client_total));
					} else 	{}
			}
		}
	}
}

		
		
