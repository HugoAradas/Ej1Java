package ejercicios;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int totalPares = 0;
		int totalImpares = 0;

		do {
			if (cont%2 == 0) {
				totalPares = totalPares + cont;
			}
			else {
				totalImpares = totalImpares + cont;
			}
			cont++;
		} while (cont <= 100);
		
		System.out.println("El resultado de los pares es: " + totalPares);
		System.out.println("El resultado de los impares es: " + totalImpares);
		
	}

}
