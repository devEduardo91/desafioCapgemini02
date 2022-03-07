import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        System.out.println("Digite os elementos do vetor ");
        String elementos = scanner.nextLine().replace(" ", "");

        System.out.println("Digite a diferença entre os elementos");
        int x = scanner.nextInt();
        scanner.close();

        int[] vetor = new int[elementos.length()];

        for (int i = 0; i < elementos.length(); i++) {
            vetor[i] = Character.getNumericValue(elementos.toCharArray()[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {

                if (vetor[i] - vetor[j] == x) {
                    aux++;
                }
            }
        }
        System.out.println("Total de pares formados " + aux);
    }

}
