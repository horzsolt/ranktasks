package horzsolt.algorithms.string;


import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Ipv4Ipv6ValidationTest {

    @Test
    void TestIpv4Ipv5Validation() {

        assertTrue("N" == Ipv4Ipv6Validation.isValid("This line has junk text.  "));
        assertTrue("4" == Ipv4Ipv6Validation.isValid("121.18.19.20"));
        assertTrue("6" == Ipv4Ipv6Validation.isValid("2001:0db8:0000:0000:0000:ff00:0042:8329"));
    }
}

