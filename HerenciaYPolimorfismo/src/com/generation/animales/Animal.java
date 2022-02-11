package com.generation.animales;

public class Animal {
	private String nombre;
	private int edad;
	private String sexo;
	private String color;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void comer() {
		System.out.println("Estoy comiendo");
	}
	
	public void dormir() {
		System.out.println("Zzzzzzzzzz");
	}
}
