import java.util.Scanner;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student1 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student1(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range of 15 to 21.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains invalid characters or numbers.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class LAB_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            Student1 student = new Student1(rollNo, name, age, course);

            System.out.println("Student details:");
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
