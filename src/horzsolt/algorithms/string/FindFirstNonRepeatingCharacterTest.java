package horzsolt.algorithms.string;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindFirstNonRepeatingCharacterTest {

    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('b', FindFirstNonRepeatingCharacter.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatingCharacter.firstNonRepeatedCharacter("hello"));
        assertEquals('J', FindFirstNonRepeatingCharacter.firstNonRepeatedCharacter("Java"));
        assertEquals('i', FindFirstNonRepeatingCharacter.firstNonRepeatedCharacter("simplest"));
    }

    @Test
    public void testFirstNonRepeatingChar() {
        assertEquals('b', FindFirstNonRepeatingCharacter.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatingCharacter.firstNonRepeatingChar("hello"));
        assertEquals('J', FindFirstNonRepeatingCharacter.firstNonRepeatingChar("Java"));
        assertEquals('i', FindFirstNonRepeatingCharacter.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testGetFirstNonRepeatedChar() {
        assertEquals('b', FindFirstNonRepeatingCharacter.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', FindFirstNonRepeatingCharacter.getFirstNonRepeatedChar("hello"));
        assertEquals('J', FindFirstNonRepeatingCharacter.getFirstNonRepeatedChar("Java"));
        assertEquals('i', FindFirstNonRepeatingCharacter.getFirstNonRepeatedChar("simplest"));
    }
}
