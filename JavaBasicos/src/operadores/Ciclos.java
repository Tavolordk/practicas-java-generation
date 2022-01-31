package operadores;

public class Ciclos {
	public static void main(String[] args) {
		int control = 0;
		/*
		 * while(control<10) { System.out.println("Control" + control); control++; }
		 */
		/*
		 * do { System.out.println("Control" + control); control++; } while (control <
		 * 10);
		 */
		/*
		 * for(int i=1;i<=10;i++) { for(int j=1;j<=10;j++) { System.out.println(i + "x"
		 * + j + "=" + (i*j)); } }
		 */
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
				
			}
			System.out.println("Control = " + i);
		}
	}
}
