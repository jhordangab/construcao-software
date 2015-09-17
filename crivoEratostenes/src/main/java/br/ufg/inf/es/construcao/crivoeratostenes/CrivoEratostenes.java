package br.ufg.inf.es.construcao.crivoeratostenes;

/**
 *
 * @author Jhordan
 */
public class CrivoEratostenes {

    /**
     * Retorna números primos
     *
     */
    public static int[] crivoEratostenes(int array[], int quantidade) {

        if (quantidade < 1) {
            throw new IllegalArgumentException("'quantidade' não pode ser menor que 1");
        }

        int i = 2;
        while (i <= (quantidade / 2)) {
            if (array[i] == 0) {
                int c = i + i;
                while (c <= quantidade) {
                    array[c] = 1;
                    c++;
                }
            }
            System.out.println(array[i]);
            i++;
        }
        return array;
    }
}
