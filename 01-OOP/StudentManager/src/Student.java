public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public double getGpa(){
        return gpa;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void displayStudent(){
        System.out.println("Student Name: " + this.name + " Major: " + this.major +
                " GPA: " + this.gpa);
    }
    public boolean isHonorStudent(){
        return gpa >= 3.5;
    }

}
