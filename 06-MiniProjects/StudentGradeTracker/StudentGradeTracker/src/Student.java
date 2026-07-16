
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
        double average = calculateAverage();

        System.out.println("Student's name: " + this.name);
        System.out.println("Student's grades: " + Arrays.toString(this.grades));
        System.out.printf("Student's average: %.2f%n ", average);
        System.out.println("Status: " + (hasPassed() ? "PASS" : "FAIL"));
    }

    public static double calculateClassAverage(Student [] students){
        double total = 0;

        for (Student student : students){
            total += student.calculateAverage();
        }

        return total / students.length;
    }

    public static double findHighestAverage(Student [] students){
        double highestAverage = students[0].calculateAverage();

        for (Student student : students){
            if(highestAverage < student.calculateAverage()){
                highestAverage = student.calculateAverage();
            }
        }

        return highestAverage;
    }

    public static double findLowestAverage(Student [] students){
        double lowestAverage = students[0].calculateAverage();

        for (Student student : students){
            if(lowestAverage > student.calculateAverage()){
                lowestAverage = student.calculateAverage();
            }
        }

        return lowestAverage;
    }

    public static int countPassingStudents(Student [] students){
        int numPassed = 0;

        for (Student student : students){
            if(student.hasPassed()){
                numPassed++;
            }
        }

        return numPassed;
    }

}
