package Tuber;
import java.util.Random;

//TODO MOVIMIENTO SERA DE 0.01

//latitud_superior = -33.33;
//latitud_inferior = -33.64;
//longitud_este = -70.49;
//longitud_oeste = -70.82;

public class Mapa {
	Random rand = new Random();
	
	public String[] partida;
	public double[] posicion_latitud;
	public double[] posicion_longitud;
	
	//	CREACION POSICIONES RANDOM (
	
	String[] lugar = new String[] {"Pio Nono","Pdte Balmaceda","Av. Grecia","Veintitres de Febrero","Gran Torre Santiago",
			"San Ramon","El Corcolen","Tucapel","Reyes Magos","Av. Quilin","Barrio el Golf","Azteca","Jose Arrieta","Algarrobo",
			"Riquelme","Pedro Lobos","Av Independencia","Sebastian Elcano","Ramon Barros Luco","Incahuasi","San Bernardo",
			"Av. Departamental","Av. Simon Bolivar", "Pocillas","Victor Hendrychn H","Aranjuez","Ismael Briceño",
			"Gran Av. Jose Miguel Carrera","Canada","Diputada Laura Rodriguez","Av. Costanera","Pje. Aviador Acevedo",
			"Los Alerces","Eduardo Castillo Velasco","Av. Las Torres","Tobalaba","Gutierrez Zuñiga Hugo Guillermo","Esperanza",
			"San Fransisco","Alfonso Donoso","Marta Brunet","Matus Rojas Myriam","Nva Las Industrias","Las Garzas","Bail","Vilches",
			"Lo Marcoleta","Mejillones","Juan Muñoz","Autopista Vespucio Norte","Monseñor Edwards"};
	double[] latitud  = new double[] { -33.43, -33.43, -33.46, -33.43, -33.42, -33.55, -33.58, -33.57, -33.52, -33.49, -33.42,
			-33.48, -33.46, -33.53, -33.54, -33.46, -33.40, -33.43, -33.49, -33.52, -33.60, -33.50, -33.45, -33.40, -33.40, -33.39,
			-33.38, -33.48, -33.50, -33.47, -33.41, -33.40, -33.47, -33.46, -33.50, -33.50, -33.55, -33.55, -33.57, -33.61, -33.46,
			-33.46, -33.38, -33.36, -33.35, -33.35, -33.36, -33.36, -33.38, -33.39, -33.46};
	double[] longitud = new double[] { -70.64, -70.67, -70.61, -70.55, -70.61, -70.64, -70.59, -70.66, -70.60, -70.61, -70.58,
			-70.57, -70.56, -70.62, -70.66, -70.57, -70.67, -70.57, -70.66, -70.76, -70.69, -70.63, -70.56, -70.63, -70.74, -70.72,
			-70.72, -70.65, -70.62, -70.57, -70.70, -70.68, -70.60, -70.59, -70.58, -70.56, -70.63, -70.64, -70.66, -70.71, -70.73,
			-70.75, -70.75, -70.75, -70.75, -70.73, -70.75, -70.39, -70.66, -70.64, -70.56};
	
	public Mapa() {

	partida = lugar;
	posicion_latitud = latitud;
	posicion_longitud = longitud;
	}

	public String[] getPosicion() {			//RETORNA EN QUE LUGAR SE ENCUENTRA EL CONDUCTOR
		return partida;
	}
	
	public double[] getLat() {
		return posicion_latitud;
	}
	
	public double[] getLon() {
		return posicion_longitud;
	}
	
	public void dataMapa() {
		Mapa obj = new Mapa();
		
	}
	
}