package horzsolt.algorithms.hashtable;

import java.util.*;

/*
https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */
public class RansomNote {

    static boolean checkMagazineBruteForce(String[] magazine, String[] note) {

        int found = 0;
        List<String> mag = new ArrayList<>();

        for (String word : magazine) {
            mag.add(word);
        }

        for (String word : note) {

            if (mag.contains(word)) {
                mag.remove(word);
                found++;
            }
        }

        return found == note.length;
    }

    private static HashMap<String, Integer> getStringFrequency(String[] text) {

        HashMap<String, Integer> frequencies = new HashMap<>();
        for (String word : text) {
            if (!frequencies.containsKey(word)) {
                frequencies.put(word, 0);
            }
            frequencies.put(word, frequencies.get(word) + 1);
        }

        return frequencies;
    }

    private static boolean hasEnoughStrings(HashMap<String, Integer> magazineFreq, HashMap<String, Integer> noteFreq) {

        for (Map.Entry<String, Integer> entry : noteFreq.entrySet()) {
            String word = entry.getKey();
            if (!magazineFreq.containsKey(word) || magazineFreq.get(word) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> magazineFreq = getStringFrequency(magazine);
        HashMap<String, Integer> noteFreq = getStringFrequency(magazine);

        return hasEnoughStrings(magazineFreq, noteFreq);
    }
}
