import java.lang.*;
import java.lang.StringBuilder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] input = "aaaaabbbbbcdddeeeedssaa".toCharArray();
        int len = input.length;
        for (int i = 0; i <= input.length-2; i++) {
            if (input[i] == input[i+1]) {
                sb.append("");
            }
            if (input[i] != input[i+1]){
                sb.append(input[i]);
            }
            if (i == input.length-2){
                if (input[input.length-2] ==  input[input.length-1]){
                    sb.append(input[input.length-2]);
                }
                else {
                    sb.append(input[input.length-2]);
                    sb.append(input[input.length-1]);
                }

            }
        }
        System.out.println(sb);
    }
}
