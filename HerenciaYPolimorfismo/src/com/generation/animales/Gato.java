package com.generation.animales;

public class Gato extends Animal implements Mascota, Jugar {

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con una bola de estambre");
	}

	@Override
	public void correr() {
		System.out.println("Estoy cazando un ratón");
	}

	@Override
	public void baniar() {
		System.out.println("No me gusta bañarme");
	}

	@Override
	public void moverLaColita() {
		System.out.println("Solo cuando te quiero manipular");
	}

	@Override
	public void jugarConCajas() {
		System.out.println("Me gusta usarlas para dormir");
	}

	@Override
	public void ensuciarse() {
		System.out.println("Me ensucio cuando voy a cazar alguna lagartija");
	}

}
