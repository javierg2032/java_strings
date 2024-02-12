package Ejercicios;

import java.util.*;

public class Ejercicio_01 { // Ejercicio 4_29

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud1, longitud2;
		String cad1, cad2;
		System.out.println("Introduce la cadena 1:");
		cad1 = sc.nextLine();
		System.out.println("Introduce la cadena 2:");
		cad2 = sc.nextLine();
		longitud1 = cad1.length();
		System.out.println(longitud1);
		longitud2 = cad2.length();
		System.out.println(longitud2);
		if (longitud1 > longitud2) {
			System.out.println("La cadena 1 es mas larga que la 2");
		} else {
			if (longitud1 < longitud2) {
				System.out.println("La cadena 2 es mas larga que la 1");
			} else
				System.out.println("Ambas cadenas miden lo mismo");
		}

	}
}
