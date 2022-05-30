package jUnit.CuentaCadenas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContarVocalesTest {

	// Metodo que contabiliza la letra que en este caso es la 'a' dentro de la palabra 'jabali'
	@Test
	public void testContarVocales() {
		int resultado = CuentaCadenas.contarLetras('a', "Jabali");
		assertEquals("No ha funcionado el contar vocales",2, resultado);
	}

}
