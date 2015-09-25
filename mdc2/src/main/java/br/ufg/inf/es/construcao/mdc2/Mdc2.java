package br.ufg.inf.es.construcao.mdc2;

/**
 *
 * Classe que implementa método mdc2
 *
 */
public class Mdc2 {

    /**
     * Método para retornar o mdc entre dois números
     *
     * @param numeroX int
     * @param numeroY int
     *
     * @return int - mdc encontrado dos dois números recebidos como parâmetros
     */
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
