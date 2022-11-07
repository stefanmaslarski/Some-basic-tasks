import java.util.Arrays;
import java.util.Scanner;

public class FunctionalPrgoraming {
    public static void main(String[] args) {


        // 2 -3 5 65 78 43 55
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int[] numberArray = Arrays.stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int a: numberArray) {
            System.out.printf("%d ", a);
        }

    }
}

