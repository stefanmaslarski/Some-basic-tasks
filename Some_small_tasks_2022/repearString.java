import java.util.Scanner;

public class repearString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String rezult = repaetString(n,inputString);
        System.out.println(rezult);

    }

    public static String repaetString(int n, String pattern){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(pattern);
        }

        return stringBuilder.toString();

    }
}
