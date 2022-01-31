package operadores;

import java.util.Scanner;

public class Calculadora {

public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	float n1,n2;
	int opcion=0;
	System.out.println("Inserte número 1:\n");
	n1=sc.nextFloat();
	System.out.println("Inserte número 2:\n");
	n2=sc.nextFloat();
	System.out.println("SELECCIONE LA OPERACIÓN A REALIZAR\n "
			+ "SUMA...[1]\n RESTA...[2]\n MULTIPLICACIÓN...[3]\n DIVISIÓN...[4]\n");
	opcion=sc.nextInt();
	switch(opcion) {
	case 1:
		try {
			float suma=n1+n2;
			System.out.println("SUMA: " + suma);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	 break;
	case 2:
		try {
			float resta = n1-n2;
			System.out.println("RESTA: " + resta);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		break;
	case 3:
		try {
			float multiplicacion=n1*n2;
			System.out.println("MULTIPLICACIÓN: " + multiplicacion);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		break;
	case 4:
		try {
			float division = n1/n2;
			System.out.println("DIVISIÓN: " + division);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		break;
	  default:
		  System.out.println("Error");
		  break;
	}
	
}
}
