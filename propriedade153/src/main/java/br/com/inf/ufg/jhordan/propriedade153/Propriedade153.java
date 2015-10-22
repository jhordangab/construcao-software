package br.com.inf.ufg.jhordan.propriedade153;

/**
 *
 * Classe que implementa método propriedade153
 *
 */

public class Propriedade153 {
    
    /**
     * Verifica se um número faz parte ou não da propriedade 153
     *
     * @param numero int
     *
     * @return boolean
     *
     */
    
    public static boolean propriedade153(int numero){
        if (numero < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }
        
        if (numero >999) {
            throw new IllegalArgumentException("Número não pode ser maior que 1000");
        }
        
        int i = numero/100;
        int j = (numero - (100*i))/10;
        int k = numero % 10;
        
        return (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3) == numero);
        
    }
    
}
