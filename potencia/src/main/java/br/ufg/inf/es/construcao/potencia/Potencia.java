package br.ufg.inf.es.construcao.potencia;

/**
 *
 * Classe para retornar a potencia de um numero
 *
 */
public class Potencia {

    /**
     * Retorna potência de determinada base e determinado expoente
     *
     * @param x Base para retorno da potência.
     * @param y Expoente para retorno da potência.
     * @return p
     */
    public static int potencia(int x, int y) {

        if (x < 0 || y >= 0) {
            throw new IllegalArgumentException("x e/ou y inválidos.");
        }

        int i = 1;
        int p = 1;

        while (i <= p) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }

}
