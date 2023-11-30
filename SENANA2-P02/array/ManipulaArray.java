package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] lerArrayUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os elementos do array separados por espaços: ");
        String[] elementosString = scanner.nextLine().split(" ");
        int[] array = new int[elementosString.length];
        
        for (int i = 0; i < elementosString.length; i++) {
            try {
                array[i] = Integer.parseInt(elementosString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar apenas números válidos.");
                return lerArrayUsuario(); // Chama recursivamente para tentar novamente
            }
        }
        
        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int limite) {
        Random random = new Random();
        return random.ints(tamanho, 0, limite).toArray();
    }

    public static int calcularSoma(int[] array) {
        return Arrays.stream(array).sum();
    }

    public static int encontrarMaiorValor(int[] array) {
        return Arrays.stream(array).max().orElseThrow();
    }

    public static int encontrarMenorValor(int[] array) {
        return Arrays.stream(array).min().orElseThrow();
    }

    public static void main(String[] args) {
        int[] arrayUsuario = lerArrayUsuario();
        int[] arrayAleatorio = criarArrayAleatorio(5, 100);

        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));
        System.out.println("Soma do array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor do array do usuário : " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array do usuário: " + encontrarMenorValor(arrayUsuario));
        System.out.println("Maior valor do array aleatório: " + encontrarMaiorValor(arrayAleatorio));
        System.out.println("Menor valor do array aleatório: " + encontrarMenorValor(arrayAleatorio));
    }
}



    

   

