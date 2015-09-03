/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.paridade;

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
public class ParidadeTest {
    
    public ParidadeTest() {
    }
    
    /**
     * Teste para verificar paridade de número
     */
    
    @org.junit.Test
    public void testVerificaParidade() {
        int numero = 0;
        boolean expResult = true;
        boolean result = Paridade.verifica(numero);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste para verificar paridade de número
     */
    
    @org.junit.Test
    public void testVerificaNaoParidade() {
        int numero = 1;
        boolean expResult = false;
        boolean result = Paridade.verifica(numero);
        assertEquals(expResult, result);
    }
    
}
