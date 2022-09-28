package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej9 {

	/**
	 * 9.-Hacer un algoritmoque calcule el sueldo neto semanal de un trabajador a
	 * partir de la lectura de las horas trabajadas y el precio por hora. Para el
	 * c�lculo del sueldo neto hay que tener en cuenta los siguientes datos:
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaramos las variables
		double hSem = 0.0;
		double hSemExtra;
		double pHora = 0.0;
		double pHoraExtra;
		double sueldoBruto = 0;
		double sueldoNeto;

		// declaramos un objeto scanner de la clase Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// *opcional* envolvemos el proceso de lectura con un try/catch para evitar
		// excepciones
		try {
			// bucle do while para que no se introduzcan datos invalidos
			do {
				// pedimos el valor por teclado y se lo asignamos a la variable
				System.out.println("Introduzca el numero de horas semanales trabajadas: ");
				hSem = Double.parseDouble(sc.nextLine()); // *con un nextDouble() seria suficiente, pero para que lo
															// reciba en un formato en especifico se parsea*
				if (hSem < 0) {
					System.out.println("Numero de horas semanales trabajadas invalido");
				}
			} while (hSem < 0);// si el usuario introduce un numero de horas inferior a cero volvera a
								// preguntar

			// bucle do while para que no se introduzcan datos invalidos
			do {
				// pedimos el valor por teclado y se lo asignamos a la variable
				System.out.println("Introduzca el precio por hora trabajada: ");
				pHora = Double.parseDouble(sc.nextLine());
				if (pHora < 0) {
					System.out.println("Precio por hora trabajada invalido");
				}
			} while (pHora < 0); // si el usuario introduce un precio inferior a cero volvera a preguntar

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		// condicionales para calcular el salario bruto con los valores introducidos
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

		// condicionales para calcular el salario neto con los valores introducidos
		if (sueldoBruto <= 5000) {
			sueldoNeto = sueldoBruto;
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

		else if (sueldoBruto > 5000 && sueldoBruto <= 10000) {
			sueldoNeto = sueldoBruto - (sueldoBruto * 0.05);
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

		else if (sueldoBruto > 10000) {
			sueldoNeto = sueldoBruto - (sueldoBruto * 0.15);
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}
		// cerramos el scanner
		sc.close();

	}

}
