package horzsolt.algorithms.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberFromArray {

    public static int oneMissingNumberFromArray(int[] numbers) {

        int totalCount = numbers.length + 1;
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;

        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    public static void multipleMissingNumbersFromArray(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }
}
