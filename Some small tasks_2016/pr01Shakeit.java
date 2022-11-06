import java.util.Scanner;
import java.lang.*;


public class pr01Shakeit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();
        while (text.length() > 0 && pattern.length() > 0) {
            int firstIndex = text.indexOf(pattern);
            int lastIndex = text.lastIndexOf(pattern);

            if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {
                StringBuilder sb = new StringBuilder();

                sb.append(text.substring(0, firstIndex));
                sb.append(text.substring(firstIndex + pattern.length(), lastIndex));
                sb.append(text.substring(lastIndex - pattern.length(), text.length()));
                text = sb.toString();

                int indexToBeRemove = pattern.length() / 2;
                sb.setLength(0);
                sb.append(pattern).deleteCharAt(indexToBeRemove);
                pattern = sb.toString();

                System.out.println("Shaked it.");

            } else {
                break;
            }
        }

        System.out.println("No shake.");
        System.out.println(text);
    }
}