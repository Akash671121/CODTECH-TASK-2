package CodTech;

import java.util.Scanner;

public class Studentmarks {

    public static double calculateGPA(double averageGrade) {
        if (averageGrade >= 90) {
            return 4.0;
        } else if (averageGrade >= 80) {
            return 3.0;
        } else if (averageGrade >= 70) {
            return 2.0;
        } else if (averageGrade >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
    public static String getLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return "A";
        } else if (averageGrade >= 80) {
            return "B";
        } else if (averageGrade >= 70) {
            return "C";
        } else if (averageGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects or assignments: ");
        int numSubjects = scanner.nextInt();
        double[] grades = new double[numSubjects];
        double totalGrades = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject/assignment " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            totalGrades += grades[i];
        }
        double averageGrade = totalGrades / numSubjects;
        double gpa = calculateGPA(averageGrade);
        String letterGrade = getLetterGrade(averageGrade);
        System.out.println("\n--- Student Grade Summary ---");
        System.out.println("Number of subjects/assignments: " + numSubjects);
        System.out.println("Average grade: " + averageGrade);
        System.out.println("Letter grade: " + letterGrade);
        System.out.println("GPA: " + gpa);
        scanner.close();
    }
}
