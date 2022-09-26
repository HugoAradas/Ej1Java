package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej8 {

	/**
	 * 8.-Escribir un algoritmoque lea una temperatura en grados Fahrenheit y
	 * escriba su equivalente en grados centígradosC=(F-32)*5/9
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variable
		double gradosF = 0.0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {

			// pedimos el valor por teclado y se lo asignamos a la variable
			System.out.println("Introduzca el valoren grados Farenheit que quiere convertir a Celsius: ");
			gradosF = Double.parseDouble(sc.nextLine()); // *con un nextDouble() seria suficiente, pero para que lo
															// reciba en un formato en especifico se parsea*

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}

		// hacemos el traspaso a Celsius y mostramos el resultado por pantalla
		double gradosC = (gradosF - 32) * 5 / 9;
		System.out.println("Introduzca el valor de " + gradosF + " en Celsius es: " + gradosC);
		// cerramos el scanner
		sc.close();

	}

}
