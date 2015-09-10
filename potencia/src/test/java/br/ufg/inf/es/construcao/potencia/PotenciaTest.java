package br.ufg.inf.es.construcao.potencia;

import static org.junit.Assert.*;

/**
 *
 * Classe para testes da potência
 *
 */
public class PotenciaTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPotenciaBaseInvalida() {
        int x = -1;
        int y = 0;
        Potencia.potencia(x, y);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPotenciaExpoenteInvalido() {
        int x = 1;
        int y = -1;
        Potencia.potencia(x, y);
    }

    @org.junit.Test
    public void testPotenciaTrivial() {
        int x = 1;
        int y = 1;
        int expResult = 1;
        int result = Potencia.potencia(x, y);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testPotenciaCasoDeFronteira() {
        int x = 1;
        int y = 0;
        int expResult = 1;
        int result = Potencia.potencia(x, y);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testPotenciaSimples() {
        int x = 2;
        int y = 3;
        int expResult = 8;
        int result = Potencia.potencia(x, y);
        assertEquals(expResult, result);
    }

}
