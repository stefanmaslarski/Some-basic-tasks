import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _3_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line;
        List<String> lines= new ArrayList<>();
        long absoluteCriticalRatio=0;

        while(!"Break it.".equals(line=sc.nextLine())){
            int[] numbers=Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).
                    toArray();
            lines.add(Arrays.toString(numbers));

            int x1=numbers[0];
            int y1=numbers[1];
            int x2=numbers[2];
            int y2=numbers[3];

            long currentCriticalRatio= Math.abs(((long)x2+(long)y2)-((long)x1+(long)y1));

            if(absoluteCriticalRatio==0 && currentCriticalRatio!=0){
                absoluteCriticalRatio=currentCriticalRatio;
            }

            if(currentCriticalRatio!=0 && currentCriticalRatio!=absoluteCriticalRatio){
                System.out.println("Critical breakpoint does not exist.");
                return;
            }
        }

        for (String linee: lines) {
            System.out.println("Line: "+linee);
        }


        BigInteger criticalBreakPoint= BigInteger.valueOf(absoluteCriticalRatio).pow(lines.size())
                .remainder(BigInteger.valueOf(lines.size()));


        //long criticalBreakPoint= (long)Math.pow(absoluteCriticalRatio, lines.size())%lines.size();
        System.out.println("Critical breakpoint: "+criticalBreakPoint);


    }
}