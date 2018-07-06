package horzsolt.algorithms.hashtable;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TwoStringsTest {

    @Test
    public void TestTwoStrings() {
        assertEquals("YES", TwoStrings.twoStrings("hello", "world"));
    }
}
