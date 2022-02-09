package com.generation;

public abstract class FiguraGeometrica {
	private String nombre;
	private float alto;
	private float largo;

	public FiguraGeometrica() {
		super();
	}

	public FiguraGeometrica(String nombre, float alto, float largo) {
		super();
		this.nombre = nombre;
		this.alto = alto;
		this.largo = largo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public abstract float calcularArea();
	public abstract float perimetro();
}
