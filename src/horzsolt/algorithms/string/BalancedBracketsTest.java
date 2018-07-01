package horzsolt.algorithms.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBracketsTest {

    @Test
    void TestIsBalanced() {
        assertTrue(BalancedBrackets.isBalanced("{[()]}"));
        assertFalse(BalancedBrackets.isBalanced("{[(])}"));
        assertTrue(BalancedBrackets.isBalanced("{{[[(())]]}}"));
    }
}
