package br.ufg.inf.es.construcao.amigos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Testes da classe Amigos
 *
 */
public class AmigosTest {

    /**
     *
     * Testes da função secundária Soma Divisores com valores e retornos válidos
     *
     */
    @Test
    public void testSomaDivisores() {
        assertEquals(1, Amigos.somaDivisores(2));
        assertEquals(1, Amigos.somaDivisores(3));
        assertEquals(3, Amigos.somaDivisores(4));
        assertEquals(1, Amigos.somaDivisores(5));
        assertEquals(6, Amigos.somaDivisores(6));
        assertEquals(1, Amigos.somaDivisores(7));
        assertEquals(7, Amigos.somaDivisores(8));
        assertEquals(4, Amigos.somaDivisores(9));
        assertEquals(8, Amigos.somaDivisores(10));
        assertEquals(22, Amigos.somaDivisores(20));
    }

    /**
     *
     * Testes da função secundária Soma Divisores com entrada negativa e entrada
     * igual a zero
     *
     * @expected Erro
     *
     * Obs: Não ocorrerá esse erro quando função for executada na função
     * primária pois lá já foram tratados erro para entrada menor que 1
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testSomaDivisoresEntradaInválida() {
        Amigos.somaDivisores(-1);
        Amigos.somaDivisores(0);
    }

    /**
     *
     * Testes da função Amigos
     *
     * Entrada e saída com valores válidos
     */
    @Test
    public void testAmigos() {
        assertEquals(false, Amigos.amigos(6, 11));
        assertEquals(true, Amigos.amigos(284, 220));
    }

    /**
     *
     * Testes da função amigos com entrada do primeiro parâmetro negativa
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAmigosXNegativo() {
        Amigos.amigos(-1, 1);
    }

    /**
     *
     * Testes da função amigos com entrada do segundo parâmetro negativa
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAmigosYNegativo() {
        Amigos.amigos(1, -1);
    }

    /**
     *
     * Testes da função amigos com entrada do primeiro parâmetro igual a zero
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAmigosXIgualZero() {
        Amigos.amigos(0, 1);
    }

    /**
     *
     * Testes da função amigos com entrada do segundo parâmetro igual a zero
     *
     * @expected Erro
     *
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testAmigosYIgualZero() {
        Amigos.amigos(1, 0);
    }
}
