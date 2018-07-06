package horzsolt.algorithms.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternatingCharactersTest {

    @Test
    public void TestAlternatingCharacters() {
        assertEquals(3, AlternatingCharacters.alternatingCharacters("AAAA"));
        assertEquals(0, AlternatingCharacters.alternatingCharacters("BABABA"));
        assertEquals(0, AlternatingCharacters.alternatingCharacters("ABABABAB"));
        assertEquals(4, AlternatingCharacters.alternatingCharacters("AAABBB"));
    }
}
