package br.ufg.inf.es.construcao.quadradoPerfeito;

/**
 *
 * Classe que implementa método para verificar se número é ou não um quadrado
 * perfeito
 *
 */
public class QuadradoPerfeito {

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
