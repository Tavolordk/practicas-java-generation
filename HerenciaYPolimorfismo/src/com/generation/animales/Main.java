package com.generation.animales;

public class Main {
	public static void main(String[] args) {
		Vaca mu = new Vaca();
		mu.baniar();
		mu.comer();
		
		Gato cat = new Gato();
		cat.baniar();
		cat.comer();
		
		Perro guau = new Perro();
		guau.baniar();
		guau.dormir();
	}
}
