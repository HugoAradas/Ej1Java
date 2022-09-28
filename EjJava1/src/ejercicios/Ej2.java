package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	/**
	 * 2.-Construir un algoritmo que le�do un n�mero por teclado nos diga si es
	 * positivo, negativo o nulo.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int numero = 0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {

			// pedimos el valor por teclado y se lo asignamos a la variable
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		// a base de condicionales, comparamos el numero y mostramos el resultado
		if (numero > 0) {
			System.out.println(numero + " es positivo");
		} else if (numero < 0) {
			System.out.println(numero + " es negativo");
		} else {
			System.out.println(numero + " es nulo");
		}
		// cerramos el scanner
		sc.close();

	}

}
