package ejercicios;

public class Ej4 {

	/**
	 * 4.-Construir un algoritmo para sumar independientemente los números pares y
	 * los impares comprendidos entre 1 y 100. Visualizar los resultados.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int cont = 0;
		int totalPares = 0;
		int totalImpares = 0;

		// un buble con una variable que va incrementando de 0 a 100 con cada pasada
		do {
			// si la variable en esa pasada es divisible entre 2, se le suma al total de los
			// pares
			if (cont % 2 == 0) {
				totalPares = totalPares + cont;
				// si la variable en esa pasada es no divisible entre 2, se le suma al total de
				// los impares
			} else {
				totalImpares = totalImpares + cont;
			}
			cont++;
		} while (cont <= 100);

		// se muestra el resultado por pantalla
		System.out.println("El resultado de los pares es: " + totalPares);
		System.out.println("El resultado de los impares es: " + totalImpares);

	}

}
