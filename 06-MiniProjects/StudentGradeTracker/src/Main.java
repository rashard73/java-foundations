import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== Student Grade Tracker ===");

        boolean running = true;

        while (running) {

            System.out.println("\n1. Enter student grades");
            System.out.println("2. Exit");

            int choice = readIntegerInRange(
                    "Choose an option: ", 1, 2
            );

            switch (choice) {
                case 1:
                    createStudent();
                    break;

                case 2:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }

        scanner.close();
    }

    private static void createStudent() {

        String name = readStudentName();

        int count = readIntegerInRange(
                "How many grades? ", 1, Integer.MAX_VALUE
        );

        double[] grades = new double[count];

        for (int i = 0; i < count; i++) {

            grades[i] = readGrade(
                    "Enter grade " + (i + 1) + ": "
            );
        }

        Student student = new Student(name, grades);

        displayStudent(student);
    }

    private static String readStudentName() {

        while (true) {

            System.out.print("Enter student name: ");

            String name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println(
                    "Name cannot be empty. Please try again."
            );
        }
    }

    private static int readIntegerInRange(
            String prompt, int min, int max) {

        while (true) {

            System.out.print(prompt);

            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }

            } catch (NumberFormatException e) {
                // Invalid input: show the message below.
            }

            System.out.println(
                    "Enter a whole number between "
                            + min + " and " + max + "."
            );
        }
    }

    private static double readGrade(String prompt) {

        while (true) {

            System.out.print(prompt);

            String input = scanner.nextLine().trim();

            try {
                double grade = Double.parseDouble(input);

                if (Double.isFinite(grade)
                        && grade >= 0
                        && grade <= 100) {
                    return grade;
                }

            } catch (NumberFormatException e) {
                // Invalid input: show the message below.
            }

            System.out.println(
                    "Invalid grade. Enter a number from 0 to 100."
            );
        }
    }

    private static void displayStudent(Student student) {

        System.out.println("\n=== Student Report ===");

        System.out.println("Name: " + student.getName());

        System.out.print("Grades: ");

        for (double grade : student.getGrades()) {
            System.out.print(grade + " ");
        }

        System.out.printf(
                "%nAverage: %.2f%n",
                student.calculateAverage()
        );
    }
}