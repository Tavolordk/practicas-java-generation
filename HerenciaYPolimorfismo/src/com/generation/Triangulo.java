package com.generation;

public class Triangulo extends FiguraGeometrica {
	public Triangulo() {
		super();
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return getAlto()*getLargo()/2;
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 2*getAlto()+getLargo();
	}
}
