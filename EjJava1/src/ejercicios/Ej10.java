package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej10 {

	/**
	 * 10.-Diseñar el algoritmo de un programa que lee un número entero positivo y
	 * determina el número de dígitos necesarios para la representación de ese
	 * valor.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int n = 0;
		int nc = 0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {
			// pedimos el valor por teclado y se lo asignamos a la variable
			System.out.println("Introduzca un numero: ");
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}

		// bucle do while que va dividiendo el numero entre 10 y aumenta el contador con
		// cada pasada hasta llegar a un numero entre 9 y 1
		do {
			n = n / 10;
			nc++;
		} while (n >= 1);

		// mostramos el resultado por pantalla
		System.out.println("El numero tiene " + nc + " cifras");
		// cerramos el scanner
		sc.close();

	}

}
