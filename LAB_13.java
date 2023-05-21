// Question 13.1

//import java.util.Scanner;
//
//class Matrix {
//    private int[][] matrix;
//    private int numRows;
//    private int numCols;
//
//    public Matrix(int numRows, int numCols) {
//        this.numRows = numRows;
//        this.numCols = numCols;
//        this.matrix = new int[numRows][numCols];
//    }
//
//    public void readMatrix(Scanner scanner) {
//        System.out.println("Enter the elements of the matrix:");
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numCols; j++) {
//                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//    }
//
//    public void displayMatrix() {
//        System.out.println("Matrix:");
//        for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < numCols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public void transpose() {
//        int[][] transposeMatrix = new int[numCols][numRows];
//        for (int i = 0; i < numCols; i++) {
//            for (int j = 0; j < numRows; j++) {
//                transposeMatrix[i][j] = matrix[j][i];
//            }
//        }
//
//        System.out.println("Transpose Matrix:");
//        for (int i = 0; i < numCols; i++) {
//            for (int j = 0; j < numRows; j++) {
//                System.out.print(transposeMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
//public class LAB_13 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the dimensions of the matrix from the user
//        System.out.print("Enter the number of rows: ");
//        int numRows = scanner.nextInt();
//        System.out.print("Enter the number of columns: ");
//        int numCols = scanner.nextInt();
//
//        // Create an object of Matrix class
//        Matrix matrix = new Matrix(numRows, numCols);
//
//        // Read the elements of the matrix from the user
//        matrix.readMatrix(scanner);
//
//        // Display the original matrix
//        matrix.displayMatrix();
//
//        // Find and display the transpose of the matrix
//        matrix.transpose();
//    }
//}


// Question 13.2


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class WordCounter {
    private String filename;

    public WordCounter(String filename) {
        this.filename = filename;
    }

    public int countWords() {
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return wordCount;
    }
}

public class LAB_13 {
    public static void main(String[] args) {
        String filename = "input.txt"; // Replace with the path to your text file

        // Create an object of WordCounter class
        WordCounter wordCounter = new WordCounter(filename);

        // Count the number of words in the file
        int wordCount = wordCounter.countWords();

        System.out.println("Number of words in the file: " + wordCount);
    }
}

