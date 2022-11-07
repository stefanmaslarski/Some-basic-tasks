import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        /// a b c d e

        for (int i = 0; i < input.length/2; i++) {
            String oldletter = input[i];
            input[i]= input[input.length-1-i];
            input[input.length-1-i] = oldletter;

        }


            System.out.println(String.join(", ",input));

    }
}
