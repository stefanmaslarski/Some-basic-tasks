import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pr02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] matrixDim = br.readLine().split("[\\s]+");
        int matrixRows = Integer.valueOf(matrixDim[0]);
        int matrixCols = Integer.valueOf(matrixDim[1]);


        //create a matrix and fill it
        int[][] galaxy = new int[matrixRows][matrixCols];
        int filler = 0;
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixCols; j++) {
                galaxy[i][j] = filler;
                filler++;
            }
        }


        String line = br.readLine();

        long collectorOfStars = 0L;
        while (!line.equals("Let the Force be with you")) {

            String[] ivoStartCoordinates = line.split("[\\s]+");
            int ivoStartRow = Integer.valueOf(ivoStartCoordinates[0]);
            int ivoStartCol = Integer.valueOf(ivoStartCoordinates[1]);

            String[] evilStartCoordinates = br.readLine().split("[\\s]+");
            int evilStartRow = Integer.valueOf(evilStartCoordinates[0]);
            int evilStartCol = Integer.valueOf(evilStartCoordinates[1]);

            while ((evilStartRow >= matrixRows) || (evilStartCol >= matrixCols)) {

                evilStartRow--;
                evilStartCol--;

            }


            //evil set diag el of matrix to zero
            while ((evilStartRow >= 0) && (evilStartCol >= 0)) {
                galaxy[evilStartRow][evilStartCol] = 0;
                evilStartRow--;
                evilStartCol--;

            }

//            printMatrix(galaxy);
            while ((ivoStartRow >= matrixRows) || (ivoStartCol < 0)) {

                ivoStartRow--;
                ivoStartCol++;

            }

            while ((ivoStartRow >= 0) && (ivoStartCol < matrixCols)) {
                collectorOfStars += galaxy[ivoStartRow][ivoStartCol];
                ivoStartRow--;
                ivoStartCol++;

            }


            line = br.readLine();
        }

        System.out.println(collectorOfStars);

    }

    private static void printMatrix(int[][] galaxy) {
        for (int i = 0; i < galaxy.length; i++) {
            for (int j = 0; j < galaxy[i].length; j++) {
                System.out.printf("%s  ", galaxy[i][j]);
            }
            System.out.println();
        }
    }


}

