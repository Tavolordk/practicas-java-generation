package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main extends ClaseProtected{
	public static void main(String[] args) {
		ClaseDefault prueba = new ClaseDefault();
		
		//prueba.mostrar();
		
		ClasePrivada privada=new ClasePrivada();
		
		//privada.edad =30;
		//privada.nombre = "Juan";
		privada.setSaludar("Juan");
		
		System.out.println(privada.getSaludar());
		
		//Objeto de la clase protected
		
		Main protegido = new Main();//objeto creado
		
		protegido.setEdad(18);
		
		System.out.println(protegido.getEdad());
		
	}
}
