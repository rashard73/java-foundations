import java.util.Scanner;
import java.util.Arrays;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double [] grades){
        this.name = name;
        this.grades = grades;
    }

    public Student(){
        this.name = "Unknown";
        this.grades = new double [0];
    }

    public static Scanner scanner = new Scanner(System.in);

    public void setName(String name){
        this.name = name;
    }

    public void setGrades(int numOfGrades){

        this.grades = new double[numOfGrades];

        System.out.print("Please enter " + grades.length +" of the students grades: ");
        for(int i=0; i < grades.length; i++){
            this.grades[i]= scanner.nextDouble();
        }
    }

    public double[] getGrades(){
        return grades;
    }

    public String getName(){
        return name;
    }

    public double calculateAverage(){
        double total = 0;
        for (double studentGrade : this.grades) {
            total += studentGrade;
        }
        return total / grades.length;
    }

    public void displayResults(){
        System.out.println("Students name: " + this.name);
        System.out.println("Students grades: " + Arrays.toString(this.grades));
        System.out.printf("Students average: %.2f ", calculateAverage());

        if(calculateAverage() >= 65.00){
            System.out.println("This student has passed!");
        }else{
            System.out.println("This student has failed.");
        }
    }
}
