import java.util.Scanner;

public class ScannerYBuffer {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce tu nombre: \n");
         String nombre = sc.nextLine();
         System.out.println("Introduce un número: \n");
         int numero = sc.nextInt();
         System.out.println("Tu nombre es: " + nombre + " tu número es: " + numero);
	}
}
