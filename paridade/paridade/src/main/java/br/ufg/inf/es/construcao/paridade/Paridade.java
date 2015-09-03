/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.construcao.paridade;
/*
 * Implementação para verificação se inteiro é par ou não.
 */

public class Paridade {

    /**
     *
     * Verifica paridade de um número
     *
     * @param numero Número cuja paridade é verificada
     * @return {@code true} se o número fornecio é par e {@code false},caso contrário.
     *
     */
    public static boolean verifica(int numero) {
        return (numero) % 2 == 0;
    }

}
