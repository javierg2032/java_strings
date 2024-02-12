package Ejercicios;

import java.util.*;

public class contadorPalabraRepetida { //Ejercicio_4_34

	public static void main(String[] args) {
		String frase = "";
		String palabra = "";
		int posicion = 0;
		int cantidad = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la frase:");
		frase = sc.nextLine();
		System.out.println("Escribe la palabra a buscar:");
		palabra = sc.nextLine();

		while (posicion < frase.length() && posicion != -1) {
			posicion = frase.indexOf(palabra, posicion);

			if (posicion != -1) {
				cantidad++;
				posicion = posicion + palabra.length();
			}
		}

		System.out.println(cantidad);

	}
}

/*
 * while (posicion < frase.length() && posicion != -1) { posicion =
 * frase.indexOf(palabra, posicion); cantidad++; posicion =posicion+
 * palabra.length();
 * 
 * }
 */

/*
 * while (posicion < frase.length()) { if (frase.indexOf(palabra) >= 0) {
 * posicion = frase.indexOf(palabra, posicion); cantidad++; } }
 */

/*
 * while(posicion<frase.length()||posicion==-1) {
 * posicion=frase.indexOf(palabra,posicion); if(posicion>=0) { cantidad++;
 * posicion++; } System.out.println(posicion); } System.out.println(cantidad);
 */

/*
 * for (int i=0;i<frase.length();i++) { if(frase.indexOf(palabra,i)>0) {
 * cantidad++; } }
 */