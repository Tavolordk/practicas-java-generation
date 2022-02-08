package com.generation;

public class Main {
	public static void main(String[] args) {
        //Con constructor vacío
		Tacos taco1 = new Tacos();
		taco1.tipoDeTortilla = "Masa Azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tamanioDeTortilla = "Mediana";
		taco1.precio = 30;
		taco1.subirPrecio(15.5f);

		System.out.println(taco1.toString());

		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Árabe";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 45;

		System.out.println(taco2.toString());
		
		//con constructor sobrecargado
		Tacos t3 = new Tacos("Tostada","Carnita",2,"chica",15);
		System.out.println(t3.toString());
		
		Tacos t4 = new Tacos(1,"Grande",23);
		if(t4.tipoDeTortilla.equals("")) {
			t4.tipoDeTortilla="Indeciso";
		}
		if(t4.tipoDeGuisado.equals("")) {
			t4.tipoDeGuisado="Indeciso";
		}
		System.out.println(t4.toString());
	}
}
