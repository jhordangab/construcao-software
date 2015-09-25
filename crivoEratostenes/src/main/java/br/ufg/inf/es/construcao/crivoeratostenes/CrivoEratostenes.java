package br.ufg.inf.es.construcao.crivoeratostenes;

public class CrivoEratostenes {

    /**
     * Método para manipulação de array, deixando nele apenas números 'primos'.
     *
     * @param array - array para verificação do crivo
     * @param quantidade - tamanho do array
     *
     */
    public static void crivoEratostenes(int[] array, int quantidade) {

        if (quantidade < 2) {
            throw new IllegalArgumentException("'quantidade' não pode ser menor"
                    + " que 2.");
        }

        if (array.length - 1 != quantidade) {
            throw new IllegalArgumentException("A quantidade é diferente do "
                    + "tamanho do vetor setado.");
        }

        for (int x = 2; x < quantidade; x++) {
            if (array[x] != 0) {
                throw new IllegalArgumentException("Valores a partir da segunda"
                        + " posição do array não podem ser diferentes de zero.");
            }
        }

        int i = 2;
        while (i <= (quantidade / 2)) {
            if (array[i] == 0) {
                int c = i + i;
                while (c <= quantidade) {
                    array[c] = 1;
                    c = c + i;
                }
            }
            i++;
        }
    }
}
