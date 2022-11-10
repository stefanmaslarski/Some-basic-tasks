import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String commandInput = scanner.nextLine();
                while (!commandInput.equals("end")){
                    String[] commandArr = commandInput.split(" ");
                    String command = commandArr[0];
                    int number = Integer.parseInt(commandArr[1]);

                            switch (command){
                                case "Add":
                                    numbersList.add(number);
                                    break;
                                case "Remove":
                                    numbersList.remove(Integer.valueOf(number)); //return the object itself
                                    break;
                                case "RemoveAt":
                                    numbersList.remove(number);
                                    break;
                                case "Insert":
                                    int numberIndex = Integer.parseInt(commandArr[2]);
                                    numbersList.add(numberIndex, number);
                                    break;
                            }

                    commandInput = scanner.nextLine();
                }
        for (Integer item: numbersList) {
            System.out.printf(item + " ");
        }
        System.out.println();
               String rezultList = numbersList.toString().replaceAll("\\[","");
                    rezultList =   rezultList.replaceAll("\\]","");
                    rezultList =   rezultList.replaceAll(",","");
                System.out.println(rezultList);
    }
}
