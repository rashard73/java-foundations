
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

    public void setName(String name){
        this.name = name;
    }

    public void setGrades(double[] grades){
        this.grades = grades;
    }

    public double[] getGrades(){
        return grades;
    }

    public String getName(){
        return name;
    }

    public double calculateAverage(){
        if (grades.length == 0){
            return  0.0;
        }

        double total = 0;
        for (double studentGrade : this.grades) {
            total += studentGrade;
        }
        return total / grades.length;
    }

    public boolean hasPassed(){
        return calculateAverage() >= 65;
    }

    public void displayResults(){
        System.out.println("Students name: " + this.name);
        System.out.println("Students grades: " + Arrays.toString(this.grades));
        System.out.printf("Students average: %.2f ", calculateAverage());
        System.out.println("Status: " + (hasPassed() ? "PASS" : "FAIL"));
    }
}
