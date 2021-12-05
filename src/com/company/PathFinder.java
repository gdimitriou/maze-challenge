package com.company;

public class PathFinder {

    public static void findPath(int matrix[][], int n) {

        boolean visited[][] = new boolean[n][n];
        boolean pathExists = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // if matrix[i][j] is source and it is not visited
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    // Starting from i, j and then finding the path
                    if (doesPathExist(matrix, i, j, visited)) {
                        pathExists = true;
                        break;
                    }
                }
            }
        }

        if (pathExists) {
            System.out.println("Path Exists");
        } else {
            System.out.println("Path does not exist");
        }
    }

    public static boolean isInsideMatrix(int i, int j, int matrix[][]) {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean doesPathExist(int matrix[][], int i, int j, boolean visited[][]) {

        // Checking the boundaries, walls and whether the cell is unvisited
        if (isInsideMatrix(i, j, matrix) && matrix[i][j] != 0 && !visited[i][j]) {
            // Make the cell visited
            visited[i][j] = true;

            // if the cell is the required destination then return true
            if (matrix[i][j] == 2) {
                System.out.println(i + "," +j);
                return true;
            }

            // traverse up
            boolean up = doesPathExist(matrix, i - 1, j, visited);

            // if path is found in up direction return true
            if (up) {
                System.out.println(i + "," +j);
                return true;
            }

            // traverse left
            boolean left = doesPathExist(matrix, i, j - 1, visited);

            // if path is found in left direction return true
            if (left) {
                System.out.println(i + "," +j);
                return true;
            }

            // traverse down
            boolean down = doesPathExist(matrix, i + 1, j, visited);

            // if path is found in down direction return true
            if (down) {
                System.out.println(i + "," +j);
                return true;
            }

            // traverse right
            boolean right = doesPathExist(matrix, i, j + 1, visited);

            // if path is found in right direction return true
            if (right) {
                System.out.println(i + "," +j);
                return true;
            }
        }

        // no path has been found
        return false;
    }

}
