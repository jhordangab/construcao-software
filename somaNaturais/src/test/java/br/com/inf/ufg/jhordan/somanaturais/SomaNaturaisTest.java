package br.com.inf.ufg.jhordan.somanaturais;

import static org.junit.Assert.*;

/**
 *
 * Testes da classe SomaNaturais
 *
 */
public class SomaNaturaisTest {
    
    /**
     *
     * Testes da função somaNaturais com entrada e saída válidas
     *
     */
    @org.junit.Test
    public void testSomaNaturais() {
        assertEquals(3, SomaNaturais.somaNaturais(2));
        assertEquals(6, SomaNaturais.somaNaturais(3));
        assertEquals(10, SomaNaturais.somaNaturais(4));
        assertEquals(15, SomaNaturais.somaNaturais(5));
    }
    
    /**
     *
     * Testes da função somaNaturais para entradas inválidas
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSomaNaturaisEntradaInválida() {
        SomaNaturais.somaNaturais(-1);
        SomaNaturais.somaNaturais(0);
    }
    
}
