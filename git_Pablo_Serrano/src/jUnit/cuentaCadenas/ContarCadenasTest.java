package jUnit.cuentaCadenas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContarCadenasTest {

	// Metodo que contabiliza la cadena que en este caso es 'ci' dentro de la palabra 'murcielago'
	@Test
	public void testContarCadenas() {
		int resultado = CuentaCadenas.contarCadenas("ci", "Murcielago");
		assertEquals("No ha funcionado el contar cadenas",1,resultado);
	}

}
