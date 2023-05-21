// Question 3.1
//import java.util.*;
//
//class StringReverser {
//    private String inputString;
//
//    public StringReverser(String inputString) {
//        this.inputString = inputString;
//    }
//
//    public String reverseString() {
//        StringBuilder reversedString = new StringBuilder(inputString);
//        return reversedString.reverse().toString();
//    }
//}
//
//public class LAB_3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
//
//        StringReverser reverser = new StringReverser(inputString);
//        String reversedString = reverser.reverseString();
//
//        System.out.println("Reversed string: " + reversedString);
//    }
//}


//Question 3.2
import java.util.*;

class PalindromeChecker {
    private String inputString;

    public PalindromeChecker(String inputString) {
        this.inputString = inputString;
    }

    public boolean isPalindrome() {
        String processedString = inputString.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = processedString.length() - 1;

        while (left < right) {
            if (processedString.charAt(left) != processedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

public class LAB_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(inputString);
        boolean isPalindrome = checker.isPalindrome();

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
