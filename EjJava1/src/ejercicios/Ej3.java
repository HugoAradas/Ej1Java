package ejercicios;

public class Ej3 {

	/**
	 * 3.-Construir un algoritmo para calcular y escribir la suma de los 100
	 * primeros números naturales. Utilizar las estructuras PARA, MIENTRAS Y
	 * REPETIR.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		int cont = 0;
		int total = 0;

//		bucle do while/repetir
		do {
			total = total + cont;
			cont++;
		} while (cont <= 100);

//		bucle while/mientras
//		while (cont <= 100) {
//			total = total + cont;
//			cont++;
//		}

//		bucle for/para
//		for (int i=1; i<=100; i++) {
//			total = total + i;
//		}

		// mostramos el resultado
		System.out.println("El resultado es: " + total);
	}

}
