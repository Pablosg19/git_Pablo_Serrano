package jUnit.inmobiliaria;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalcularDineroTotalInmobiliariaTestParam.class, CalcularImporteNoPagadoTest.class,
		MediaAlquilerViviendaTestException.class, MostrarAlquilerTestException.class, PagarAlquilerTest.class })
public class InmnobiliariaSuite {

}
