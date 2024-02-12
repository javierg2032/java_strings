package Ejercicios;
import java.util.*;

public class Ejercicio_4_38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		System.out.println("Introduce una palabra:");
		String palabra = sc.nextLine();
		palabra = palabra.toLowerCase();
		String palabraCodificada = "";
		char letras[];
		letras = palabra.toCharArray();
		for (int i = 0; i < letras.length; i++) {
			char letra = letras[i];
			palabraCodificada = palabraCodificada + codifica(conjunto1, conjunto2, letra);
		}
		System.out.println(palabraCodificada);
	}

	static char codifica(char conjunto1[], char conjunto2[], char c) {
		for (int i = 0; i < conjunto1.length; i++) {
			if (c == conjunto1[i]) {
				c = conjunto2[i];
			}
		}
		return c;
	}
}
