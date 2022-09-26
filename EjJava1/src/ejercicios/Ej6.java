package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduzca el numero de multiplos que se quiere saber de 4: ");
			n = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Los primeros " + n + " multiplos de 4: ");
		do {
			int multiplo = cont*4;
			System.out.println(multiplo);
			cont++;
		} while (n != cont);
	}

}
