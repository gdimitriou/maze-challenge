# maze-challenge
Find whether there is path between two cells in matrix

# Algorithm
1. Traverse the matrix and find the starting index of the matrix.
2. Create a recursive function that takes the index and visited matrix.
3. Mark the current cell and check if the current cell is a destination or not. 
If the current cell is destination return true.
4. Call the recursion function for all adjacent empty and unvisited cells.
5. If any of the recursive functions returns true then unmark the cell and 
return true else unmark the cell and return false.

# Steps to run the program:
Download the project or clone the code to your favorite IDE (https://github.com/gdimitriou/maze-challenge.git).

Run:
Run Main.main();

# Assumptions
1. The matrix must be taken as input text file as per example inside "src/input" directory.
2. Matrix has to be strictly nxn.
3. Start point cell is marked as 1.
4. End point cell is marked as 2.
5. Wall cells are marked as 0.
6. Blank cells are marked as 3.

# Output
1. If there is no path between start and end point then the console output is: "Path does not exist".
2. If there is a path between start and end point then the console output would be like: 
   0,3
   0,2
   0,1
   0,0 
   Path Exists
   *First cell combination is END*
   *Last cell combination is START*