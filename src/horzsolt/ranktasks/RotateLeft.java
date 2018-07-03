package horzsolt.ranktasks;

public class RotateLeft {

    public static int[] rotLeft(int[] array, int d) {
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int length = array.length;

        // Create new array for rotated elements:
        int[] rotated = new int[length];

        // Copy segments of shifted elements to rotated array:
        System.arraycopy(array, d, rotated, 0, length - d);
        System.arraycopy(array, 0, rotated, length - d, d);

        return rotated;
    }
}
