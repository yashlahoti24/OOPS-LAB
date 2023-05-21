import java.util.Scanner;

class HalfDiamondPattern {
    private int numRows;

    public HalfDiamondPattern(int numRows) {
        this.numRows = numRows;
    }

    public void displayPattern() {
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class LAB_12_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows from the user
        System.out.print("Enter the number of rows (half of the diamond): ");
        int numRows = scanner.nextInt();

        // Create an object of HalfDiamondPattern class
        HalfDiamondPattern halfDiamondPattern = new HalfDiamondPattern(numRows);

        // Display the half diamond pattern
        halfDiamondPattern.displayPattern();
    }
}
