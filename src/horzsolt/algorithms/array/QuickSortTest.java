package horzsolt.algorithms.array;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    void testQuickSort() {

        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort();

        // sorting integer array using quicksort algorithm
        algorithm.sort(unsorted);

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
    }
}
