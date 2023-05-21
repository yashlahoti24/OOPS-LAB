// Write the following code in your editor below:
// A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
// A class named Adder that inherits from a superclass named Arithmetic. The main method in the Tester class should print the following: SAMPLE O/P:My superclass is: Arithmetic


import java.util.Scanner;

// Superclass Arithmetic
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

// Subclass Adder
class Adder extends Arithmetic {
}

// Tester class
public class LAB_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create object of Adder class
        Adder adder = new Adder();


        // Take user input for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Print superclass name
        System.out.println("My superclass is: Arithmetic");

        // Call the add method and print the result
        int sum = adder.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
