package jUnit.Inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CalcularImporteNoPagadoTest {

	// Calcula el dinero de los alquileres que no ha pagado el cliente introducido
	@Test
	public void testCalcularImporteNoPagado() {
		Vivienda v1 = new Vivienda("Madrid", "01", "Calle Castilla, Nº 17");
		Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
		
		
		ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
		alquileres.add(new Alquiler("01","01L", "3642N", 5, 100, v1));
		alquileres.add(new Alquiler("03","01L", "3643N", 3, true,100, v2));

		
		Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);
		double resultado = i1.calcularImporteNoPagado("01L");
		assertEquals("La suma de los alquileres no pagados es incorrecta",100.00, resultado,0);
	}

}
