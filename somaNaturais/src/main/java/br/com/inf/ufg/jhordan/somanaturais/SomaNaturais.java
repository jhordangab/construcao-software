package br.com.inf.ufg.jhordan.somanaturais;

/**
 *
 * Classe que implementa método somaNaturais
 *
 */
public class SomaNaturais {
    
    /**
     * Método que retonar a soma dos naturais de um número
     *
     * @param numero int
     *
     * @return int
     *
     */
    
    public static int somaNaturais(int numero){
        
        if (numero < 1) {
            throw new IllegalArgumentException("Número não pode ser menor que 1");
        }
        
        int i = 2;
        int s = 1;
        
        while(i <= numero){
            s += i;
            i++;
        }
        return s;
    }
}
