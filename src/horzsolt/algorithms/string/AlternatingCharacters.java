package horzsolt.algorithms.string;

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {

        int count = 0;
        char prev = s.charAt(0);

        for (int i = 1; i <= s.length()-1; ++i) {
            if (s.charAt(i) == prev) {
                count++;
            } else {
                prev = s.charAt(i);
            }
        }

        return count;
    }
}
