package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	/**
	 * 1.-Construir un algoritmo que tome como dato de entrada un número que
	 * corresponde a la longitud de un radio y nos calcula y escribe la longitud de
	 * la circunferencia, el área del círculo y el volumen de la esfera
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		// double para que admitan decimales
		double radio = 0.0;
		double longitud;
		double area;
		double volumen;
		final double pi = 3.1416; // declaramos pi como final porque es una constante

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {

			// pedimos el radio por teclado y se lo asignamos a la variable
			System.out.println("Introduzca el valor del radio: ");
			radio = Double.parseDouble(sc.nextLine()); // *con un nextDouble() seria suficiente, pero para que lo reciba
														// en un formato en especifico se parsea*

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

		// realizamos las cuentas necesarias para la longitud, area y volumen
		longitud = pi * 2 * radio;
		area = radio * radio * pi;
		volumen = 4 / 3 * pi * radio * radio * radio;

		// mostramos los resultados por pantalla
		System.out.println("El valor de la longitud de la circunferencia de radio " + radio + " es: " + longitud);
		System.out.println("El valor del area de la circunferencia de radio " + radio + " es: " + area);
		System.out.println("El valor del volumen de la circunferencia de radio " + radio + " es: " + volumen);
		// cerramos el scanner
		sc.close();

	}

}
