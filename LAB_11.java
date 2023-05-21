//// Question 11.1
//
//import java.util.Scanner;
//
//class MultiplicationTable {
//    private int number;
//
//    public MultiplicationTable(int number) {
//        this.number = number;
//    }
//
//    public void printTable() {
//        for (int i = 1; i <= 10; i++) {
//            int result = number * i;
//            System.out.println(number + " x " + i + " = " + result);
//        }
//    }
//}
//
//public class LAB_11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the number from the user
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Create an object of MultiplicationTable class
//        MultiplicationTable table = new MultiplicationTable(number);
//
//        // Print the multiplication table
//        table.printTable();
//    }
//}

// Question 11.2

import java.util.Scanner;

class PrimeChecker {
    private int number;

    public PrimeChecker(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

public class LAB_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an object of PrimeChecker class
        PrimeChecker primeChecker = new PrimeChecker(number);

        // Check if the number is prime
        boolean isPrime = primeChecker.isPrime();

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

