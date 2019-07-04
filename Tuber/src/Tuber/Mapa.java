package Tuber;
import java.util.Random;

//TODO MOVIMIENTO SERA DE 0.01

//latitud_superior = 33.33;
//latitud_inferior = 33.64;
//longitud_este = 70.49;
//longitud_oeste = 70.82;

public class Mapa {
	Random rand = new Random();
	
	public double posicion_persona_latitud;
	public double posicion_persona_longitud;
	public double distancia_recorrida;
	public String lugar_partida;
	public String lugar_llegada;
	public int precio_viaje;
	
	//	CREACION POSICIONES RANDOM
	
	String[] posicion = new String[] {"Pio Nono","Pdte Balmaceda","Av. Grecia","Veintitres de Febrero","Gran Torre Santiago"};
	
	
	public Mapa() {
		String lugar;
		String lugar1;
		lugar = posicion[rand.nextInt(posicion.length)];
		lugar1 = posicion[rand.nextInt(posicion.length)];
		double latitud = 0;
		double latitud1 = 0;
		double longitud = 0;
		double longitud1 = 0;
		
	/*
	   if (lugar == posicion[]) {	//
		latitud = ;
		longitud = ;
		}
	if (lugar1 == posicion[]) {
		latitud1 = ;
		longitud1 = ;
		}
	*/
	
	if (lugar == posicion[0]) {	//Pio Nono
		latitud = -33.43;
		longitud = -70.64;
		}
	if (lugar1 == posicion[0]) {	
		latitud1 = -33.43;
		longitud1 = -70.64;
		}
	if (lugar == posicion[1]) {	//Pdte Balmaceda
		latitud = -33.43;
		longitud = -70.67;
		}
	if (lugar1 == posicion[1]) {	
		latitud1 = -33.43;
		longitud1 = -70.67;
		}
	if (lugar == posicion[2]) {	//Av Grecia
		latitud = -33.46;
		longitud = -70.61;
		}
	if (lugar1 == posicion[2]) {	
		latitud1 = -33.46;
		longitud1 = -70.61;
		}
	if (lugar == posicion[3]) {	//Veintitres de Febrero
		latitud = -33.43;
		longitud = -70.55;
		}
	if (lugar1 == posicion[3]) {
		latitud1 = -33.43;
		longitud1 = -70.55;
		}
	if (lugar == posicion[4]) {	//Gran Torre Santiago
		latitud = -33.42 ;
		longitud = -70.61;
		}
	if (lugar1 == posicion[4]) {
		latitud1 = -33.42;
		longitud1 = -70.61;
		}
	
	posicion_persona_latitud = -latitud + latitud1;
	posicion_persona_longitud = -longitud + longitud1;
	lugar_partida = lugar;
	lugar_llegada = lugar1;
	
	
	if (posicion_persona_latitud<0) {
		posicion_persona_latitud = -posicion_persona_latitud;
	}
	if (posicion_persona_longitud<0) {
		posicion_persona_longitud = -posicion_persona_longitud;
	}
	
	distancia_recorrida = (posicion_persona_latitud + posicion_persona_longitud)*100;
	
	precio_viaje = (int) (distancia_recorrida*1100);
	}
	
	public String getStart() {
		return lugar_partida;
	}
	
	public String getFinish(){
		return lugar_llegada;
	}
	
	public double getDistancia() {
		return distancia_recorrida;
	}
	
	public double getPrice() {
		return precio_viaje;
	}
	
	public void dataMapa() {
		Mapa obj = new Mapa();
		System.out.println("Inicio de viaje: " + obj.lugar_partida);
		System.out.println("Final de viaje: " + obj.lugar_llegada);
		System.out.println("Distancia de viaje: " + Math.ceil(obj.distancia_recorrida));
		System.out.println("Valor del viaje: " +obj.precio_viaje);
	}
	
}