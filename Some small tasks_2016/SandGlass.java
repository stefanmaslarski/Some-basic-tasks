import java.util.Scanner;

/**
 * Created by Stefan_Petq_Valeriq on 04-May-16.
 */
public class SandGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int counterAsterix = 0;
        int counterDots = 0;
        int height = n;
        int width = n;

        for (int i = 0; i < n; i++) {
            System.out.printf("%c",'*');
        }
        System.out.println();
//        System.out.printf("%c%s%c",'.',new String(counterAsterix,"*"),'.');
        System.out.println();
        System.out.printf("%c%c%s%c%c",'.','.',"*",'.','.');
        System.out.println();
        System.out.printf("%c%s%c",'.',"***",'.');
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%c",'*');
        }
    }
}
