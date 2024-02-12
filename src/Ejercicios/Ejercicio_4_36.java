package Ejercicios;

import java.util.*;

public class Ejercicio_4_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String fraseLimpia="";
		String palabra = "";
		String espacio = " ";
		String fin = "fin";

		do {
			System.out.println("Introduce una palabra:");
			palabra = sc.nextLine();

			frase = frase + espacio + palabra;

		} while (palabra.equalsIgnoreCase(fin) == false);
		
		for (int i =0; i < frase.length() - fin.length(); i++) {
			fraseLimpia = fraseLimpia + frase.charAt(i);
		}
		
		System.out.println(fraseLimpia.trim()); //Elimina los blancos que tenga la cadena tanto por delante como por detrás

		/*
		 * do { System.out.println("Introduce una palabra:"); palabra = sc.nextLine();
		 * if (palabra.equalsIgnoreCase(fin) == false) { frase = frase + espacio +
		 * palabra; } } while (palabra.equalsIgnoreCase(fin) == false);
		 * System.out.println(frase.trim());
		 */

	}

}
