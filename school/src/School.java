package src;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    /**
     * Constructs a School object with the given name.
     *
     * @param name the name of the school
     */
    public School(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        // Initialize any additional fields here
    }

    /**
     * Adds a teacher to the list of teachers.
     *
     * @param teacher the teacher to add
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Adds a student to the list of students.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Deletes a teacher from the list of teachers.
     *
     * @param teacher the teacher to delete
     */
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * Deletes a student from the list of students.
     *
     * @param student the student to delete
     */
    public void deleteStudent(Student student) {
        students.remove(student);
    }

    /**
     * Displays all teachers in the list.
     */
    public void showAllTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    /**
     * Displays all students in the list.
     */
    public void showAllStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Add getters and setters for the fields

    /**
     * Gets the name of the school.
     *
     * @return the name of the school
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the school.
     *
     * @param name the name of the school
     */
    public void setName(String name) {
        this.name = name;
    }
}
