package EjemplosClase;

import java.util.Arrays;

public class Ejemplo_01 {

	public static void main(String[] args) {
		/*
		 * String cadena; cadena = String.valueOf(1234); System.out.println(cadena);
		 * cadena = String.valueOf(-12.34); System.out.println(cadena); cadena =
		 * String.valueOf('C'); System.out.println(cadena); cadena =
		 * String.valueOf(false); System.out.println(cadena);
		 */

		/*
		 * String cad1 = "Hola mundo"; String cad2 = "Hola mundo"; String cad3 =
		 * "Hola, buenos dias"; boolean iguales; iguales = cad1.equals(cad2);
		 * System.out.println(iguales); //devuelve true iguales = cad1.equals(cad3);
		 * System.out.println(iguales); //devuelve false
		 */

		/*
		 * String cadena = "Mi perro ladra mucho";// hay espacios entre las palabras
		 * String otraCadena = "Un bonito perro blanco";// tambien hay espacios entre
		 * las palabras boolean b = cadena.regionMatches(3, otraCadena, 10, 5);//
		 * devuelve verdadero System.out.println(b);
		 */

		/*
		 * String cad1 = "                         Mi perro se llama Perico"; String
		 * cad2 = cad1.strip(); System.out.println(cad2);
		 */

		/*
		 * String cad1 = "Mi perro pequinés se llama Perico"; int pos;
		 * pos=cad1.indexOf("s"); System.out.println(pos); pos=cad1.indexOf("perro",15);
		 * //que busque "perro" a partir del indice 15 
		 * System.out.println(pos);
		 */
		
		/*String frase = "Hola mundo";
		frase = frase.replace('o', '\u2661');
		System.out.println(frase);*/
		
	/*	String frase = "En un lugar de la Mancha";
		String[] palabras = frase.split(" ");
		System.out.println(Arrays.toString(palabras));
	*/
		
	/*	String frase="Hola mundo";
		char letras[];
		letras=frase.toCharArray();
		System.out.println(Arrays.toString(letras));*/
		
		String cad;
		char letras[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		cad = String.valueOf(letras, 2, 3);
		System.out.println(cad);
	
	
	}

}
