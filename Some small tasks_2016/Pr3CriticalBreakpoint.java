import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr3CriticalBreakpoint {
    public static void main(String[] args) {

        int criticalRatio = 0;
        int criticalBreakPoint = 0;
        int actualCriticalRatio = 0;
        double breakPoint = 0;
        int counterLines = 0;
        boolean breakPointExist = false;

        List<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Break it.")) {
            String[] inputSplitted = input.split(" ");
            int x1 = Integer.parseInt(inputSplitted[0]);
            int y1 = Integer.parseInt(inputSplitted[1]);
            int x2 = Integer.parseInt(inputSplitted[2]);
            int y2 = Integer.parseInt(inputSplitted[3]);
            criticalRatio = Math.abs((x2 + y2) - (x1 + y1));
            array.add(criticalRatio);
            counterLines++;
            if (breakPointExist){
            System.out.printf("Line: [%d, %d, %d, %d]\n", x1, y1, x2, y2);}
            input = scanner.nextLine();
        }

        Integer[] arrayCriticalRatios = array.toArray(new Integer[array.size()]);

        int temp = arrayCriticalRatios[0];
        for (int i = 1; i < arrayCriticalRatios.length; i++) {
            if ((temp == arrayCriticalRatios[i]) || (arrayCriticalRatios[i].equals(0))){

                // breakpoint
                if (arrayCriticalRatios[i] != 0) {
                    actualCriticalRatio = arrayCriticalRatios[i];
                    breakPoint = (Math.pow(actualCriticalRatio, counterLines)) % counterLines;
                    breakPointExist = true;
                } else {
                    actualCriticalRatio = arrayCriticalRatios[i - 1];
                    breakPoint = (Math.pow(actualCriticalRatio, counterLines)) % counterLines;
                    breakPointExist = true;
                }

            } else {
                System.out.println("Critical breakpoint does not exist.");
            }

        }
//        System.out.println("Line: [%d, %d, %d, %d]", x1, y1, x2, y2);



        System.out.printf("Critical Breakpoint: %.0f", breakPoint);

    }
}