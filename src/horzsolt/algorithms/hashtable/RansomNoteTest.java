package horzsolt.algorithms.hashtable;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class RansomNoteTest {

    @Test
    public void TestRansomNote() {
        assertTrue(RansomNote.checkMagazine(new String[] {"Give", "me", "one", "grand", "today", "night"}, new String[] {"Give", "one", "grand", "today"}));
        assertFalse(RansomNote.checkMagazine(new String[] {"give", "me", "one", "grand", "today", "night"}, new String[] {"Give", "one", "grand", "today"}));
        //assertFalse(RansomNote.checkMagazine(new String[] {"two", "times", "three", "is", "not", "four"}, new String[] {"two", "times", "two", "is", "four"}));
    }
}
