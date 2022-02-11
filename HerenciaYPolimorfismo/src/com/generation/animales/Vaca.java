package com.generation.animales;

public class Vaca extends Animal implements Mascota,Jugar{

	@Override
	public void jugar() {
		System.out.println("No sé lo que es jugar");
	}

	@Override
	public void correr() {
		System.out.println("Mejor empieza a correr si no quieres ser embestido por mí");
	}

	@Override
	public void baniar() {
		System.out.println("Me gustan los arroyos porque ahí me baño");
	}

	@Override
	public void moverLaColita() {
		System.out.println("Yo solo la muevo para espantar las moscas");
		
	}

	@Override
	public void jugarConCajas() {
		System.out.println("Ni las toco");
	}

	@Override
	public void ensuciarse() {
       System.out.println("Me ensucie en el establo, limpia");
	}

}
