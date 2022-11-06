import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pr03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());


        StringBuilder input = new StringBuilder();

        for (int i = 0; i < n; i++) {
            input.append(br.readLine());

        }
        List<String> names = new ArrayList<String>();
        List<String> message = new ArrayList<String>();

        // names
        String patternNames = br.readLine();
        String regexName = String.format("%s(?<name>[a-zA-Z]{%d}(?![a-zA-Z]))", patternNames, patternNames.length());
        Pattern pat = Pattern.compile(regexName);
        Matcher matcher = pat.matcher(input.toString());
        while (matcher.find()) {
            names.add(matcher.group("name"));


        }


        // messages

        String patternMessages = br.readLine();
        String regexMessages = String.format("%s(?<message>[a-zA-Z0-9]{%d}(?![a-zA-Z0-9]))", patternMessages, patternMessages.length());
        Pattern patt = Pattern.compile(regexMessages);
        Matcher matcherr = patt.matcher(input.toString());
        while (matcherr.find()) {
            message.add(matcherr.group("message"));

        }

        Integer[] indexOfaMessages = Arrays.stream(br.readLine()
                .split("[\\s]+")).map(Integer::parseInt).toArray(Integer[]::new);
//        List<Integer> reducedindexOfaMessages = new ArrayList <>();


//        for (int i = 0; i < indexOfaMessages.length; i++) {
//            indexOfaMessages[i]--;
//            System.out.println(indexOfaMessages[i]);
//        }
//        for (Integer digit :
//                indexOfaMessages) {
//
//            digit--;
//            reducedindexOfaMessages.add(digit);
//        }



//        for (int i = 0; i < names.size(); i++) {
//            if (reducedindexOfaMessages.get(i) >  message.size() - 1){
//                return;
//            }
//            String out = String.format("%s - %s", names.get(i), message.get(reducedindexOfaMessages.get(i)) );
//            System.out.println(out);
//
//        }
        int jediCounter = 0;

        for (int i = 0; i < indexOfaMessages.length; i++) {
            if ((indexOfaMessages[i] - 1) < message.size() && jediCounter < names.size()){
                System.out.println(String.format("%s - %s", names.get(jediCounter), message.get((indexOfaMessages[i] - 1))));
                jediCounter++;
            }
        }













    }
}
