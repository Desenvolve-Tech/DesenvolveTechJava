import java.util.Arrays;

public class Exercicio1 {

    public static void main(String[] args) {

        // a) Instancie um arranjo de inteiros com 20 posições

        int[] numbers = new int[20];

        //b) Inicialize cada posição do arranjo com o valor de sua posição, multiplicado por 10
        //c) Exiba o arranjo;

        System.out.println("Arranjo: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        //d) Inverta o arranjo ([2,5,7,1] → [1,7,5,2])
        //e) Exiba o arranjo
        System.out.println("Arranjo invertido: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}