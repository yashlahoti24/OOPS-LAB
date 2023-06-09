// You are required to compute the power of a number by implementing a calculator. Create a class My Calculator which consists of a single method long power (int, int). This method takes two integers n and p, as parameters and finds (n)p. If either or is negative, then the method must throw an exception which says " n or p should not be negative”. Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”.

import java.util.Scanner;

// Custom exception class for handling negative inputs
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// Calculator class
class MyCalculator {
    public long power(int n, int p) throws NegativeNumberException {
        if (n < 0 || p < 0) {
            throw new NegativeNumberException("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new NegativeNumberException("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

// Main class
public class LAB_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create object of MyCalculator class
        MyCalculator calculator = new MyCalculator();

        try {
            // Take user input for n and p
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();
            System.out.print("Enter the value of p: ");
            int p = scanner.nextInt();

            // Call the power method and print the result
            long result = calculator.power(n, p);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
