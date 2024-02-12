package Ejercicios;

import java.util.*;

public class prefijosSufijosJavalandia { // Ejercicio_4_35

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		String fraseLimpia = "";
		String prefijo = "Javalín, javalón ";
		String sufijo = " javalen, len, len";
		System.out.println("Introducir la frase: ");
		frase = sc.nextLine();

		if (frase.startsWith(prefijo) == true || fraseLimpia.endsWith(sufijo) == true) {
			if (frase.startsWith(prefijo) == true) {
				System.out.println("Está en javalandés");
				for (int i = prefijo.length(); i < frase.length(); i++) {
					fraseLimpia = fraseLimpia + frase.charAt(i);
				}
			} else {
				if (frase.endsWith(sufijo) == true) {

					System.out.println("Está en javalandés");
					for (int i = prefijo.length(); i < frase.length() - sufijo.length(); i++) {
						fraseLimpia = fraseLimpia + frase.charAt(i);
					}
				}
			}
			if (fraseLimpia.endsWith(sufijo) == true) {

				System.out.println("Está en javalandés");
				for (int i = prefijo.length(); i < fraseLimpia.length() - sufijo.length(); i++) {
					fraseLimpia = fraseLimpia + frase.charAt(i);

				}
			}
		}
				
	/*	if (frase.startsWith(prefijo) == true || fraseLimpia.endsWith(sufijo) == true) {
			if (frase.startsWith(prefijo) == true) {
				System.out.println("Está en javalandés");
				for (int i = prefijo.length(); i < frase.length(); i++) {
					fraseLimpia = fraseLimpia + frase.charAt(i);
				}
			} else {
				if (frase.endsWith(sufijo) == true) {

					System.out.println("Está en javalandés");
					for (int i = prefijo.length(); i < frase.length() - sufijo.length(); i++) {
						fraseLimpia = fraseLimpia + frase.charAt(i);
					}
				}
			}
			if (fraseLimpia.endsWith(sufijo) == true) {

				System.out.println("Está en javalandés");
				for (int i = prefijo.length(); i < fraseLimpia.length() - sufijo.length(); i++) {
					fraseLimpia = fraseLimpia + frase.charAt(i);

				}
			}
		}*/
		System.out.println(fraseLimpia);
	}
}
