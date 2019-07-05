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
		Cars cars = new Cars();
		int maximo_conductores = 50;
		double contador = 20000;
		int cantidad_clientes = 200;
		boolean estado_cliente;
		estado_cliente = rand.nextBoolean();

		//	Entregando coordenada al Pasajero
		for (int w = 0; w <= 20000; w++) {
			System.out.println("Semana"+(w+1)+":");
		if(estado_cliente == false) {
			System.out.println("El cliente no recibió Tuber.");
			contador--;
			break;
		} else if(estado_cliente == true) {
					System.out.println("El cliente recibió un Tuber.");
					double distancia_driver_client_lat;
					double distancia_driver_client_lon;
					double distancia_driver_client_total;
					double distancia_viaje_inicio_final_lat;
					double distancia_viaje_inicio_final_lon;
					double distancia_viaje_inicio_final_total;
					double precio_total;
			
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
					}else {
					}	
					distancia_viaje_inicio_final_lon = - client.longitud[k] + client.longitud[l];
					if (distancia_viaje_inicio_final_lon<0) {
						distancia_viaje_inicio_final_lon = -distancia_viaje_inicio_final_lon;
					}else {
					}
					distancia_viaje_inicio_final_total = (distancia_viaje_inicio_final_lat + distancia_viaje_inicio_final_lon)*100;
					System.out.println("Distancia entre punto de partida y de llegada: " + Math.ceil(distancia_viaje_inicio_final_total) + "Km.");
					for(int u=0; u<Math.ceil(distancia_viaje_inicio_final_total); u++) {
					contador--;
					}precio_total = ((Math.ceil(distancia_viaje_inicio_final_total))*1123);
					System.out.println("Total a pagar: $" +precio_total );
			
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
					int drivers_in_the_area = rand.nextInt(maximo_conductores);
					System.out.println("Conductores cercanos al pasajero: "+ drivers_in_the_area);
			
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
									System.out.println("El conductor se encuentra en: " + driver.posicion[i]);
									System.out.println("Nombre del conductor: " + driver.driver_name_nombre[rand.nextInt(driver.getDrivername1().length)] + " " + driver.driver_name_apellido[rand.nextInt(driver.getDrivername2().length)]);
									System.out.println("Edad del conductor: " + driver.driver_age1[rand.nextInt(driver.getDriverage1().length)] + driver.driver_age1[rand.nextInt(driver.getDriverage1().length)]);
									System.out.println("Datos del vehiculo: ");
									System.out.println("Matricula: " + cars.letra_matricula1[rand.nextInt(cars.getMatriculaLet1().length)] + cars.letra_matricula2[rand.nextInt(cars.getMatriculaLet2().length)] + cars.letra_matricula3[rand.nextInt(cars.getMatriculaLet3().length)] + cars.letra_matricula4[rand.nextInt(cars.getMatriculaLet4().length)] + cars.numero_matricula1[rand.nextInt(cars.getMatriculaNum1().length)] + cars.numero_matricula2[rand.nextInt(cars.getMatriculaNum2().length)]);
									System.out.println("Modelo: " + cars.modelo_auto[rand.nextInt(cars.getModelo().length)]);
									System.out.println("El conductor se encuentra a: " +Math.ceil(distancia_driver_client_total) + "Km.");
									System.out.println("__________________________________________________________________________");
					
									for(int p=0; p<Math.ceil(distancia_driver_client_total); p++) {
										contador--;
									}
									break;
								} else 	{
								}
						contador --;
					} 
				contador--;
			if (contador == 0) {
					System.out.println("Fin de semana.");
				}	if(contador < 0) {
						break;
					}
			}
		}
	}
}


	

		
		
