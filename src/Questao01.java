import java.util.Arrays;

public class Questao01 {

    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 4, 6};

        Arrays.sort(arr);

        int i = arr.length / 2;

        System.out.println(arr[i]);

    }
}