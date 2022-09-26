package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

	/**
	 * 5.-Construir un algoritmo que leídos tres números introducidos por teclado me
	 * visualice el mayor.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables para almacenar los 3 numeros
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {
			
			// pedimos los valores por teclado y se lo asignamos a la variable
			System.out.println("Introduzca el primer numero: ");
			n1 = sc.nextInt();
			System.out.println("Introduzca el segundo numero: ");
			n2 = sc.nextInt();
			System.out.println("Introduzca el tercer numero: ");
			n3 = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}

		// hacemos una breve comparacion para determinar el numero de mayor valor
		int mayor = n1;
		if (n2 > mayor) {
			mayor = n2;
		}
		if (n3 > mayor) {
			mayor = n3;
		}

		// mostramos el resultado por pantalla
		System.out.println("El mayor es " + mayor);
		// cerramos el scanner
		sc.close();

	}

}
