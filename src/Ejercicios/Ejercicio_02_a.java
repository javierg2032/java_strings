package Ejercicios;

import java.util.*;

public class Ejercicio_02_a {

	public static void main(String[] args) { // Ejercicio 4_30

		Scanner sc = new Scanner(System.in);
		String contraseniaSecreta, adivinaContrasenia;
		System.out.println("Introduce la contraseña secreta:");
		contraseniaSecreta = sc.nextLine();
		System.out.println("Introduce la contraseña que creas correcta:");
		adivinaContrasenia = sc.nextLine();
		
		/*
		 * boolean iguales = adivinaContrasenia.equals(contraseniaSecreta); while
		 * (iguales == false) {
		 * System.out.println("Introduce la contraseña que creas correcta:");
		 * adivinaContrasenia = sc.nextLine(); if
		 * (adivinaContrasenia.equals(contraseniaSecreta)) { iguales = true; } }
		 */
		while (adivinaContrasenia.equals(contraseniaSecreta) != true) {
			if (adivinaContrasenia.compareTo(contraseniaSecreta) > 0) {
				System.out.println("La contraseña esta antes en el diccionario");
			} else
				System.out.println("La contraseña esta despues en el diccionario");
		}

	}
}