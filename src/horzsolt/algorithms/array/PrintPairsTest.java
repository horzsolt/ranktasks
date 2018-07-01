package horzsolt.algorithms.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static horzsolt.algorithms.array.PrintPairs.*;

public class PrintPairsTest {

    @Test
    void testPrintPairs() {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
        prettyPrint(numbers, 7);
        prettyPrint(numbersWithDuplicates, 7);
    }

    @Test
    void testPrintPairsUsingSet() {
        prettyPrintSet(getRandomArray(9), 11);
        prettyPrintSet(getRandomArray(10), 12);
    }
}
