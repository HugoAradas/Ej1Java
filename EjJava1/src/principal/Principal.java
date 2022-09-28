package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicios.Ejercicios;

public class Principal {

	/**
	 * Clase principal con un switch para probar desde la terminal el funcionamiento
	 * de los ejercicios
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * El switch se encarga de pedir valores numericos correspondientes a los
		 * ejercicios y llama a los metodos correspondientes para ejecutarlos
		 */

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		boolean menuValido = false;

		do {
			try {
				System.out.println(
						"Selecciona un ejercicio: \n 1. Ejercicio 1 \n 2. Ejercicio 2 \n 3. Ejercicio 3 \n 4. Ejercicio 4 \n 5. Ejercicio 5 \n 6. Ejercicio 6 "
						+ "\n 7. Ejercicio 7 \n 8. Ejercicio 8 \n 9. Ejercicio 9 \n 10. Ejercicio 10 \n 0. Salir");
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Se ha producido una Exception:" + e.getMessage());
				e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println("Se ha producido una Exception:" + e.getMessage());
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("Se ha producido una Exception:" + e.getMessage());
				e.printStackTrace();
			}
			menuValido = (menu < 0 || menu > 10 ? false : true);
			if (!menuValido) {
				System.out.println("Introduce una opcion valida");
			}
			switch (menu) {
			case 1:
				System.out.println("Ejercicio 1");
				Ejercicios.Ej1();
				menuValido = false;
				break;
			case 2:
				System.out.println("Ejercicio 2");
				Ejercicios.Ej2();
				menuValido = false;
				break;
			case 3:
				System.out.println("Ejercicio 3");
				Ejercicios.Ej3();
				menuValido = false;
				break;
			case 4:
				System.out.println("Ejercicio 4");
				Ejercicios.Ej4();
				menuValido = false;
				break;
			case 5:
				System.out.println("Ejercicio 5");
				Ejercicios.Ej5();
				menuValido = false;
				break;
			case 6:
				System.out.println("Ejercicio 6");
				Ejercicios.Ej6();
				menuValido = false;
				break;
			case 7:
				System.out.println("Ejercicio 7");
				Ejercicios.Ej7();
				menuValido = false;
				break;
			case 8:
				System.out.println("Ejercicio 8");
				Ejercicios.Ej8();
				menuValido = false;
				break;
			case 9:
				System.out.println("Ejercicio 9");
				Ejercicios.Ej9();
				menuValido = false;
				break;
			case 10:
				System.out.println("Ejercicio 10");
				Ejercicios.Ej10();
				menuValido = false;
				break;
			case 0:
				System.out.print("Ha elegido salir del programa, bye bye!");
				break;
			}

		} while (!menuValido);

	}

}
