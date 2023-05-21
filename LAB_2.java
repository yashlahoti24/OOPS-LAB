// Question 2.1
// Number of Repeated words in String
//import java.util.*;
//
//class StringProcessor {
//    private String inputString;
//
//    public StringProcessor(String inputString) {
//        this.inputString = inputString;
//    }
//
//    public int countDuplicateWords() {
//        String[] words = inputString.split("\\s+");
//        int duplicateCount = 0;
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i] != null) {
//                for (int j = i + 1; j < words.length; j++) {
//                    if (words[i].equals(words[j])) {
//                        duplicateCount++;
//                        words[j] = null;
//                    }
//                }
//            }
//        }
//
//        return duplicateCount;
//    }
//}
//
//public class LAB_2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String inputString = scanner.nextLine();
//
//        StringProcessor processor = new StringProcessor(inputString);
//        int duplicateCount = processor.countDuplicateWords();
//
//        System.out.println("Number of duplicate words in the string: " + duplicateCount);
//    }
//}


//Question 2.2
import java.util.*;

class StringChecker {
    private String inputString;

    public StringChecker(String inputString) {
        this.inputString = inputString;
    }

    public boolean containsLetterE() {
        return inputString.contains("e");
    }
}

public class LAB_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringChecker checker = new StringChecker(inputString);
        boolean containsE = checker.containsLetterE();

        if (containsE) {
            System.out.println("The string contains the letter 'e' in the word " + inputString + ".");
        }
        else {
            System.out.println("The string does not contains the letter 'e' in the word " + inputString + ".");
        }
    }
}
