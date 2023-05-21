import java.util.*;

class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public void searchEntry(String name) {
        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
        } else {
            System.out.println("Not found");
        }
    }
}

public class LAB_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a phone book object
        PhoneBook phoneBook = new PhoneBook();

        // Read the number of entries
        System.out.print("Enter the number of entries in the phone book: ");
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the phone book entries
        for (int i = 0; i < numEntries; i++) {
            System.out.print("Enter the name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the phone number: ");
            String phoneNumber = scanner.nextLine();

            phoneBook.addEntry(name, phoneNumber);
        }

        // Read the queries until end-of-file
        while (scanner.hasNextLine()) {
            System.out.print("Enter the name to search (or type 'exit' to quit): ");
            String query = scanner.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            phoneBook.searchEntry(query);
        }
    }
}
