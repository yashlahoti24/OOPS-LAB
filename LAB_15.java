import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LAB_15 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        // Prompt the user to enter the elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Iterator Loop
        System.out.println("Iterator Loop:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Advanced For Loop
        System.out.println("Advanced For Loop:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
