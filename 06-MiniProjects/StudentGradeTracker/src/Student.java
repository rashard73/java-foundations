public class Student {

    private String name;
    private double[] grades;

    public Student() {
        this.name = "";
        this.grades = new double[0];
    }

    public Student(String name, double[] grades) {
        setName(name);
        setGrades(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Student name cannot be empty."
            );
        }

        this.name = name.trim();
    }

    public double[] getGrades() {
        return grades.clone();
    }

    public void setGrades(double[] grades) {
        if (grades == null) {
            this.grades = new double[0];
            return;
        }

        for (double grade : grades) {
            if (!Double.isFinite(grade)
                    || grade < 0
                    || grade > 100) {
                throw new IllegalArgumentException(
                        "Grades must be between 0 and 100."
                );
            }
        }

        this.grades = grades.clone();
    }

    public double calculateAverage() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }

        double total = 0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }
}