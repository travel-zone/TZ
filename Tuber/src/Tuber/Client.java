package Tuber;

import java.util.Random;

public class Client {
	Random rand = new Random();
	boolean estado_cliente;
	public String[] posicion;
	public double[] latitud;
	public double[] longitud;
	public String[] posicion_final;
	public double[] latitud_final;
	public double[] longitud_final;
	public int cantidad;
	
	public Client() {
		estado_cliente = rand.nextBoolean();
		
		if(estado_cliente == false) {
			System.out.println("El cliente no ha pedido Tuber.");
		} else {
			System.out.println("El cliente pidió Tuber.");
		}
	}
	
	public boolean getQuerying() {
		return estado_cliente;
	}
}