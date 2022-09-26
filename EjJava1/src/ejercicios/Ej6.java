package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6 {

	/**
	 * 6.-Construir un algoritmo para visualizar los N primeros múltiplosde 4, donde
	 * N es un número que se lee por teclado.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int cont = 0;
		int n = 0;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {

			// pedimos el valor por teclado y se lo asignamos a la variable
			System.out.println("Introduzca el numero de multiplos que se quiere saber de 4: ");
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}

		// mostramos el resultado por pantalla
		System.out.println("Los primeros " + n + " multiplos de 4: ");
		// bucle do while que va mostrando los multiplos pedidos
		do {
			int multiplo = cont * 4;
			System.out.println(multiplo);
			cont++;
		} while (n != cont);
		// cerramos el scanner
		sc.close();
	}

}
