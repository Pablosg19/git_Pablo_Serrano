package jUnit.inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PagarAlquilerTest {

	// El metodo cambia el boolean pagado a true para saber que el alquiler ha sido pagado
	@Test
	public void testPagarAlquiler() {
		Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
		
		ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
		alquileres.add(new Alquiler("01","01L", "3642N", 5, true,100.00, v2));
		alquileres.add(new Alquiler("03","01L", "3643N", 3, 100, v2));

		Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);
		
		boolean resultado = i1.pagarAlquiler("03");
		assertTrue("El alquiler no se ha podido pagar", resultado);
	}
	
}
