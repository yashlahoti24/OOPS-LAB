import java.util.Scanner;

interface Account {
    void set();
    void display();
}

interface Person1 {
    void store();
    void disp();
}

class Customer implements Account, Person1 {
    private String name;
    private double accountNumber;
    private double balance;

    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + (balance * 0.05));
    }

    public void store() {
        // Empty method from the Person interface
    }

    public void disp() {
        // Empty method from the Person interface
    }
}

public class LAB_19 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.set();
        customer.display();
    }
}

