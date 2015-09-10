package br.ufg.inf.es.construcao.produto;

import static org.junit.Assert.*;

/**
 *
 * Testes da classe Produto
 *
 */
public class ProdutoTest {

    public ProdutoTest() {
    }

    @org.junit.Test
    public void testProdutoCasoTrivial() {
        int a = 2;
        int b = 2;
        int expResult = 4;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testProdutoSegundoCasoTrivial() {
        int a = 10;
        int b = 8;
        int expResult = 80;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testProdutoCasoComplexo() {
        int a = 1321;
        int b = 2112;
        int expResult = a * b;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testProdutoCasoDeFronteira() {
        int a = 0;
        int b = 1;
        int expResult = a;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testProdutoSegundoCasoDeFronteira() {
        int a = 1;
        int b = 0;
        int expResult = b;
        int result = Produto.produto(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testProdutoPrimeiroParametroInvalido() throws Exception {
        int a = -1;
        int b = 2;
        Produto.produto(a, b);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testProdutoSegundoParametroInvalido() throws Exception {
        int a = 1;
        int b = -2;
        Produto.produto(a, b);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testProdutoTodosParametrosInvalidos() throws Exception {
        int a = -1;
        int b = -2;
        Produto.produto(a, b);
    }

}
