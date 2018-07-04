package horzsolt.algorithms.array;

import java.util.Arrays;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

        long maxValue = 0;
        long[] arr = new long[n];
        Arrays.fill(arr, 0);

        for (int operations = 0; operations <= queries.length - 1; ++operations) {
            for (int elemToAdd = queries[operations][0] - 1; elemToAdd < queries[operations][1]; ++elemToAdd) {

                arr[elemToAdd] += queries[operations][2];
                if (arr[elemToAdd] > maxValue) maxValue = arr[elemToAdd];
            }
        }

        return maxValue;
    }
}
