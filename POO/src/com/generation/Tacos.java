package com.generation;

public class Tacos  {
	private String tipoDeTortilla="";
	private String tipoDeGuisado="";
	private int numeroDeTortilla=0;
	private String tamanioDeTortilla="";
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}



	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}



	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}



	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}



	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}



	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}



	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}



	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}

	float precio=0.0f;
	
	public Tacos() {
		super();
	}
	
	

	public Tacos(int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}



	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla,
			float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}

	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica");
	}

	void subirPrecio(float aumento) {
		precio+=aumento;
	}
	
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
