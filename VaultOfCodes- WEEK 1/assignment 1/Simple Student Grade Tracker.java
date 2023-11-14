import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 0;
        String studentNames[] = new String[99];
        double studentGrades[] = new double[99];

        while (true) {
            System.out.println("\nStudent Grade Tracker Menu: ");
            System.out.println("1. Add new student and grade");
            System.out.println("2. View list of students and grades");
            System.out.println("3. Calculate and display average grade");
            System.out.println("4. Exit");

            System.out.println("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name of the student: ");
                    String studentName = sc.nextLine();

                    System.out.println("Enter grade of the student: ");
                    double studentGrade = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    studentNames[numberOfStudents] = studentName;
                    studentGrades[numberOfStudents] = studentGrade;
                    numberOfStudents++;

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (numberOfStudents > 0) {
                        System.out.println("\nList of Students and Grades:");
                        for (int i = 0; i < numberOfStudents; i++) {
                            System.out.println(studentNames[i] + " : " + studentGrades[i]);
                        }
                    } else {
                        System.out.println("No students added yet!");
                    }
                    break;

                case 3:
                    if (numberOfStudents > 0) {
                        int totalGrades = 0;
                        for (int i = 0; i < numberOfStudents; i++) {
                            totalGrades += studentGrades[i];
                        }

                        double averageGrade = (double) totalGrades / numberOfStudents;
                        System.out.println("Average Grade: " + averageGrade);
                    } else {
                        System.out.println("No students added yet!");
                    }
                    break;

                case 4:
                    System.exit(1);

                default:
                    System.out.println("Invalid choice! Enter a valid one.");
            }
        }
    }
}
