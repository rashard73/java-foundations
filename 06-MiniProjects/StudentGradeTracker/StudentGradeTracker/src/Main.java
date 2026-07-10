import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String studentName = getName();

        System.out.print("How many grades would you like to enter? ");
        int numberOfGrades = scanner.nextInt();

        double[] studentGrades = new double[numberOfGrades];
        getGrades(studentGrades);

        double averageGrade = calculateAverage(studentGrades);

        displayResults(studentName, studentGrades, averageGrade);
        }


        public static String getName(){
            System.out.print("Please enter the students name: ");
            return scanner.nextLine();
        }

        public static void getGrades(double [] studentGrades){
            System.out.print("Please enter " + studentGrades.length +" of the students grades: ");
            for(int i=0; i < studentGrades.length; i++){
                studentGrades[i]= scanner.nextDouble();
            }
        }

        public static double calculateAverage(double [] studentGrades){
            double total = 0;
            for (double studentGrade : studentGrades) {
                total += studentGrade;
            }
            return total / studentGrades.length;
        }

        public static void displayResults(String studentName, double[] studentGrades, double averageGrade ){
            System.out.println("Students name: " + studentName);
            System.out.println("Students grades: " + Arrays.toString(studentGrades));
            System.out.printf("Students average: %.2f ", averageGrade);

            if(averageGrade >= 65.00){
                System.out.print("This student has passed!");
            }else{
                System.out.print("This student has failed.");
            }
        }
    }
