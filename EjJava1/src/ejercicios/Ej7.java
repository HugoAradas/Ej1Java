package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = -1;

		int contMayor = 0;
		int contMenor = 0;
		int contIgual = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero (para dejar de introducir numeros pulse 0)");
			n = sc.nextInt();
			
			if (n > 50) {
				contMayor++;
			}
			else if (n < 50 && n != 0) {
				contMenor++;
			}
			else if (n == 50) {
				contIgual++;
			}
			
		} while (n != 0);
		
		System.out.println("La cantidad de numeros introducidos mayor que 50 es: " + contMayor);
		System.out.println("La cantidad de numeros introducidos menor que 50 es: " + contMenor);
		System.out.println("La cantidad de numeros introducidos igual que 50 es: " + contIgual);
		
	}

}
