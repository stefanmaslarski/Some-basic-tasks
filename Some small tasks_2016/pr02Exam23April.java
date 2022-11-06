import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stefan_Petq_Valeriq on 04-May-16.
 */
public class pr02Exam23April {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();


        int[][] matrix = new int [rows][cols];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

            }
        }
        String line;
        while (!"Nuke it from orbit".equals(line = sc.nextLine())){
//            int[] linputs = Arrays.stream(line.split(" "))
//                    .mapToInt(Integer::parseInt).toArray();
            String[] inputs = line.split(" ");
            int row = Integer.parseInt(inputs[0]);
            int col = Integer.parseInt(inputs[0]);
            int radius = Integer.parseInt(inputs[2]);

        }

        // horizzontally
        for (int i = currentCol - radius; i <= col + radius; i++) {
           if (row >= 0 && row < matrix.length )
            matrix [row][i] = 0;

        }
        //vertically
        for (int currentRow = row - radius; currentRow <= row + radius; currentRow++) {
            matrix [i][col] = 0;

            int totalRows = 0;
            for (int i = 0; i < matrix.length; i++){
                if (Arrays.stream(matrix[i].sum != 0)){
                    totalRows++;
                }
            }
            int [][] newMatrix = new int [totalRows][];
            for (int currentRow = 0; currentRow < newMatrix.length; currentRow++) {
                if (Arrays.stream(matrix[currentRow].sum != 0))
                matrix[currentRowNewMatrix++] = Arrays.stream(matrix[currentRow])
                        .filter(n -> n != 0).toArray();
            }
            matrix = newMatrix;
        }
    }
}
