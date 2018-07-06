package horzsolt.algorithms.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        Set<Character> a = new HashSet<Character>();
        Set<Character> b = new HashSet<Character>();

        for(char c : s1.toCharArray()) {
            a.add(c);
        }
        for(char c : s2.toCharArray()) {
            b.add(c);
        }

        a.retainAll(b);

        return (a.isEmpty() ? "NO" : "YES" );
    }
}
