import java.util.Scanner;

public class TwoDimentionalArrayPrinting {
    public static void print2DMatrix(String mats[][]){
        for (int i = 0; i < mats.length; i++) {
                for (int j = 0; j < mats[i].length; j++) {
                    System.out.print(mats[i][j]+" ");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      String [][] exampleArray = {{"a","a","a","a","a"},{"a","a","a","a"},{"a","a","a"},{"a","a"},{"a"}};
      print2DMatrix(exampleArray);
        Scanner scanner = new Scanner(System.in);

    }
}
