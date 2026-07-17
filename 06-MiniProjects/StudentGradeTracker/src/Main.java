import java.util.Scanner;
public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       String prompt = "How many students are in your class? ";
        int numOfStudents = readPositiveInteger(prompt);

        Student [] studentArray = new Student [numOfStudents];

        for (int i = 0; i < studentArray.length; i++){
            Student student = new Student();
            inputStudentName(student);
            inputGrades(student);
            studentArray[i] = student;
            System.out.println();
        }
        displayStudentReport(studentArray);
        displayClassSummary(studentArray);


    }
    public static void inputStudentName(Student student){

        System.out.print("Please enter a students name: ");
        String name = scanner.nextLine();
        student.setName(name);

    }

    public static void inputGrades(Student student) {
        int numberOfGrades = readPositiveInteger("How many grades would you like to enter for this student? ");

        double[] grades = new double[numberOfGrades];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Grade %d of %d:%n", i + 1, grades.length);
            grades[i] = readGrade();
        }

        scanner.nextLine();
        student.setGrades(grades);
    }

    public static double readGrade(){
        while(true){
            System.out.print("Enter a grade between 0 and 100: ");

            if(!scanner.hasNextDouble()){
                System.out.print("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            double grade = scanner.nextDouble();

            if(grade >= 0 && grade <= 100){
                return grade;
            }

            System.out.println("Grade must be between 0 and 100.");
        }
    }

    public static int readPositiveInteger(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
                continue;
            }

            int number = scanner.nextInt();
            scanner.nextLine();

            if (number > 0) {
                return number;
            }

            System.out.println("The number must be greater than zero.");
        }
    }

    public static void displayStudentReport(Student [] students){
        System.out.println("\n========== Student Report ==========");

        for (Student student : students){
            student.displayResults();
            System.out.println();
        }
    }

    public static void displayClassSummary(Student[] students){
        System.out.println("\n ========== Class Summary ==========");

        System.out.printf("Class average: %.2f%n", Student.calculateClassAverage(students));
        System.out.printf("Highest average: %.2f%n", Student.findHighestAverage(students));
        System.out.printf("lowest average: %.2f%n", Student.findLowestAverage(students));
        System.out.println("Students passed: " + Student.countPassingStudents(students));
        System.out.println("Students failed: " + (students.length - Student.countPassingStudents(students)));
    }
}






