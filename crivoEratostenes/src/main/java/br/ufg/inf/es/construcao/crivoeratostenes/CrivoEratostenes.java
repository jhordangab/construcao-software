package br.ufg.inf.es.construcao.crivoeratostenes;

public class CrivoEratostenes {

    /**
     * Retorna números primos de determinado array
     *
     * @param array
     * @param quantidade
     * @return array com os números primos
     */
    public static int[] crivoEratostenes(int[] array, int quantidade) {

        if (quantidade < 2) {
            throw new IllegalArgumentException("'quantidade' não pode ser menor"
                    + " que 2");
        }

        if (array.length != quantidade) {
            throw new IllegalArgumentException("O tamanho do array é diferente "
                    + "da quantidade informada");
        }

        for (int x = 2; x < quantidade; x++) {
            if (array[x] != 0) {
                throw new IllegalArgumentException("Valores a partir da segunda"
                        + " posição do array não podem ser diferentes de zero");
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
        return array;
    }
}
