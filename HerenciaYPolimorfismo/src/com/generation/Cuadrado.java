package com.generation;

public class Cuadrado extends FiguraGeometrica {
    float lado=0;
	public Cuadrado() {
		super();
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	
}
