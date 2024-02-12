package Ejercicios;

import java.util.*;

public class cadenaInvertida {
	public static void main(String[] args) { // Ejercicio 4_32
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		System.out.println("Introduce la cadena:");
		cadena = sc.nextLine();
		System.out.println(invierte(cadena));
	}

	static String invierte(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// System.out.print(cadena.charAt(i));
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		return cadenaInvertida;
	}
}
