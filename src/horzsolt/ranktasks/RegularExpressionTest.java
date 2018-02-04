package horzsolt.ranktasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
https://www.regular-expressions.info/ip.html
 */
class RegularExpressionTest {

    @Test
    public void testCase1() {

        String[] inputs1 = {
                "12.12.12.12",
                "13.13.13.112",
                "VUUT.12.12",
                "111.111.11.111",
                "1.1.1.1.1.1.1",
                ".....",
                "1...1..1..1",
                "0.0.0.0",
                "255.0.255.0",
                "266.266.266.266",
                "00000.000000.0000000.00001",
                "0023.0012.0012.0034"};


        assertTrue(inputs1[0].matches(MyRegex.pattern));
        assertTrue(inputs1[1].matches(MyRegex.pattern));
        assertFalse(inputs1[2].matches(MyRegex.pattern));
        assertTrue(inputs1[3].matches(MyRegex.pattern));
        assertFalse(inputs1[4].matches(MyRegex.pattern));
        assertFalse(inputs1[5].matches(MyRegex.pattern));
        assertFalse(inputs1[6].matches(MyRegex.pattern));
        assertTrue(inputs1[7].matches(MyRegex.pattern));
        assertTrue(inputs1[8].matches(MyRegex.pattern));
        assertFalse(inputs1[9].matches(MyRegex.pattern));
        assertFalse(inputs1[10].matches(MyRegex.pattern));
        assertFalse(inputs1[11].matches(MyRegex.pattern));
    }

    @Test
    public void testCase2() {

        String[] inputs2 = {
                "259.259.259.259",
                "266.266.266.266",
                "255.255.255.255",
                "555.555.555.555",
                "666.666.666.666",
                "249.249.249.249",
                "249.249.249.256"};


        assertFalse(inputs2[0].matches(MyRegex.pattern));
        assertFalse(inputs2[1].matches(MyRegex.pattern));
        assertTrue(inputs2[2].matches(MyRegex.pattern));
        assertFalse(inputs2[3].matches(MyRegex.pattern));
        assertFalse(inputs2[4].matches(MyRegex.pattern));
        assertTrue(inputs2[5].matches(MyRegex.pattern));
        assertFalse(inputs2[6].matches(MyRegex.pattern));
    }

}

class MyRegex {
    public static String pattern = "^(([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|1[0-9]" +
            "{2}|2[0-4][0-9]|25[0-5])\\.)" +
            "{3}([0-9]|[0-9][0-9]|[0-2][0-4][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}