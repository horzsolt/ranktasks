package horzsolt.algorithms.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateLeftTest {

    @Test
    void rotateLeftTest() {
        assertArrayEquals(new int[]{5,1,2,3,4}, RotateLeft.rotLeft(new int[]{1,2,3,4,5}, 4));
    }
}
