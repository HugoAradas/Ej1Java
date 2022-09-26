package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hSem = 0.0;
		double hSemExtra;
		double pHora = 0.0;
		double pHoraExtra;
		double sueldoBruto = 0;
		double sueldoNeto;

		Scanner sc = new Scanner(System.in);

		try {
			do {
				System.out.println("Introduzca el numero de horas semanales trabajadas: ");
				hSem = Double.parseDouble(sc.nextLine());
				if (hSem < 0) {
					System.out.println("Numero de horas semanales trabajadas invalido");
				}
			} while (hSem < 0);
			do {
				System.out.println("Introduzca el precio por hora trabajada: ");
				pHora = Double.parseDouble(sc.nextLine());
				if (pHora < 0) {
					System.out.println("Precio por hora trabajada invalido");
				}
			} while (pHora < 0);

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

		if (hSem <= 35) {
			sueldoBruto = hSem * pHora;
			System.out.println("El sueldo bruto es: " + sueldoBruto);
		}

		else if (hSem > 35) {
			hSemExtra = hSem - 35;
			pHoraExtra = hSemExtra * pHora * 1.5;
			sueldoBruto = hSem * pHora + pHoraExtra;
			System.out.println("El sueldo bruto es: " + sueldoBruto);
		}

		if (sueldoBruto <= 5000) {
			sueldoNeto = sueldoBruto;
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

		else if (sueldoBruto > 5000 && sueldoBruto <= 10000) {
			sueldoNeto = sueldoBruto - (sueldoBruto*0.05);
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

		else if (sueldoBruto > 10000) {
			sueldoNeto = sueldoBruto - (sueldoBruto*0.15);	
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

	}

}
