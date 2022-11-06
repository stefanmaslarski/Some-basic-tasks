import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HWHardProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String keyWord = scanner.nextLine().toLowerCase();
        String regex = keyWord;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int counter = 0;
        while(matcher.find()){
            counter++;
        }
        System.out.println(counter);

    }
}
