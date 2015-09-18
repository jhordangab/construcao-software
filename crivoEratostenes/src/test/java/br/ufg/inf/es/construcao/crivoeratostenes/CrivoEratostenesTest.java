package br.ufg.inf.es.construcao.crivoeratostenes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhordan
 */
public class CrivoEratostenesTest {

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testArrayDiferenteQuantidade() {
        int quantidade = 10;
        int[] array = new int[8];
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testQuantidadeMenor2() {
        int quantidade = 1;
        int[] array = new int[1];
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testArrayPosicaoEsperadaDiferenteZero() {
        int quantidade = 5;
        int[] array = {1, 1, 0, 2, 0};
        CrivoEratostenes.crivoEratostenes(array, quantidade);
    }

    @Test
    public void testCrivo() {
        int quantidade = 10;
        int[] array = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            array[i] = (quantidade == 0 || quantidade == 1) ? 1 : 0;
        }
        int[] expResult = {1, 1, 1, 0, 1, 0, 1, 0, 0, 0};
        int[] result = CrivoEratostenes.crivoEratostenes(array, quantidade);
        assertArrayEquals(expResult, result);
    }

}
