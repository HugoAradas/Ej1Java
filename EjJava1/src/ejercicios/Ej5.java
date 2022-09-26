package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
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
		
		int mayor = n1;
		if (n2 > mayor) {
			mayor = n2;
		} if (n3 > mayor) {
			mayor = n3;
		}
		
		System.out.println("El mayor es " + mayor);
		
	}

}
