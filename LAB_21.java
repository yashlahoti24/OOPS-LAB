import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course \"" + course + "\" added for " + name);
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course \"" + course + "\" removed for " + name);
        } else {
            System.out.println("Course \"" + course + "\" not found for " + name);
        }
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, grade);

        char choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add course");
            System.out.println("2. Remove course");
            System.out.println("3. Display courses");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = scanner.nextLine();
                    student.addCourse(courseToAdd);
                    break;
                case '2':
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();
                    student.removeCourse(courseToRemove);
                    break;
                case '3':
                    student.displayCourses();
                    break;
                case '4':
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != '4');
    }
}
