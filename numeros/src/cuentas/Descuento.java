package cuentas;

import java.util.Scanner;

public class Descuento {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese total de su cuenta.");
		float numero = sc.nextFloat();
		if(numero>=0&&numero<1000){
			System.out.println("El descuento no es válido.");}
			else if(numero<=4999 && numero>=1000){
			System.out.println("Tu total con descuento del 10% es: " + (numero*0.9));
			}
			else if(numero<=5000 && numero>=9999){
			System.out.println("Tu total con descuento del 20% es: " + (numero*0.8));
			}else if(numero>10000){
			System.out.println("Tu total con descuento del 30% es: " + (numero*0.7));
			}else{
			System.out.println("Ha ocurrido un error." );
			}
	}
}
