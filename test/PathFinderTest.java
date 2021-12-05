import com.company.PathFinder;
import com.company.Utils;
import org.junit.Test;

import java.io.FileNotFoundException;

public class PathFinderTest {

    @Test
    public void testMethod1() throws FileNotFoundException {

        String filename = "src/input/matrixTest1.txt";

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);

    }

    @Test
    public void testMethod2() throws FileNotFoundException {

        String filename = "src/input/matrixTest2.txt";

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);

    }

    @Test
    public void testMethod3() throws FileNotFoundException {

        String filename = "src/input/matrixTest3.txt";

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);

    }

    @Test
    public void testMethod4() throws FileNotFoundException {

        String filename = "src/input/matrixTest4.txt";

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);

    }

    @Test
    public void testMethod5() throws FileNotFoundException {

        String filename = "src/input/matrixTest5.txt";

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);

    }


}
