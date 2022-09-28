package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej7 {

	/**
	 * 7.-Construir un algoritmopara introducir una serie de n�meros, que finaliza
	 * al leer el n�mero 0. Una vez que ha finalizadala captura de n�meros queremos
	 * saber cuantos hab�a mayores, iguales y menores que 50.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int n = -1;

		int contMayor = 0;
		int contMenor = 0;
		int contIgual = 0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// bucle que va pidiendo numeros constantemente al usuario hasta que introduce
		// el 0
		do {

			// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
			// excepciones
			try {

				// pedimos los valores por teclado y se lo asignamos a la variable
				System.out.println("Introduzca un numero (para dejar de introducir numeros pulse 0)");
				n = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Se ha producido una Exception:" + e.getMessage());
				e.printStackTrace();
			}

			// condicionales para distinguir los numeros y aumentar la cuenta segun este
			if (n > 50) {
				contMayor++;
			} else if (n < 50 && n != 0) {
				contMenor++;
			} else if (n == 50) {
				contIgual++;
			}

		} while (n != 0);

		// mostramos los resultados por pantalla
		System.out.println("La cantidad de numeros introducidos mayor que 50 es: " + contMayor);
		System.out.println("La cantidad de numeros introducidos menor que 50 es: " + contMenor);
		System.out.println("La cantidad de numeros introducidos igual que 50 es: " + contIgual);
		// cerramos el scanner
		sc.close();

	}

}
