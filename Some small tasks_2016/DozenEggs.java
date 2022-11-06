import java.util.Scanner;

public class DozenEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEggs = 0;
        int countDozen = 0;
        String dozenOrEggs = "";
        int number = 0;
        int addDozen = 0;
        int addcountEggs = 0;


        for (int i = 0; i <= 6; i++) {
            String[] input = scanner.nextLine().split(" ");
            number = Integer.parseInt(input[0]);
            dozenOrEggs = input[1];

            if (dozenOrEggs.equals("eggs")) {
                countEggs += number;

            } else {
                countDozen += number;
            }
        }

        if (countEggs >= 12) {
            countDozen += countEggs / 12;
            countEggs = countEggs % 12;
        }

            System.out.printf("%d dozens + %d eggs", countDozen, countEggs);
        }
    }
