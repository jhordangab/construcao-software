package br.ufg.inf.es.construcao.funcoes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Implementação para verificação de teste da soma um número inteiro.
 */
public class MatematicaTest {

    public MatematicaTest() {
    }

    /**
     * Teste para soma de um número negativo.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSomaNaturaisCasoNegativo() {
        int n = -5;
        Matematica.somaNaturais(n);
    }

    /**
     * Teste para soma de um número com caso base (n = 1).
     */
    @Test
    public void testSomaNaturaisCasoBase() {
        int n = 1;
        int expResult = 1;
        int result = Matematica.somaNaturais(n);
        assertEquals(expResult, result);
    }

    /**
     * Teste para soma de um número com caso simples (n = 4).
     */
    @Test
    public void testSomaNaturais() {
        int n = 4;
        int expResult = 10;
        int result = Matematica.somaNaturais(n);
        assertEquals(expResult, result);
    }

    /**
     * Teste para soma de um número com um número grande (n = 23123).
     */
    @Test
    public void testSomaNaturaisGrandes() {
        int n = 23123;
        int expResult = n * ((n + 1) / 2);
        int result = Matematica.somaNaturais(n);
        assertEquals(expResult, result);
    }

}
