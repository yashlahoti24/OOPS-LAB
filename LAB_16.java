import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LAB_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove leading and trailing whitespaces
        input = input.trim();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordCounts = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                // Word already exists in the map, increment its count
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
                // Word doesn't exist in the map, add it with count 1
                wordCounts.put(word, 1);
            }
        }

        // Print the word counts
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}
