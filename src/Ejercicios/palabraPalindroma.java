package Ejercicios;

import java.util.Scanner;

public class palabraPalindroma {

	public static void main(String[] args) { // Ejercicio_4_37
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String fraseSinEspacios = "";
		String fraseInvertida = "";
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		// Quito los espacios de la cadena
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				fraseSinEspacios = fraseSinEspacios + frase.charAt(i);
			}
		}

		//System.out.println(fraseSinEspacios);

		// Ponemos todas las letras en minusculas
		fraseSinEspacios = fraseSinEspacios.toLowerCase();

		//System.out.println(fraseSinEspacios);

		// Invierto la cadena
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			fraseInvertida = fraseInvertida + fraseSinEspacios.charAt(i);
		}

		//System.out.println(fraseInvertida);

		if (fraseSinEspacios.equals(fraseInvertida)) {
			System.out.println("Es un palindromo");
		} else
			System.out.println("No es un palindromo");
	}

}
