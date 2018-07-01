package horzsolt.algorithms.array;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.Arrays;

import static horzsolt.algorithms.array.MissingNumberFromSortedArray.missingNumberFromSortedArray;

public class MissingNumberFromSortedArrayTest {

    @Test
    void textMissingNumberFromSortedArray() {

        System.out.println("Test #1 : Missing number in sorted array ");
        int[] input = new int[]{1, 2, 3, 4, 6};
        int missing = missingNumberFromSortedArray(input);
        System.out.println("Missing number from array : " + Arrays.toString(input) + " is : " + missing);

    }
}
