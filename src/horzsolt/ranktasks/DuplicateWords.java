package horzsolt.ranktasks;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

/*
http://tutorials.jenkov.com/java-regex/matcher.html
 */
class DuplicateWordsTest {

    String regex = "\\b(\\w+)(\\W+\\1\\b)+";
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    @Test
    public void testRemoveDuplicatedWords() {
        findDuplicatedWords("I love Love to To tO code", "I love to code");
        findDuplicatedWords("umair umair i am i am i i i i am not a a a good man", "umair i am i am i am not a good man");

        findDuplicatedWords("Goodbye bye bye world world world", "Goodbye bye world");
        findDuplicatedWords("Sam went went to to to his business", "Sam went to his business");
        findDuplicatedWords("Reya is is the the best player in eye eye game", "Reya is the best player in eye game");
        findDuplicatedWords("in inthe", "in inthe");
        findDuplicatedWords("Hello hello Ab aB", "Hello Ab");
    }


    private void findDuplicatedWords(String input, String expectedOutput) {

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            input = input.replaceAll(matcher.group(), matcher.group(1));
        }

        assertEquals(expectedOutput, input);
    }
}



