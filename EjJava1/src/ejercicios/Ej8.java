package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double gradosF = 0;

		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.println("Introduzca el valoren grados Farenheit que quiere convertir a Celsius: ");
			gradosF = Double.parseDouble(sc.nextLine());

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

		double gradosC = (gradosF-32)*5/9;
		System.out.println("Introduzca el valor de " + gradosF + " en Celsius es: " + gradosC);
		
	}

}
