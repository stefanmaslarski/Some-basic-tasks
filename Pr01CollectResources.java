import java.util.Scanner;

public class Pr01CollectResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");

        int tests = scanner.nextInt();
        scanner.nextLine();
        int maxQuantity = 0;
        int currentQuantity;
        int currentPos;
        for (int test = 0; test < tests; test++){
            boolean[] itemflags = new boolean[items.length];
            currentQuantity = 0;
            String[] input = scanner.nextLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int step = Integer.parseInt(input[1]);
            currentPos = start;
            step %= items.length;

            while (!itemflags[currentPos]){
                String[] resourceData = items[currentPos].split("_");
                String resourceType = resourceData[0];
                int quantity;
                if (resourceData.length == 1){
                    quantity = 1;
                } else {
                    quantity = Integer.parseInt(resourceData[1]);
                }
                switch (resourceType){
                    case "stone":
                    case "gold":
                    case "wood":
                    case "food":
                        currentQuantity += quantity;
                        itemflags[currentPos] = true;
                }

                currentPos += step;
                currentPos %= items.length;
            }
            if (currentQuantity > maxQuantity){
                maxQuantity = currentQuantity;
            }


        }
        System.out.println(maxQuantity);
    }
}
