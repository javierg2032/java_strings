package Ejercicios;

import java.util.*;

public class cadenaSinVocales { //Ejercicio_4_33

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreCompleto = "";

		System.out.println("Introduce un nombre completo:");
		nombreCompleto = sc.nextLine();

		String sinVocales = "";

		for (int i = 0; i < nombreCompleto.length(); i++) {
			if (esVocal(nombreCompleto.charAt(i)) == false) {
				sinVocales = sinVocales + nombreCompleto.charAt(i);
			}
		}

		System.out.println(sinVocales);

	}

	static boolean esVocal(char c) {
		boolean resultado = false;
		String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";
		if (vocales.indexOf(c) >= 0) {
			resultado = true;
		}

		return resultado;

	}

}
