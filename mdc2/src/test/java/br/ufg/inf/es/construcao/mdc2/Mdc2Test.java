package br.ufg.inf.es.construcao.mdc2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Mdc2
 *
 */
public class Mdc2Test {

    /**
     * Testes da função Mdc2 com entrada e saída válidas
     */
    @Test
    public void testMdc2() {
        assertEquals(1, Mdc2.mdc2(3, 1));
        assertEquals(10, Mdc2.mdc2(20, 10));
        assertEquals(1, Mdc2.mdc2(15, 7));
        assertEquals(2, Mdc2.mdc2(20, 6));
        assertEquals(5, Mdc2.mdc2(25, 10));
    }

    /**
     *
     * Testes da função Mdc2 perfeito para entrada com inválidos ou diferentes
     * do esperado
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testMdc2EntradaInválida() {
        Mdc2.mdc2(1, 2);
        Mdc2.mdc2(3, 6);
        Mdc2.mdc2(5, 0);
        Mdc2.mdc2(8, -10);
    }
}
