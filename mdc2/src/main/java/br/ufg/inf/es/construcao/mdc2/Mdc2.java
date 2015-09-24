package br.ufg.inf.es.construcao.mdc2;

/**
 *
 * Classe que implementa método mdc2
 *
 */
public class Mdc2 {

    public static int mdc2(int numeroX, int numeroY) {

        if (numeroX < numeroY) {
            throw new IllegalArgumentException("Primeiro parâmetro não pode ser"
                    + " menor que o segundo parâmetro");
        }

        if (numeroY <= 0) {
            throw new IllegalArgumentException("Segundo parâmetro não pode ser"
                    + "menor ou igual a zero");
        }

        while (numeroX != numeroY) {
            if (numeroX > numeroY) {
                numeroX = numeroX - numeroY;
            } else {
                numeroY = numeroY - numeroX;
            }
        }
        return numeroX;
    }
}
