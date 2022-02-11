package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar {

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la pelota");
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo un auto");
	}

	@Override
	public void baniar() {
		System.out.println("Me gusta el agua");
	}

	@Override
	public void moverLaColita() {
		System.out.println("Cuando estoy contento por verte");
	}

	@Override
	public void jugarConCajas() {
		System.out.println("Me gusta romperlas");
	}

	@Override
	public void ensuciarse() {
		System.out.println("Me gusta revolcarme en el lodo");
	}

}
