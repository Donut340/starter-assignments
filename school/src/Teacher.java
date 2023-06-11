package src;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    /**
     * Constructs a Teacher object with the given first name, last name, and subject.
     *
     * @param firstName the first name of the teacher
     * @param lastName  the last name of the teacher
     * @param subject   the subject taught by the teacher
     */
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    /**
     * Gets the first name of the teacher.
     *
     * @return the first name of the teacher
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the teacher.
     *
     * @param firstName the first name of the teacher
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the teacher.
     *
     * @return the last name of the teacher
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the teacher.
     *
     * @param lastName the last name of the teacher
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the subject taught by the teacher.
     *
     * @return the subject taught by the teacher
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject taught by the teacher.
     *
     * @param subject the subject taught by the teacher
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Prints the name and subject of the teacher.
     */
    public void printTeacherInfo() {
        System.out.println("Name: " + firstName + " " + lastName + " Subject: " + subject);
    }
}
