package extraMile;

import java.util.Arrays;
import java.util.Collections;

public class Ex1MultiDimArrayScan {
    public static void main(String[] args) {
        Integer[][] myNumbers = {{1, 2, 3}, {4, 4, 5}, {1, 8}, {10}};

        Integer[] maxOfEachPack = new Integer[myNumbers.length];

        for (int i = 0; i < myNumbers.length; i++) {
            maxOfEachPack[i] = Collections.max(Arrays.asList(myNumbers[i]));
        }

        System.out.print("The maximum numbers from each list are: ");
        for (int number : maxOfEachPack){
            System.out.print(number + " ");
        }

        System.out.println("\nMinimum number from the maximums is " + Collections.min(Arrays.asList(maxOfEachPack)));
    }
}
