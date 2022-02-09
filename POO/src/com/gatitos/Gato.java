package com.gatitos;

public class Gato {
	private String nombre; /// como no tienen valores es por default
	private int patas;
	private boolean adoptado;
	//getters y setters
	// todos los metodos deben ser publicos
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		if(patas<=0 && patas < 5 ) {//0-4
			this.patas=patas;
		}else {
			
		}
		//
	}
	public boolean isAdoptado() { //is porque realiza una pregunta
		return this.adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado=adoptado;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}


}
