package jUnit.inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class MediaAlquilerViviendaTestException {

	// El metodo calcula la media del precio de alquiler del codVivienda introducido
	@Test
	public void testMediaAlquilerVivienda() {
		try {
			Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
			Vivienda v1 = new Vivienda("Madrid", "01", "Calle Castilla, Nº 17");
			
			ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
			alquileres.add(new Alquiler("01","01L", "3642N", 5, 320.00, v1));
			alquileres.add(new Alquiler("02","02L", "3643N", 6, 350.22, v1));
	
			Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);
			
			i1.mediaAlquilerVivienda("02");
			fail("Fallo, deberia de haber lanzado la excepción");
		}
		catch(ArithmeticException e) {
			System.out.println("Ha funcionado la excepción ArithmeticException");
		}
	}

}
