package horzsolt.algorithms.foobar;


public class MinionsRanking {


    private static String genPrimeString(int max) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i< max; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                sb.append(String.valueOf(i));
            }
        }

        return sb.toString();
    }

    public static String answer(int n) {

        return genPrimeString(10000).substring(n, n + 5);

    }
}
