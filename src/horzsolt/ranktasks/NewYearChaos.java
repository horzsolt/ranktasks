package horzsolt.ranktasks;

/*
https://www.hackerrank.com/challenges/new-year-chaos
 */
public class NewYearChaos {


    public static int minimumBribes2(int[] q) {

        int bribe = 0;

        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                bribe = 0;
                break;
            }

            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i])
                    bribe++;
        }

        return bribe;

    }

    public static int minimumBribes(int[] q) {

        int counter = 0;

        for (int i = 0; i < q.length; ++i) {

            int diff = q[i] - (i + 1);

            if (diff > 2) {
                counter = 0;
                break;
            } else if ((diff <= 2) && (diff > 0)) {
                counter += q[i] - (i + 1);
            }
        }

        return counter;
    }
}
