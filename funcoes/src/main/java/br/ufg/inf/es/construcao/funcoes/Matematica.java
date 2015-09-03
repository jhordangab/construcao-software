package br.ufg.inf.es.construcao.funcoes;

/**
 *
 * Funções matemáticas
 *
 */
public class Matematica {

    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n");
        }
        int soma = 0;
        while (n >= 0) {
            soma = soma + n;
            n--;
        }
        return soma;
    }

}
