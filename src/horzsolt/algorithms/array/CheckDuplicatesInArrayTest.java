package horzsolt.algorithms.array;

import org.junit.jupiter.api.Test;

import static horzsolt.algorithms.array.CheckDuplicatesInArray.bruteforce;
import static horzsolt.algorithms.array.CheckDuplicatesInArray.checkDuplicateUsingAdd;
import static horzsolt.algorithms.array.CheckDuplicatesInArray.checkDuplicateUsingSet;

public class CheckDuplicatesInArrayTest {

    @Test
    void TestCheckDuplicatesInArray() {

        String[] withDuplicates = new String[] {"one","two","three","one"};
        String[] withoutDuplicates = new String[] {"one","two","three"};

        System.out.println("Checking array with duplicate using brute force: " + bruteforce(withDuplicates));
        System.out.println("Checking array without any duplicate using brute force: " + bruteforce(withoutDuplicates));

        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingSet(withoutDuplicates));


        System.out.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
        System.out.println("Checking array without any duplicate using Set and List: " + checkDuplicateUsingAdd(withoutDuplicates));

    }
}
