package horzsolt.algorithms.array;

import org.junit.jupiter.api.Test;

import static horzsolt.algorithms.array.MissingNumberFromArray.multipleMissingNumbersFromArray;
import static horzsolt.algorithms.array.MissingNumberFromArray.oneMissingNumberFromArray;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MissingNumberFromArrayTest {

    @Test
    void testOneMissingNumberFromArray() {

        int[] arr1 = {10,9,3,6,4,7,8,1,2};
        assertTrue(5 == oneMissingNumberFromArray(arr1));

        int[] arr2 = {2,10,4,5,6,7,8,9,3};
        assertTrue(1 == oneMissingNumberFromArray(arr2));

        int[] arr3 = {1,3,2,6,5,7,8,10,9};
        assertTrue(4 == oneMissingNumberFromArray(arr3));
    }

    @Test
    void testMultipleMissingNumbersFromArray() {
        // two missing number
        multipleMissingNumbersFromArray(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);

        // three missing number
        multipleMissingNumbersFromArray(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

        // four missing number
        multipleMissingNumbersFromArray(new int[]{1, 2, 3, 4, 9, 8}, 10);
    }
}
