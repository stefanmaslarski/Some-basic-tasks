

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    //bufferreader vs scanner
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int arrayLengt = Integer.valueOf(br.readLine());
//        int[] arrayNum = new int[arrayLengt];
//        for (int i = 0; i < arrayNum.length; i++) {
//            arrayNum[i] = Integer.valueOf(br.readLine());
//        }
//        List<Integer> listInt = new ArrayList<>();
//        for (int num :
//                arrayNum) {
//            System.out.printf("%d ", num);
//            listInt.add(num);
//
//        }
//        List<String> namesList = new ArrayList<>();
//        String[] names = new String[]{"Rosa", "Ivan", "Gosho", "Ivancho"};
//        for (String name: names) {
//            namesList.add(name);
//        }

//        List<String> nums = new ArrayList<String>(Arrays.asList("1", "2"));
//
//        List<Integer> numbers = new ArrayList<>();
//        Integer[] number = new Integer[nums.size()];
//
//
//        number= nums.stream().map(x -> Integer.parseInt(x)).toArray(Integer[]::new);

//        for (Integer num :
//                number) {
//            System.out.println(num);
//        }
//        System.out.println(Arrays.toString(number));

//        List<Integer> numbers = Arrays.asList(15, 2, 356665);
////        System.out.println(numbers);
//        numbers.stream().sorted((e1,e2) -> e2.compareTo(e1)).forEach(System.out::println);

//        namesList.stream()
//                .sorted((e1, e2) -> e2.compareTo(e1))
//                .forEach(System.out::println);


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        Comparator<Integer> customComparator = (n1, n2) -> {
            if ((n1 % 2 == 0) && (n2 % 2 != 0)) {
                return -1;
            } else if ((n1 % 2 != 0) && (n2 % 2 == 0)) {
                return 1;
            } else {
                return n1.compareTo(n2);
            }
        };
        Collections.sort(nums, customComparator);
        for (Integer num :
                nums) {
            System.out.printf("%d ", num);
        }


//        nums.stream().filter(x -> x .length() <= 4).forEach(x -> System.out.printf("%s ", x));
//        Function<Integer[], Integer> minNumber = (x -> )
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

//        Function<List<Integer>, Integer> findMinEl = x -> {
//            int minValue = Integer.MAX_VALUE;
//            for (int i = 0; i < x.size(); i++) {
//                if (x.get(i) < minValue){
//                    minValue = x.get(i);
//                }
//            }
//
//            return minValue;
//        };


    }
}
