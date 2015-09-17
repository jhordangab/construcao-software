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
    
    @Test
    public void testPotencia() {
        int n = 3;
        int[] array = new int[n];
        int[] expResult = {0,1,1};
        int[] result = CrivoEratostenes.crivoEratostenes(array, n);
        assertArrayEquals(expResult, result);
    }
    
}
