package horzsolt.ranktasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class BaseTestValidator {

    public void testAgainstPurchasedTests(String testCaseFile, String resultFile) {

        long startTime = System.nanoTime();

        try {

            Path path = Paths.get(getClass().getClassLoader().getResource(testCaseFile).toURI());
            List<String> testCaseStream = Files.lines(path).collect(Collectors.toList());
            path = Paths.get(getClass().getClassLoader().getResource(resultFile).toURI());
            List<String> resultStream = Files.lines(path).collect(Collectors.toList());

            IntStream.range(
                    0, testCaseStream.size())
                    .forEach(i -> Assertions.assertTrue(assertEquals(i, testCaseStream.get(i), resultStream.get(i))));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } finally {

            long endTime = System.nanoTime();
            long duration = TimeUnit.NANOSECONDS.toMillis(adjustEndTime(startTime, endTime) - startTime);

            System.out.println("Execution has taken " + String.valueOf(duration) + " ms.");
        }
    }

    private long adjustEndTime(long startTime, long endTime) {
        return (endTime == 0) ? startTime + 1000 : endTime;
    }

    abstract boolean assertEquals(long count, String first, String second);
}
