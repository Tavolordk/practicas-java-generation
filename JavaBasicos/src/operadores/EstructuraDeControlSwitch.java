package operadores;

import java.util.Calendar;

public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int DIA = calendar.get(Calendar.DAY_OF_WEEK) -1;

			switch(DIA)
			{
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("No válido");
				
			}
	}
}
