import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void testCalculateAverageNormal() {
        Student student = new Student();
        student.setGrades(new double[]{80, 90, 100});

        assertEquals(
                90.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testCalculateAverageEmpty() {
        Student student = new Student();
        student.setGrades(new double[]{});

        assertEquals(
                0.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testCalculateAverageSingleGrade() {
        Student student = new Student();
        student.setGrades(new double[]{75});

        assertEquals(
                75.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testCalculateAverageWithDecimals() {
        Student student = new Student();
        student.setGrades(new double[]{85.5, 90, 92.5});

        assertEquals(
                89.333, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testCalculateAverageAtBoundaries() {
        Student student = new Student();
        student.setGrades(new double[]{0, 100});

        assertEquals(
                50.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testCalculateAverageWithNullGrades() {
        Student student = new Student();
        student.setGrades(null);

        assertEquals(
                0.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testDefaultStudentHasNoGrades() {
        Student student = new Student();

        assertEquals(
                0.0, student.calculateAverage(), 0.001
        );
    }

    @Test
    void testStudentNameValidation() {
        Student student = new Student();

        assertThrows(
                IllegalArgumentException.class,
                () -> student.setName("   ")
        );
    }

    @Test
    void testNegativeGradeRejected() {
        Student student = new Student();

        assertThrows(
                IllegalArgumentException.class,
                () -> student.setGrades(new double[]{-10})
        );
    }

    @Test
    void testGradeAbove100Rejected() {
        Student student = new Student();

        assertThrows(
                IllegalArgumentException.class,
                () -> student.setGrades(new double[]{105})
        );
    }

    @Test
    void testNaNGradeRejected() {
        Student student = new Student();

        assertThrows(
                IllegalArgumentException.class,
                () -> student.setGrades(new double[]{Double.NaN})
        );
    }

    @Test
    void testGradesAreDefensivelyCopied() {
        Student student = new Student();
        double[] original = {80, 90};

        student.setGrades(original);
        original[0] = 0;

        assertEquals(
                85.0, student.calculateAverage(), 0.001
        );
    }
}