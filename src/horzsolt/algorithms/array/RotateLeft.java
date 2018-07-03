package horzsolt.algorithms.array;

public class RotateLeft {

    public static int[] rotLeft(int[] a, int d) {
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = a.length;

        // Create new array for rotated elements:
        int[] rotated = new int[n];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(a, d, rotated, 0, n - d);
        System.arraycopy(a, 0, rotated, n - d, d);

        return rotated;
    }
}
