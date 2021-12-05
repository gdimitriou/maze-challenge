package com.company;

import java.io.FileNotFoundException;

public class Main {

    private static String filename = "src/input/matrix.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Utils utils = new Utils();
        int dimensions = (int) utils.countLinesFromFile(filename);
        int[][] array = utils.read2dArrayFromFile(filename);

        PathFinder pathFinder = new PathFinder();
        pathFinder.findPath(array, dimensions);
    }

}
