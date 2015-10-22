package br.com.inf.ufg.jhordan.propriedade153;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Propriedade153
 *
 */
public class Propriedade153Test {
    
    /**
     *
     * Testes da função propriedade153 com entrada e saída válidas
     *
     */
    @Test
    public void testPropriedade153() {
        assertEquals(false, Propriedade153.propriedade153(20));
        assertEquals(true, Propriedade153.propriedade153(153));
    }
    
    /**
     *
     * Testes da função propriedade153 para entradas inválidas
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testPropriedade153EntradaInválida() {
        Propriedade153.propriedade153(-20);
        Propriedade153.propriedade153(1000);
    }
}
