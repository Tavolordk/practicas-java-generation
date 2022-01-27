import java.util.Scanner;

public class NumeroParImpar {
	public static int resultado(int numero) {
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
		return numero;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int res = resultado(numero);
	}
}
