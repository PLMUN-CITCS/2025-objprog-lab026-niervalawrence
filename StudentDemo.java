class Student {
    // Private attributes for the student details
    private String name;
    private int id;
    private double gpa;

    // Static variable to track the number of students
    private static int studentCount = 0;

    // Constructor to initialize the student's details
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;  // Increment student count every time a new student is created
    }

    // Method to display the student's information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Static method to display the total number of students
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 101, 3.8);
        Student student2 = new Student("Bob", 102, 3.5);
        Student student3 = new Student("Charlie", 103, 3.9);

        // Displaying information for each student
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        // Displaying the total number of students
        Student.displayStudentCount();
    }
}
