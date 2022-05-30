package jUnit.Inmobiliaria;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


	@RunWith(Parameterized.class)
	public class CalcularDineroTotalInmobiliariaTestParam {
		private double precio1;
		private double precio2;
		private double precio3;
		private double resultado;
	
	public CalcularDineroTotalInmobiliariaTestParam(double precio1, double precio2, double precio3, double resultado) {
		this.precio1 = precio1;
		this.precio2 = precio2;
		this.precio3 = precio3;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]> precioAlquileres(){
		return Arrays.asList(new Object[][] {
			{150,230,200,580}, {302,0,204,506}, {-300,120,170,-10}, {350.28,200,176.98,727.26}, {100.7384,125,200,425.74}
		});
	}
	
	@Test
	public void testCalcularDineroTotalInmobiliaria() {
		Vivienda v1 = new Vivienda("Madrid", "01", "Calle Castilla, Nº 17");
		Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
		
		ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
		alquileres.add(new Alquiler("01","01L", "3642N", 5, precio1, v1));
		alquileres.add(new Alquiler("02","02L", "3643N", 6, precio2, v1));
		alquileres.add(new Alquiler("03","01L", "3643N", 3, precio3, v2));
		
		Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);

		double result = i1.calcularDineroTotalInmobiliaria();
		assertEquals("La suma de los precios no se ha realizado correctamente", resultado,result,0);
	}
}
