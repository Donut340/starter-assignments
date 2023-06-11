package src;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private String studentNumber;

    /**
     * Constructs a Student object with the given first name, last name, and grade.
     * Generates a unique student number for the student.
     *
     * @param firstName the first name of the student
     * @param lastName  the last name of the student
     * @param grade     the grade of the student
     */
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = generateStudentNumber();
    }

    /**
     * Generates a unique student number for the student.
     *
     * @return the generated student number
     */

    private static int studentCount = 0; // to keep track of the number of students

    private String generateStudentNumber() {
        String prefix = "S"; // prefix for the student number
        int number = ++studentCount; // increment student count and assign the value to the number
        
        // Generate a formatted student number with leading zeros
        String studentNumber = String.format("%s%04d", prefix, number);
        
        return studentNumber;
    }

    /**
     * Gets the first name of the student.
     *
     * @return the first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student.
     *
     * @param firstName the first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the student.
     *
     * @return the last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student.
     *
     * @param lastName the last name of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the grade of the student.
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets the grade of the student.
     *
     * @param grade the grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Gets the student number of the student.
     *
     * @return the student number of the student
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Prints the student's name and grade.
     */
    public void printStudentInfo() {
        System.out.println("Name: " + firstName + " " + lastName + " Grade: " + grade);
    }
}
