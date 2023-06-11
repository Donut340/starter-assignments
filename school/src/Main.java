package src;

public class Main {
    public static void main(String[] args) {
        // Create a School object
        School school = new School("My School");

        // Add 3 teachers to the teacher list
        Teacher teacher1 = new Teacher("John", "Doe", "Mathematics");
        Teacher teacher2 = new Teacher("Jane", "Smith", "English");
        Teacher teacher3 = new Teacher("Michael", "Johnson", "Science");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        // Add 10 students to the student list
        Student student1 = new Student("Alice", "Johnson", 10);
        Student student2 = new Student("Bob", "Smith", 9);
        Student student3 = new Student("Charlie", "Davis", 11);
        Student student4 = new Student("Emma", "Wilson", 10);
        Student student5 = new Student("Jack", "Brown", 9);
        Student student6 = new Student("Lily", "Taylor", 11);
        Student student7 = new Student("Noah", "Anderson", 10);
        Student student8 = new Student("Olivia", "Clark", 9);
        Student student9 = new Student("Sophia", "Harris", 11);
        Student student10 = new Student("William", "Martinez", 10);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);

        // Display both lists
        System.out.println("Teachers in the school:");
        school.showAllTeachers();

        System.out.println("\nStudents in the school:");
        school.showAllStudents();

        // Remove 2 students
        school.deleteStudent(student3);
        school.deleteStudent(student6);

        // Remove 1 teacher
        school.deleteTeacher(teacher2);

        // Display both lists again
        System.out.println("\nTeachers in the school after removal:");
        school.showAllTeachers();

        System.out.println("\nStudents in the school after removal:");
        school.showAllStudents();
    }
}
