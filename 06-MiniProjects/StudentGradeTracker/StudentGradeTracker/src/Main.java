import java.util.Scanner;
public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("How many students do you have? ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student [] studentArray = new Student [numOfStudents];

        for (int i = 0; i < studentArray.length; i++){
            Student student = new Student();
            inputStudentName(student);
            inputGrades(student);
            studentArray[i] = student;
            System.out.println();
        }

        System.out.println("\n========== Student Report ==========");

        for (Student student : studentArray){
            student.displayResults();
            System.out.println();
        }
    }
    public static void inputStudentName(Student student){

        System.out.print("Please enter a students name: ");
        String name = scanner.nextLine();
        student.setName(name);

    }

    public static void inputGrades(Student student){
        System.out.print("How many grades would you like to enter for this student? ");
        int numOfGrades = scanner.nextInt();
        scanner.nextLine();

        double [] grades = new double[numOfGrades];

        System.out.print("Please enter " + grades.length +" of the students grades: ");
        for(int i=0; i < grades.length; i++){
            grades[i]= scanner.nextDouble();
        }
        scanner.nextLine();
        student.setGrades(grades);
    }
}






