package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int nc = 0;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduzca un numero: ");
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}

		do {
			n = n / 10;
			nc++;
		} while (n >= 1);

		System.out.println("El numero tiene " + nc + " cifras");

	}

}
