package horzsolt.ranktasks;


/*

    The username consists of to characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
    The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
    The first character of the username must be an alphabetic character, i.e., either lowercase character or uppercase character .

 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/*
https://regexr.com/
 */
public class UsernameValidator extends BaseTestValidator {

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
    public void runPurachasedTests() {
        testAgainstPurchasedTests("usernames.txt", "usernames_results.txt");
    }

    protected boolean assertEquals(long count, String first, String second) {

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
