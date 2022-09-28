package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

	public static void Ej1() {

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
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		longitud = pi * 2 * radio;
		area = radio * radio * pi;
		volumen = 4 / 3 * pi * radio * radio * radio;

		System.out.println("El valor de la longitud de la circunferencia de radio " + radio + " es: " + longitud);
		System.out.println("El valor del area de la circunferencia de radio " + radio + " es: " + area);
		System.out.println("El valor del volumen de la circunferencia de radio " + radio + " es: " + volumen);
		sc.close();

	}

	public static void Ej2() {

		int numero = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		if (numero > 0) {
			System.out.println(numero + " es positivo");
		} else if (numero < 0) {
			System.out.println(numero + " es negativo");
		} else {
			System.out.println(numero + " es nulo");
		}
		sc.close();

	}

	public static void Ej3() {

		int cont = 0;
		int total = 0;

//		bucle do while
		do {
			total = total + cont;
			cont++;
		} while (cont <= 100);

//		bucle while
//		while (cont <= 100) {
//			total = total + cont;
//			cont++;
//		}

//		bucle for
//		for (int i=1; i<=100; i++) {
//			total = total + i;
//		}

		System.out.println("El resultado es: " + total);
	}

	public static void Ej4() {

		int cont = 0;
		int totalPares = 0;
		int totalImpares = 0;

		do {
			if (cont % 2 == 0) {
				totalPares = totalPares + cont;
			} else {
				totalImpares = totalImpares + cont;
			}
			cont++;
		} while (cont <= 100);

		System.out.println("El resultado de los pares es: " + totalPares);
		System.out.println("El resultado de los impares es: " + totalImpares);

	}

	public static void Ej5() {

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
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		int mayor = n1;
		if (n2 > mayor) {
			mayor = n2;
		}
		if (n3 > mayor) {
			mayor = n3;
		}

		System.out.println("El mayor es " + mayor);
		sc.close();

	}

	public static void Ej6() {

		int cont = 0;
		int n = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduzca el numero de multiplos que se quiere saber de 4: ");
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Los primeros " + n + " multiplos de 4: ");
		do {
			int multiplo = cont * 4;
			System.out.println(multiplo);
			cont++;
		} while (n != cont);
		sc.close();
	}

	public static void Ej7() {

		int n = -1;

		int contMayor = 0;
		int contMenor = 0;
		int contIgual = 0;

		Scanner sc = new Scanner(System.in);

		do {

			try {

				System.out.println("Introduzca un numero (para dejar de introducir numeros pulse 0)");
				n = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Se ha producido una Exception:" + e.getMessage());
				e.printStackTrace();
			}

			if (n > 50) {
				contMayor++;
			} else if (n < 50 && n != 0) {
				contMenor++;
			} else if (n == 50) {
				contIgual++;
			}

		} while (n != 0);

		System.out.println("La cantidad de numeros introducidos mayor que 50 es: " + contMayor);
		System.out.println("La cantidad de numeros introducidos menor que 50 es: " + contMenor);
		System.out.println("La cantidad de numeros introducidos igual que 50 es: " + contIgual);
		sc.close();

	}

	public static void Ej8() {

		double gradosF = 0;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Introduzca el valoren grados Farenheit que quiere convertir a Celsius: ");
			gradosF = Double.parseDouble(sc.nextLine());

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

		double gradosC = (gradosF - 32) * 5 / 9;
		System.out.println("Introduzca el valor de " + gradosF + " en Celsius es: " + gradosC);
		sc.close();

	}

	public static void Ej9() {

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
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
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
			sueldoNeto = sueldoBruto - (sueldoBruto * 0.05);
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}

		else if (sueldoBruto > 10000) {
			sueldoNeto = sueldoBruto - (sueldoBruto * 0.15);
			System.out.println("El sueldo neto es: " + sueldoNeto);
		}
		sc.close();

	}

	public static void Ej10() {

		int n = 0;
		int nc = 0;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduzca un numero: ");
			n = sc.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Se ha producido una Exception:" + e.getMessage());
			e.printStackTrace();
		}

		do {
			n = n / 10;
			nc++;
		} while (n >= 1);

		System.out.println("El numero tiene " + nc + " cifras");
		sc.close();

	}

}
