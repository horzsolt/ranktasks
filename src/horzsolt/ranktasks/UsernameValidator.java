package horzsolt.ranktasks;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;


/*

    The username consists of to characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
    The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
    The first character of the username must be an alphabetic character, i.e., either lowercase character or uppercase character .

 */

/*
https://regexr.com/
 */
public class UsernameValidator {

    String _regex = "^[a-zA-Z]\\w{7,29}$";
    String regex = "^[a-zA-Z]([\\w]){7,29}$";

    @Test
    public void testEdgeCase() {
        assertTrue(usernameValidator("tD2_tiff+Z66fC") == "Invalid");
    }

    @Test
    public void stringLengthTest() {

        assertTrue(usernameValidator("J").equals("Invalid"));
        assertTrue(usernameValidator("Julia").equals("Invalid"));
        assertTrue(usernameValidator("Samantha_21").equals("Valid"));
        assertTrue(usernameValidator("Samantha").equals("Valid"));
    }

    @Test
    public void usernameValidatorTest() {

        assertTrue(usernameValidator("Julia").equals("Invalid"));
        assertTrue(usernameValidator("Samantha").equals("Valid"));
        assertTrue(usernameValidator("Samantha_21").equals("Valid"));
        assertTrue(usernameValidator("1Samantha").equals("Invalid"));
        assertTrue(usernameValidator("Samantha?10_2A").equals("Invalid"));
        assertTrue(usernameValidator("JuliaZ007").equals("Valid"));
        assertTrue(usernameValidator("Julia@007").equals("Invalid"));
        assertTrue(usernameValidator("_Julia007").equals("Invalid"));
    }

    @Test
    public void testAgainstPurchasedTests() {

        try {

            Path path = Paths.get(getClass().getClassLoader().getResource("usernames.txt").toURI());
            List<String> usernamestream = Files.lines(path).collect(Collectors.toList());
            path = Paths.get(getClass().getClassLoader().getResource("usernames_results.txt").toURI());
            List<String> resultstream = Files.lines(path).collect(Collectors.toList());

            IntStream.range(
                    0, usernamestream.size())
                    //.peek(i -> System.out.println(usernamestream.get(i) + " " + resultstream.get(i)))
                    .forEach(i -> assertTrue(assertEquals(usernamestream.get(i), resultstream.get(i))));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private boolean assertEquals(String first, String second) {

        boolean result = usernameValidator(first).equals(second);
        if (!result) {
            System.out.println(first + " " + second + " failed.");
        }
        return result;

    }

    private String usernameValidator(String input) {
        return input.matches(regex) ? "Valid" : "Invalid";
    }
}
