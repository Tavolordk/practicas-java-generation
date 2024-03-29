package operadores;

public class Operadores {
	public static void main(String[] args) {
		// Operadores aritmeticos
// +, -, *, %
		int a = 10;
		int b = 20;
		double c = 10.5;

		int suma = a + b;
		System.out.println(suma);
		String str1 = "Este es el resultado de la suma es: ";
		System.out.println(str1 + suma);
		System.out.println("El resultado de la resta: " + (a - b));
		// division
		int division = a / b;
		System.out.println(division);
		System.out.println("Este es el resultado de divison:" + division);

		// double division2 = (double)a / b;
		double division2 = c / b;
		// por lo menos uno de los datos debe de ser de tipo double
		// 10.0 / 20 = 0.5
		System.out.println("Este es el resultado de divison:" + division2);

		// multiplicacion
		double multiplicacion = c * a;
		System.out.println("El resultado de la division es:" + multiplicacion);

		// modulo
		double modulo = a % b;
		System.out.println("El modulo de la operacion es:" + modulo);

		/* Operador de asignacion */
		int d = 6, e; // inicializar de variables vacias
		e = 6;
		System.out.println(d + "-" + e);

		// Operador de declarion compuesta
		// +=, -=, *=, /=, &=
		// una operacion simplificada

		int f = 0, g = 5;
		f += 5;
		// f = f +5
		System.out.println(f);
		// Operadores relacionales
		/*
		 * <, >=, >= == igualdad != diferencia resultado un valor de tipo boolean
		 * /boolean (true,false)
		 */
		int h = 15, i = 25;
		String j = "hola";
		System.out.println(h > i); // false
		System.out.println(i != h);
		// System.out.println(h != j);// valores distintos y no se puedes comparar

		// Operador unario
		/*
		 * ++, -- preaasignacion ++k se le asigan el valor antes de usarse posasignacion
		 * k++ primero lee el valor despues de la suma 1
		 */
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);

		// Precedencia de operadores
		int operacion = (4+5)*6/3;
		System.out.println(operacion);
		
		int x=0, y=0;
		int operacion2=++x + y--;
		System.out.println(operacion2);
		
		int edad=18,valor1=0,valor2=1;
		int resultado=(edad<=18)?(valor1=18):(valor2=17);
		
		System.out.println(resultado);
		
		//Operadores lógicos
		System.out.println(true && false);

	}
}
