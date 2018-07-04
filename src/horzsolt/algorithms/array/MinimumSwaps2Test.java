package horzsolt.algorithms.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSwaps2Test {

    @Test
    void testMinimumSwap2() {
        assertEquals(5, MinimumSwaps2.minimumSwaps(new int[]{2,3,4,1,5}));
    }
}
