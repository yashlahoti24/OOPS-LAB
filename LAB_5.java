// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

import java.util.Scanner;

// Abstract class Marks
abstract class Marks {
    // Abstract method getPercentage
    abstract double getPercentage();
}

// Class A inherits from Marks
class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    // Constructor for student A
    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Implementation of getPercentage for student A
    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

// Class B inherits from Marks
class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    // Constructor for student B
    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    // Implementation of getPercentage for student B
    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class LAB_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for student A
        System.out.print("Enter marks for subject 1 (out of 100) for student A: ");
        double subject1A = scanner.nextDouble();
        System.out.print("Enter marks for subject 2 (out of 100) for student A: ");
        double subject2A = scanner.nextDouble();
        System.out.print("Enter marks for subject 3 (out of 100) for student A: ");
        double subject3A = scanner.nextDouble();

        // Create object for student A
        A studentA = new A(subject1A, subject2A, subject3A);
        double percentageA = studentA.getPercentage();
        System.out.println("Percentage of marks obtained by student A: " + percentageA + "%");

        // Input marks for student B
        System.out.print("Enter marks for subject 1 (out of 100) for student B: ");
        double subject1B = scanner.nextDouble();
        System.out.print("Enter marks for subject 2 (out of 100) for student B: ");
        double subject2B = scanner.nextDouble();
        System.out.print("Enter marks for subject 3 (out of 100) for student B: ");
        double subject3B = scanner.nextDouble();
        System.out.print("Enter marks for subject 4 (out of 100) for student B: ");
        double subject4B = scanner.nextDouble();

        // Create object for student B
        B studentB = new B(subject1B, subject2B, subject3B, subject4B);
        double percentageB = studentB.getPercentage();
        System.out.println("Percentage of marks obtained by student B: " + percentageB + "%");
    }
}
