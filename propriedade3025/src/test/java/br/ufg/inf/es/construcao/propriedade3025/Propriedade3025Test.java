package br.ufg.inf.es.construcao.propriedade3025;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Propriedade3025
 *
 */
public class Propriedade3025Test {

    /**
     * Testes da função Propriedade3025 com entrada e saída válidas
     */
    @Test
    public void testPropriedade3025() {
        assertEquals(true, Propriedade3025.propriedade3025(2025));
        assertEquals(true, Propriedade3025.propriedade3025(9801));
        assertEquals(true, Propriedade3025.propriedade3025(3025));
        assertEquals(false, Propriedade3025.propriedade3025(1123));
        assertEquals(false, Propriedade3025.propriedade3025(321));
        assertEquals(false, Propriedade3025.propriedade3025(12));
    }

    /**
     *
     * Testes da função Propriedade3025 para entrada com inválidos ou diferentes
     * do esperado
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPropriedade3025EntradaInválida() {
        Propriedade3025.propriedade3025(-1);
        Propriedade3025.propriedade3025(-10);
        Propriedade3025.propriedade3025(10000);
        Propriedade3025.propriedade3025(23123);

    }
}
