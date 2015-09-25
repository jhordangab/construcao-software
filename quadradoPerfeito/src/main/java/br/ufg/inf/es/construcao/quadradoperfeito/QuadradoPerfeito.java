package br.ufg.inf.es.construcao.quadradoPerfeito;

/**
 *
 * Classe que implementa método para verificar se número é ou não um quadrado
 * perfeito
 *
 */
public class QuadradoPerfeito {

    /**
     * Método para verificar se número é ou não, um quadrado perfeito
     *
     * @param numero int
     *
     * @return boolean - true para verdadeiro, ou seja, é um quadrado perfeito e
     * false para falso, ou seja, não é um quadrado perfeito.
     *
     */
    public static boolean function(int numero) {

        if (numero <= 0) {
            throw new IllegalArgumentException("Número não pode ser menor que 1");
        }

        int i = 1;
        int quadrado = 1;

        while (quadrado < numero) {
            i = i + 2;
            quadrado += i;
        }
        return (quadrado == numero);

    }
}
