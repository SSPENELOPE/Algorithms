import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorthimsLvL1 {
    // PlusMinus
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
        System.out.println("plusMinus Answers: ");
        System.out.println(totalPosotive/arrLength);
        System.out.println(totalNegative/arrLength);
        System.out.println(totalZeros/arrLength);
        System.out.println();
    }

    // Min max sum
    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> sortedList = new ArrayList<>(arr); // Create a list of the numbers in the array
        Collections.sort(sortedList); // Sort the numbers

        Integer[] sortedArray = sortedList.toArray(new Integer[sortedList.size()]); // Turn it back into an array

        int minTotal = 0; // Set the min total 0
        int maxTotal = 0; // Set the max total 0

        // Here to get the min total we add the array together without the largest number
        for(int i = 0; i < sortedArray.length - 1; i++) {
            minTotal += sortedArray[i]; // add the numbers together
        }

        // Here we add all the numbers together, except we start at the first index, which will not count the smallest number at the "0" index of the array
        for(int i = 1; i < sortedArray.length; i++ ) {
            maxTotal += sortedArray[i]; // Add the numbers together
        }

        System.out.println("minMax Solution:");
        System.out.println(minTotal + " " + maxTotal);
        System.out.println();
    }

   public static int randomNum(int max,int min) {
       System.out.println("RandomNum: " + (int) (Math.random() * (max - min + 1) + min));
       return (int) (Math.random() * (max - min + 1) + min);
   }
}
