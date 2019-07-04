package Tuber;

import java.util.Random;

public class Cliente {
	Random rand = new Random();
	boolean estado_cliente;
	
	public Cliente() {
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