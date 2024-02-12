package Ejercicios;

import java.util.*;

public class Ejercicio_02_b {

	public static void main(String[] args) { // Ejercicio 4_30

		Scanner sc = new Scanner(System.in);
		String contraseniaSecreta, adivinaContrasenia;
		System.out.println("Introduce la contraseña secreta:");
		contraseniaSecreta = sc.nextLine();
		System.out.println("La longitud de la contraseña es: " + contraseniaSecreta.length());
		System.out.println("Introduce la contraseña que creas correcta:");
		adivinaContrasenia = sc.nextLine();

		while (adivinaContrasenia.equals(contraseniaSecreta) != true) {
			String cadenaConstruida = "";
			if (contraseniaSecreta.length() == adivinaContrasenia.length()) {
				for (int i = 0; i < contraseniaSecreta.length(); i++) {
					if (contraseniaSecreta.charAt(i) == adivinaContrasenia.charAt(i)) {
						cadenaConstruida = cadenaConstruida + contraseniaSecreta.charAt(i);
					} else {
						cadenaConstruida = cadenaConstruida + "*";
					}

				}
				System.out.println(cadenaConstruida);
			} else {
				System.out.println("La contraseña es de diferente tamaño");
			}
			if (adivinaContrasenia.compareTo(contraseniaSecreta) > 0) {
				System.out.println("La contraseña esta antes en el diccionario");
			} else
				System.out.println("La contraseña esta despues en el diccionario");
		}
	}
}