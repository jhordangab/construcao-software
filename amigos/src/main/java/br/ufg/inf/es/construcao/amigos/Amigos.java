package br.ufg.inf.es.construcao.amigos;

/**
 *
 * Classe que implementa método para verificar se dois números são 'amigos'
 *
 */
public class Amigos {

    /**
     * Método para retornar se dois números são ou não 'amigos'
     *
     * @param numeroX int
     * @param numeroY int
     *
     * @return boolean - true para verdadeiro, ou seja, os dois números são
     * amigos e false para falso, ou seja, os dois números não são amigos
     *
     */
    public static boolean amigos(int numeroX, int numeroY) {
        if (numeroX <= 0 || numeroY <= 0) {
            throw new IllegalArgumentException("n e/ou m não pode ser menor que"
                    + " 1.");
        }

        int somaDivisoresX = somaDivisores(numeroX);
        int somaDivisoresY = somaDivisores(numeroY);

        return (somaDivisoresX == numeroY && somaDivisoresY == numeroX);
    }

    /**
     * Método para somar os divisores de um número
     *
     * @param numero int
     *
     * @return int - soma de todos os divisores do número informado
     *
     */
    public static int somaDivisores(int numero) {

        if (numero <= 0) {
            throw new IllegalArgumentException("Número não pode ser menor que "
                    + "1");
        }

        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
