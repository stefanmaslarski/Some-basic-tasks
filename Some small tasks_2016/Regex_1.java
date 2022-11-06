import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input != "end") {
            input = scanner.nextLine();
            String regex = "(http:\\/\\/[a-z]+.[a-z]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String toReplace = matcher.group(1);
                System.out.println("[URL href=" + matcher.group(1) + "]SoftUni[/URL]");
            }
        }
    }
}
