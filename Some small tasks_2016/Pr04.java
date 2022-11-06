import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Pr04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countLines = Integer.valueOf(br.readLine());


        HashMap<String, List<String>> methods = new HashMap<>();
        String line = "";
        String regex = "(([a-zA-Z]*[A-Z]+[a-zA-Z]*)\\s*\\()";
        Pattern pattern = Pattern.compile(regex);
        String currentKey = "";

        for (int i = 0; i < countLines; i++) {
            line = br.readLine();
            Matcher matcher = pattern.matcher(line);

            if (line.trim().startsWith("static")){
                if (matcher.find()){
                    currentKey = matcher.group(2);
                    methods.put(currentKey, new ArrayList<>());
                }
            }
            while (matcher.find()){
                String currentMatch  = matcher.group(2);
                int indexOfMatch = line.indexOf(currentMatch);
                String newString = line.substring(0, indexOfMatch);
                if (!newString.contains("new")){
                    methods.get(currentKey).add(matcher.group(2));
                }

            }
        }


//        System.out.println(methods);



        methods.entrySet().stream().sorted((e1, e2) -> {
            int element1Size = e1.getValue().size();
            int element2Size = e2.getValue().size();
            if (element1Size < element2Size){
                return 1;
            } else if (element1Size > element2Size){
                return -1;
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
//            if (Integer.compare(element1Size, element2Size) == 0){
//                return e1.getKey().compareTo(e2.getKey());
//            }
//            return Integer.compare(element1Size, element2Size);

        }).forEach(pair -> {
            if (pair.getValue().isEmpty()){
                System.out.printf("%s -> None%n" , pair.getKey());
            } else {
                System.out.printf("%s -> %d -> %s%n" , pair.getKey(), pair.getValue().size(),
                        String.join(", ", pair.getValue().stream().sorted(String::compareTo).collect(Collectors.toList())));

            }
        });
    }

}
