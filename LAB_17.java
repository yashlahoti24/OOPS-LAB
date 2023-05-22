// Question 17.1
import java.util.Arrays;
import java.util.Scanner;

//public class LAB_17 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Create an array to store the strings
//        String[] strings = new String[10];
//
//        // Read strings from the console
//        System.out.println("Enter 10 strings:");
//        for (int i = 0; i < 10; i++) {
//            System.out.print("String " + (i + 1) + ": ");
//            strings[i] = scanner.nextLine();
//        }
//
//        // Sort the strings
//        Arrays.sort(strings);
//
//        // Print the sorted strings
//        System.out.println("Sorted Strings:");
//        for (String str : strings) {
//            System.out.println(str);
//        }
//    }
//}

// Question 17.2

import java.util.Scanner;

//public class LAB_17 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the first string from the user
//        System.out.print("Enter the first string: ");
//        String firstString = scanner.nextLine();
//
//        // Read the second string from the user
//        System.out.print("Enter the second string: ");
//        String secondString = scanner.nextLine();
//
//        // Combine the strings
//        String combinedString = combineStrings(firstString, secondString);
//
//        // Print the combined string
//        System.out.println("Combined String: " + combinedString);
//    }
//
//    public static String combineStrings(String str1, String str2) {
//        return str1 + str2;
//    }
//}


// Question 17.3

import java.util.Scanner;

public class LAB_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first string from the user
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Reverse the first string
        String reversedString = reverseString(firstString);

        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
