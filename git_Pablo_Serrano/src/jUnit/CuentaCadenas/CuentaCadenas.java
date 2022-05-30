package jUnit.CuentaCadenas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CuentaCadenas {
	
	

	

	public static int contarCadenas(String cadena, String a_leer) {

		int numCadenas = 0;

		String c = a_leer;

		boolean control = true;

		while (control) {
			if (c.contains(cadena)) {
				numCadenas++;
				c = c.replaceFirst(cadena, "");
			} else {
				control = false;
			}
		}

		return numCadenas;

	}

	public static int contarLetras(char letra, String a_leer) {

		int numVocales = 0;
		int longitud = a_leer.length();
		int contador = 0;
		//letra = a_leer.charAt(0);

		while (contador < longitud) {
			if (letra == a_leer.charAt(contador)) {
				numVocales++;
			}
			contador++;
		}

		return numVocales;

	}

}

	


