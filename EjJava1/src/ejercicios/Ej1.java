package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio = 0.0;
		double longitud;
		double area;
		double volumen;
		final double pi = 3.1416;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Introduzca el valor del radio: ");
			radio = Double.parseDouble(sc.nextLine());
			
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
		
		longitud = pi*2*radio;
		area = radio*radio*pi;
		volumen = 4/3*pi*radio*radio*radio;
		
		System.out.println("El valor de la longitud de la circunferencia de radio " + radio + " es: " + longitud);
		System.out.println("El valor del area de la circunferencia de radio " + radio + " es: " + area);
		System.out.println("El valor del volumen de la circunferencia de radio " + radio + " es: " + volumen);
		sc.close();
		

	}

}
