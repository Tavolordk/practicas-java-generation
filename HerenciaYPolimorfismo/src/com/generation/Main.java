package com.generation;

public class Main {
	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setNombre("Cuadrado");
		cuadrado1.setLado(4);
		System.out.println(cuadrado1.getNombre()+" Área: "+cuadrado1.calcularArea()+" Perímetro: "+cuadrado1.perimetro());
		
		Triangulo triangulo1=new Triangulo();
		triangulo1.setNombre("Triangulo");
		triangulo1.setAlto(12);
		triangulo1.setLargo(8);
		System.out.println(triangulo1.getNombre()+" Área: "+triangulo1.calcularArea()+" Perímetro: "+triangulo1.perimetro());
	}
}
