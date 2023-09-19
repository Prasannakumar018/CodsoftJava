import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            int[] studentMarks = new int[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks obtained in subject " + (j + 1) + ": ");
                studentMarks[j] = scanner.nextInt();
            }

            students[i] = new Student(name, studentMarks);
        }

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student: " + students[i].name);
            System.out.println("Average Percentage: " + students[i].calculateAverage() + "%");
            System.out.println("Grade: " + getGrade(students[i].calculateAverage()) + "\n");
        }

        scanner.close();
    }

    static String getGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
}
