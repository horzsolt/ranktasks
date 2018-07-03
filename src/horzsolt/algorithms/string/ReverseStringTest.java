package horzsolt.algorithms.string;

import org.junit.Test;

import static horzsolt.algorithms.string.ReverseString.reverse;
import static horzsolt.algorithms.string.ReverseString.reverseRecursively;

public class ReverseStringTest {

    @Test
    void TestReverseString() {
        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);
    }
}
