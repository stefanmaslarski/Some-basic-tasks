import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Stefan_Petq_Valeriq on 04-May-16.
 */
public class GUnit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        Pattern pattern = Pattern.compile("");

        //      class       method       test
        TreeMap<String, TreeMap<String, TreeSet<String>>> database = new TreeMap<>();
        while (!"It's testing time".equals(line = sc.nextLine())){
            Matcher m = pattern.matcher(line);
            String classs;
            String method;
            String test;

            while (m.find()){
                classs = m.group(1);
                method = m.group(2);
                test = m.group(3);

                if(!database.containsKey(classs)){
                    database.put(classs, new TreeMap<>());
                }
                if (!database.get(classs).containsKey(method)){
                    database.get(classs).put(method, new TreeSet<>());
                }
                database.get(classs).get(method).add(test);
            }
        }
        TreeMap<String, Integer> classTotalTests = new TreeMap<>();

        for (Map.Entry<String, TreeMap<String,>> classs: database.entrySet()) {
            int totalTest = 0;
            for (Map.Entry ){

            }
            classTotalTests.put(classs.getKey(), totalTest);

        }
//        database.entrySet().stream().sorted((c1,c2) -> c1.getValue().size()
//                - c2.getValue().size());
        // 2nd way
        database.entrySet().stream().sorted((c1,c2) -> Integer.
                compare(c1.getValue().size()));

    }
}
