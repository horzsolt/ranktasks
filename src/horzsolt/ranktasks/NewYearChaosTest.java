package horzsolt.ranktasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewYearChaosTest {

    @Test
    public void TestNewYearChaos() {

        //assertEquals(3, NewYearChaos.minimumBribes(new int[] {2,1,5,3,4}));
        //assertEquals(0, NewYearChaos.minimumBribes(new int[] {2,5,1,3,4}));

        //assertEquals(0, NewYearChaos.minimumBribes(new int[] {5,1,2,3,7,8,6,4}));
        //                                                             1,2,3,4,5,6,7,8
        assertEquals(7, NewYearChaos.minimumBribes2(new int[] {1,2,5,3,7,8,6,4}));
    }
}
