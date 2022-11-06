public class toto {
    public static void main(String[] args) {

        // printing 6 from 49 change
        //i - 1st digit .... n - last digit
        long count = 0;
        for (int i = 1; i <= 49 ; i++) {
            for (int j = 1; j < 49 ; j++) {
                for (int k = 1; k < 49; k++) {
                    for (int l = 1; l < 49 ; l++) {
                        for (int m = 1; m < 49; m++) {
                            for (int n = 1; n < 49; n++) {
                                count++;
                                //System.out.printf("Combination: %d %d %d %d %d %d%n",i,j,k,l,m,n );


                            }
                        }
                    }
                }
            }

        }
        System.out.printf("Total count of combination: %d%n",count );
    }
}
