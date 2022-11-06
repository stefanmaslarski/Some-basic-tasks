import java.util.Scanner;

public class PalatkaConf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterBeds = 0;
        int counterMeals = 0;

        int numberPeople = scanner.nextInt();
        scanner.nextLine();
        int inputLines = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < inputLines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String tentFoodRoom = input[0];
            int quantity = Integer.parseInt(input[1]);
            String typeOf = input[2];

            if (tentFoodRoom.equals("tents")) {
                if (typeOf.equals("firstClass")) {
                    counterBeds += quantity * 3;
                } else {
                    counterBeds += quantity * 2;
                }

            }

            if (tentFoodRoom.equals("rooms")) {
                if (typeOf.equals("triple")) {
                    counterBeds += quantity * 3;
                } else if (typeOf.equals("double")) {
                    counterBeds += quantity * 2;
                } else {
                    counterBeds += quantity;
                }

            }
            if (tentFoodRoom.equals("food")) {
                if (typeOf.equals("musaka")) {
                    counterMeals += quantity * 2;

                } else {
                    counterMeals += 0;
                }
            }
        }
        if (counterBeds >= numberPeople){
            System.out.printf("Everyone is happy and sleeping well. Beds left: %d\n", counterBeds - numberPeople);
        } else {
            System.out.printf("Some people are freezing cold. Beds needed: %d\n", numberPeople - counterBeds);
        }

        if (counterMeals >= numberPeople){
            System.out.printf("Nobody left hungry. Meals left: %d\n", counterMeals - numberPeople);
        } else {
            System.out.printf("People are starving. Meals needed: %d\n", numberPeople - counterMeals);
        }


    }
}
