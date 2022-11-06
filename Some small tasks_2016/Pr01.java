import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Pr01 {
    public static void main(String[] args) throws IOException {

        List<String> masters = new ArrayList<>();
        List<String> knights = new ArrayList<>();
        List<String> padawans = new ArrayList<>();
        List<String> toshkoSlav = new ArrayList<>();
        boolean isYodaInside = false;


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int numbersLines = Integer.valueOf(br.readLine());

            for (int i = 0; i < numbersLines; i++) {
                String[] jedis = br.readLine().split("[\\s]+");
                for (String el : jedis) {
                    if (el.startsWith("m")){
                        masters.add(el);
                    } else if (el.startsWith("k")){
                        knights.add(el);
                    } else if ((el.startsWith("t")) || (el.startsWith("s"))){
                        toshkoSlav.add(el);
                    } else if(el.startsWith("p")){
                        padawans.add(el);
                    } else { // starts with "ÿ"
                        isYodaInside = true;
                    }
                }
            }

        }

        String rezult = "";
        if (isYodaInside){ // yoda is inside
            rezult = String.join(" ", masters.toString() + knights.toString()
                    + toshkoSlav.toString()+ padawans.toString());

        } else {
            rezult = String.join(" ", toshkoSlav.toString() +
                    masters.toString() + knights.toString()
                    + padawans.toString());


        }

        rezult = rezult.replaceAll("\\]\\["," ");
        rezult = rezult.replaceAll("\\[","");
        rezult = rezult.replaceAll("\\]","");
        rezult = rezult.replaceAll(",","");


        System.out.println(rezult);



    }

}
