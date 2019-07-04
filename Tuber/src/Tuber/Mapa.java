package Tuber;
import java.util.Random;

//TODO MOVIMIENTO SERA DE 0.01

//latitud_superior = 33.33;
//latitud_inferior = 33.64;
//longitud_este = 70.49;
//longitud_oeste = 70.82;

public class Mapa {
	Random rand = new Random();
	
	public double diferencia_persona_latitud;
	public double diferencia_persona_longitud;
	public double distancia_recorrida;
	public String lugar_partida;
	public String lugar_llegada;
	public int precio_viaje;
	public String partida_conductor;
	public double posicion_conductor_latitud;
	public double posicion_conductor_longitud;
	public double posicion_cliente_latitud;
	public double posicion_cliente_longitud;
	
	//	CREACION POSICIONES RANDOM (
	
	String[] posicion = new String[] {"Pio Nono","Pdte Balmaceda","Av. Grecia","Veintitres de Febrero","Gran Torre Santiago"};
	
	
	public Mapa() {
		String lugar;
		String lugar1;
		String lugar2;
		lugar = posicion[rand.nextInt(posicion.length)];
		lugar1 = posicion[rand.nextInt(posicion.length)];
		lugar2 = posicion[rand.nextInt(posicion.length)];
		//ESTE IF ES PARA BAJAR PROBABILIDADES DE QUE LA PARTIDA SEA IGUAL A LA LLEGADA
		if (lugar == lugar1) {				
			lugar1 = posicion[rand.nextInt(posicion.length)];
		}
		
		double latitud = 0;
		double latitud1 = 0;
		double latitud2 = 0;
		double longitud = 0;
		double longitud1 = 0;
		double longitud2 = 0;
		
	/*
	   if (lugar == posicion[]) {	//
		latitud = 
		longitud = 
		}
	if (lugar1 == posicion[]) {
		latitud1 = 
		longitud1 = 
		}
	if (lugar2 == posicion[]) {
		latitud2 = 
		longitud2 = 
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
	if (lugar2 == posicion[0]) {
		latitud2 = -33.43;
		longitud2 = -70.64;
		}
	if (lugar == posicion[1]) {	//Pdte Balmaceda
		latitud = -33.43;
		longitud = -70.67;
		}
	if (lugar1 == posicion[1]) {	
		latitud1 = -33.43;
		longitud1 = -70.67;
		}
	if (lugar2 == posicion[1]) {
		latitud2 = -33.43;
		longitud2 = -70.67;
		}
	if (lugar == posicion[2]) {	//Av Grecia
		latitud = -33.46;
		longitud = -70.61;
		}
	if (lugar1 == posicion[2]) {	
		latitud1 = -33.46;
		longitud1 = -70.61;
		}
	if (lugar2 == posicion[2]) {
		latitud2 = -33.46;
		longitud2 = -70.61;
		}
	if (lugar == posicion[3]) {	//Veintitres de Febrero
		latitud = -33.43;
		longitud = -70.55;
		}
	if (lugar1 == posicion[3]) {
		latitud1 = -33.43;
		longitud1 = -70.55;
		}
	if (lugar2 == posicion[3]) {
		latitud2 = -33.43;
		longitud2 = -70.55;
		}
	if (lugar == posicion[4]) {	//Gran Torre Santiago
		latitud = -33.42 ;
		longitud = -70.61;
		}
	if (lugar1 == posicion[4]) {
		latitud1 = -33.42;
		longitud1 = -70.61;
		}
	if (lugar2 == posicion[4]) {
		latitud2 = -33.42;
		longitud2 = -70.61;
		}
	
	diferencia_persona_latitud = -latitud + latitud1;
	diferencia_persona_longitud = -longitud + longitud1;
	lugar_partida = lugar;
	lugar_llegada = lugar1;
	partida_conductor = lugar2;
	posicion_conductor_latitud = latitud2;
	posicion_conductor_longitud = longitud2;
	
	
	
	if (diferencia_persona_latitud<0) {
		diferencia_persona_latitud = -diferencia_persona_latitud;
	}
	if (diferencia_persona_longitud<0) {
		diferencia_persona_longitud = -diferencia_persona_longitud;
	}
	
	distancia_recorrida = (diferencia_persona_latitud + diferencia_persona_longitud)*100;
	
	precio_viaje = (int) (distancia_recorrida*1100);
	}
	
	public String getStartDriver() {			//RETORNA EN QUE LUGAR SE ENCUENTRA EL CONDUCTOR
		return partida_conductor;
	}
	public double getLatDriver() {				//RETORNA EN QUE LATITUD SE ENCUENTRA EL CONDUCTOR
		return posicion_conductor_latitud;
	}
	public double getLonDriver() {				//RETORNA EN QUE LONGITUD SE ENCUENTRA EL CONDUCTOR
		return posicion_conductor_longitud;
	}
	public String getStart() {					//RETORNA EN QUE LUGAR SE ENCUENTRA EL CLIENTE
		return lugar_partida;
	}
	public double getLatClient() {				//RETORNA EN QUE LATITUD SE ENCUENTRA EL CLIENTE
		return posicion_conductor_latitud;
	}
	public double getLonClient() {				//RETORNA EN QUE LONGITUD SE ENCUENTRA EL CLIENTE
		return posicion_conductor_longitud;
	}
	public String getFinish(){					//RETORNA A QUE LUGAR QUIERE LLEGAR EL CLIENTE
		return lugar_llegada;
	}
	public double getDistancia() {				//RETORNA CUANTA DISTANCIA ES RECORRIDA EN EL VIAJE SOLICITADO POR EL CLIENTE
		return distancia_recorrida;
	}
	public double getPrice() {					//RETORNA EL VALOR TOTAL DEL VIAJE
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