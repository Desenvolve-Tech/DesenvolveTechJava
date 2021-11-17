import java.util.*;

public class Exercicio2 {
    /* a) Método que retorna quantas ocorrências de um elemento estão na lista
        public static int nOcorrencias(int[] l, Integer el) */

    public static int nOcorrencias(int[] al, int el) {
        int resultado = 0;

        if ((al != null)) {
            for (int i = 0; i < al.length; i++) {
                if (al[i] == el) {
                    resultado++;
                }
            }
        }
        else resultado = -1;
        return resultado;

    }

    /* b. Método que retorna true se l tem elementos repetidos
        public static boolean hasRepeat(int[] l) */
}
