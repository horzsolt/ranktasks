package horzsolt.algorithms.array;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static horzsolt.algorithms.array.ArrayManipulation.arrayManipulation;
import static org.junit.Assert.assertEquals;

public class ArrayManipulationTest {

    @Test
    public void testArrayManipulation() {

/*
5 3
1 2 100
2 5 100
3 4 100
 */
        int n = 5;
        int m = 3;
        int[][] queries = new int[m][3];

        queries[0][0] = 1;
        queries[0][1] = 2;
        queries[0][2] = 100;

        queries[1][0] = 2;
        queries[1][1] = 5;
        queries[1][2] = 100;

        queries[2][0] = 3;
        queries[2][1] = 4;
        queries[2][2] = 100;

        assertEquals(200, arrayManipulation(n, queries));
    }

    @Test
    public void testArrayManipulation2() {
/*
4 3
2 3 603
1 1 286
4 4 882
 */

        int n = 4;
        int m = 3;
        int[][] queries = new int[m][3];

        queries[0][0] = 2;
        queries[0][1] = 3;
        queries[0][2] = 603;

        queries[1][0] = 1;
        queries[1][1] = 1;
        queries[1][2] = 286;

        queries[2][0] = 4;
        queries[2][1] = 4;
        queries[2][2] = 882;

        assertEquals(882, arrayManipulation(n, queries));
    }

    @Test
    public void testArrayManipulation3() throws IOException, URISyntaxException {
/*
4000 30000
2250 2540 180674
2459 3892 434122
2321 3289 363503
1975 2754 374161
3283 3759 45954
711 35
 */

        Path path = Paths.get(getClass().getClassLoader().getResource("arraymanipulation.txt").toURI());
        List<String> testCaseStream = Files.lines(path).collect(Collectors.toList());

        int n = 4000;
        int m = 30000;
        int[][] queries = new int[m][3];

        for (int i = 0; i < m; ++i) {

            String[] line = testCaseStream.get(i).split(" ");

            if (line.length == 3) {
                queries[i][0] = Integer.parseInt(line[0]);
                queries[i][1] = Integer.parseInt(line[1]);
                queries[i][2] = Integer.parseInt(line[2]);
            }
        }

        assertEquals(7542539201L, arrayManipulation(n, queries));
    }
}
