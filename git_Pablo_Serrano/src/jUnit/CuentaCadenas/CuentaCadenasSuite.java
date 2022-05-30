package jUnit.CuentaCadenas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ContarCadenasTest.class, ContarVocalesTest.class, CuentaCadenasTestParam.class })
public class CuentaCadenasSuite {
}
