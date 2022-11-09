import java.util.Scanner;

//coffee - 1.00
//water - 1.50
//cola-cola - 2.00/
//snacks - 2.00
public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputProduct = scanner.nextLine();
        double inputQuantity = Double.parseDouble(scanner.nextLine());

        totalOrderPrice(inputProduct,inputQuantity);
    }

    public static void totalOrderPrice(String product, double quantity){
        double totalOrderProce = 0;
        switch (product){
            case "water":
                totalOrderProce+= quantity*1.50;
                break;
            case "cola":
                totalOrderProce+= quantity*2.00;
                break;
            case "coffee":
                totalOrderProce+= quantity*3.00;
                break;
            case "snacks":
                totalOrderProce+= quantity*1.50;
                break;

        }

        System.out.printf("Total price: %.2f", totalOrderProce);

    }
}
