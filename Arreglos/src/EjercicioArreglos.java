
public class EjercicioArreglos {
	public static void main(String[] args) {
		int[] num = { 1, 6, 45, 53, 80, 102, 145, 326, 450, 892 };
		int sumaPares=0;
		int sumaImpares=0;
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==0) {
				sumaPares=sumaPares+num[i];
				System.out.println(num[i] + " par");
			}
			
			else if(num[i]%2!=0) {
				sumaImpares=sumaImpares+num[i];
				System.out.println(num[i] + " impar");
			}
			if(i==9) {
				System.out.println("La suma de números par es: " + sumaPares);
				System.out.println("La suma de números impar es: " + sumaImpares);
			}
			
		}
	}
}
