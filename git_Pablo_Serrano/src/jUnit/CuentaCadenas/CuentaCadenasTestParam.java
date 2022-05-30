package jUnit.CuentaCadenas;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuentaCadenasTestParam {
	private String cadena;
	private String cadena_leer;
	private int resultado;
	
	public CuentaCadenasTestParam(String cadena, String cadena_leer, int resultado) {
		this.cadena = cadena;
		this.cadena_leer = cadena_leer;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]> cadenas(){
		return Arrays.asList(new Object[][] {
			{"le","pelear",1}, {"ma","RealMadrid",0}, {"a","Hola soy Pablo",2}, {"3","Valencia 13-23 Murcia",2}, {"/","2012/12/10",2}
		});
	}
	
	@Test
	public void testContarCadenas() {
		int result = CuentaCadenas.contarCadenas(cadena, cadena_leer);
		assertEquals("No ha funcionado el metodo", resultado, result);
	}

}
