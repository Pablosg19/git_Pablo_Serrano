package jUnit.Inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MostrarAlquilerTestException {

	// El metodo consiste en pedir la casilla del alquiler a mostrar
	@Test
	public void testMostrarAlquiler() {
		try {
			Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
			
			ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
			alquileres.add(new Alquiler("01","01L", "3642N", 5, true,100.00, v2));
			alquileres.add(new Alquiler("03","01L", "3643N", 3, 100, v2));
	
			Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);
			
			i1.mostrarAlquiler(3);
			fail("Fallo, deberia de haber lanzado la excepción");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Ha funcionado la excepción IndexOutOfBoundsException");
		}
	}

}
