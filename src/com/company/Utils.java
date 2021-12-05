package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utils {

    public long countLinesFromFile(String filename) {

        Path path = Paths.get(filename);

        long lines = 0;

        try {
            lines = Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public int[][] read2dArrayFromFile(String filename) throws FileNotFoundException {

        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));

        int rows = (int) countLinesFromFile(filename);
        int columns = rows;
        int [][] intArray = new int[rows][columns];

        while(sc.hasNextLine()) {
            for (int i=0; i<intArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");

                for (int j=0; j<line.length; j++) {
                    intArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }

        return intArray;
    }
}
