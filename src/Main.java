import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * ALGOS LVL-1
        */
        // Input and function call for plusMinus equation
        List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
        AlgorthimsLvL1.plusMinus(arr);

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        AlgorthimsLvL1.miniMaxSum(arr1);


        AlgorthimsLvL1.randomNum(4,2);
    }

}