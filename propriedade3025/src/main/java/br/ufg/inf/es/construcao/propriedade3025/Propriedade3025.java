package br.ufg.inf.es.construcao.propriedade3025;

/**
 *
 * Classe que implementa método propriedade3025
 *
 */
public class Propriedade3025 {

    /**
     * Método para verificação se número é ou não propriedade3025
     * 
     * @param numero int - número 
     *
     * @return boolean - true para verdadeiro e false para falso
     */
    public static boolean propriedade3025(int numero) {

        if (numero < 0 || numero > 10000) {
            throw new IllegalArgumentException("Número deve ser maior ou igual"
                    + " à zero e menor ou igual à 9999.");
        }

        int x = numero / 100;
        int y = numero % 100;
        return (Math.pow((x + y), 2) == numero) ? true : false;
    }
}
