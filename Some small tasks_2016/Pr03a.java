import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pr03a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringBuilder sb = new StringBuilder();
        String before = "";
        String message = "";
        String after = "";

        while (!line.equals("Over!")) {

            Integer number = Integer.valueOf(br.readLine());

            String regex = String.format("^([0-9]+)([a-zA-Z]+)([^a-zA-Z\\n]*)$", number);
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                before = matcher.group(1);
                sb.append(before);
                message = matcher.group(2);
                after = matcher.group(1);
                sb.append(after);

            }
            sb.toString();
            StringBuilder verificationCode = new StringBuilder();


            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    if (sb.charAt(i) < message.length()) {

                        verificationCode.append(message.charAt(i));
                    } else {

                        verificationCode.append(" ");
                    }
                }

            }


            System.out.printf("%s == %s", message, verificationCode.toString());
        }



        line = br.readLine();

    }

}

