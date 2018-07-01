package horzsolt.algorithms.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ipv4Ipv5ValidationTest {

    @Test
    void TestIpv4Ipv5Validation() {

        assertTrue("N" == Ipv4Ipv5Validation.isValid("This line has junk text.  "));
        assertTrue("4" == Ipv4Ipv5Validation.isValid("121.18.19.20"));
        assertTrue("6" == Ipv4Ipv5Validation.isValid("2001:0db8:0000:0000:0000:ff00:0042:8329"));
    }
}

