import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args) {
        System.out.println(0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1);
        System.out.println(Integer.MAX_VALUE+1);


        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d " , j);
            }
            System.out.println();
        }

        for (int k = num-1; k >= 1; k--) {
                for (int l = 1; l <= k; l++) {
                    System.out.printf("%d " , l);
                }
            System.out.println();
        }
    }
}
