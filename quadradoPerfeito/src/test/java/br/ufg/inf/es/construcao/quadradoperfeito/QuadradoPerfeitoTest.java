package br.ufg.inf.es.construcao.quadradoperfeito;

import br.ufg.inf.es.construcao.quadradoPerfeito.QuadradoPerfeito;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe QuadradoPerfeito
 *
 */
public class QuadradoPerfeitoTest {

    /**
     *
     * Testes da função quadradoPerfeito com entrada e saída válidas
     *
     */
    @Test
    public void testQuadradoPerfeito() {
        assertEquals(true, QuadradoPerfeito.function(1));
        assertEquals(true, QuadradoPerfeito.function(4));
        assertEquals(true, QuadradoPerfeito.function(9));
        assertEquals(true, QuadradoPerfeito.function(16));
        assertEquals(true, QuadradoPerfeito.function(25));
        assertEquals(false, QuadradoPerfeito.function(5));
        assertEquals(false, QuadradoPerfeito.function(10));
        assertEquals(false, QuadradoPerfeito.function(20));
        assertEquals(false, QuadradoPerfeito.function(30));
        assertEquals(false, QuadradoPerfeito.function(99));
    }

    /**
     *
     * Testes da função quadrado perfeito para entrada com valores negativos e
     * entrada igual a zero
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSomaDivisoresEntradaInválida() {
        QuadradoPerfeito.function(-1);
        QuadradoPerfeito.function(-5);
        QuadradoPerfeito.function(-10);
        QuadradoPerfeito.function(0);
    }

}
