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
            inputData(student);
            studentArray[i] = student;
        }

        System.out.println("\n========== Student Report ==========");

        for (Student student : studentArray){
            student.displayResults();
            System.out.println();
        }


        }
    public static void inputData(Student student){

        System.out.print("Please enter a students name: ");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.print("How many grades would you like to enter for this student? ");
        int numOfGrades = scanner.nextInt();
        scanner.nextLine();
        student.setGrades(numOfGrades);
        System.out.println();

        }

    }



