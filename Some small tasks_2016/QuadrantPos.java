import java.math.BigDecimal;
import java.util.Scanner;

public class QuadrantPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal xCoordinate = scanner.nextBigDecimal();
        scanner.nextLine();
        BigDecimal yCoordinate = scanner.nextBigDecimal();
        scanner.nextLine();
        BigDecimal bg0 = new BigDecimal(0);

        if ((xCoordinate.compareTo(bg0) == 0) && (yCoordinate.compareTo(bg0) == 0)) {
            System.out.println("0");
        }
        if ((xCoordinate.compareTo(bg0) == 1) && (yCoordinate.compareTo(bg0) == 1)) {
            System.out.println("1");
        }
        if ((xCoordinate.compareTo(bg0) == -1) && (yCoordinate.compareTo(bg0) == 1)) {
            System.out.println("2");
        }
        if ((xCoordinate.compareTo(bg0) == -1) && (yCoordinate.compareTo(bg0) == -1)) {
            System.out.println("3");
        }
        if ((xCoordinate.compareTo(bg0) == 1) && (yCoordinate.compareTo(bg0) == -1)) {
            System.out.println("4");
        }
        if ((xCoordinate.compareTo(bg0) == 0)) {
            System.out.println("5");
        }
        if ((yCoordinate.compareTo(bg0) == 0)) {
            System.out.println("6");
        }
    }
}
