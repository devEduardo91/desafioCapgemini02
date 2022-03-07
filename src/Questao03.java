import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        scanner.close();

        frase = frase.replace(" ", "");

        int raizQuadrada = (int) Math.ceil(Math.sqrt(frase.length()));

        List<String> grid = new ArrayList<>();

        String fraseFinal = "";
        for (int i = 0; i < frase.length(); i += raizQuadrada) {
            if (i + raizQuadrada > frase.length()) {
                grid.add(frase.substring(i, i + (frase.length()) - i));
            } else {
                grid.add(frase.substring(i, i + raizQuadrada));
            }
        }

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < raizQuadrada; j++) {
                if (grid.get(j).length() > i) {
                    fraseFinal += grid.get(j).toCharArray()[i];
                }
            }
            fraseFinal += " ";
        }

        System.out.println(fraseFinal);
    }
}

