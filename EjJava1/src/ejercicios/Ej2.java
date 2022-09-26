package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una FileNotFoundException:" + e.getMessage());
			e.printStackTrace();
		}
		
		if (numero > 0) {
			System.out.println(numero + " es positivo");
		}
		else if (numero < 0) {
			System.out.println(numero + " es negativo");
		}
		else {
			System.out.println(numero + " es nulo");
		}

	}

}
