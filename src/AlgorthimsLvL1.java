import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorthimsLvL1 {
    List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
    public static void plusMinus(List<Integer> arr) {
        double arrLength = 0;
        double totalNegative = 0;
        double totalPosotive = 0;
        double totalZeros = 0;
        for(int i : arr) {
            arrLength += 1;
            if(i > 0){
                totalPosotive++;
            } else if(i < 0) {
                totalNegative++;
            } else {
                totalZeros++;
            }
        }
        System.out.println("Plus Minus Answers: ");
        System.out.println(totalPosotive/arrLength);
        System.out.println(totalNegative/arrLength);
        System.out.println(totalZeros/arrLength);
        System.out.println();
    }
}
