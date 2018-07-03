package horzsolt.algorithms.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    @Test
    void TestIsBalanced() {
        assertTrue(BalancedBrackets.isBalanced("{[()]}"));
        assertFalse(BalancedBrackets.isBalanced("{[(])}"));
        assertTrue(BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }
}
