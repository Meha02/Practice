package org.example.day6;

public class GradeCalculator {

    static void printStudentReport(MarksClass student){
        int totalMarksScored = student.getTotalmarks();
        double avgMarksScored = student.getAverage();
        System.out.println("Name: " + student.name);
        System.out.println("Totalmarks: " + totalMarksScored);
        System.out.println("Average: " + avgMarksScored);
        System.out.println("Highest Mark: "+student.getHighestMarks());
        System.out.println("Lowest Mark: "+student.getLowestMarks());
        System.out.println("Grade: " + student.getGrade());
    }

    public static void main(String args[]) {
        MarksClass student1 = new MarksClass("John Doe", new int[]{85, 92, 78, 90, 88});
        MarksClass student2 = new MarksClass("Sam jean", new int[]{90, 79, 99, 95, 100});
        printStudentReport(student1);
        System.out.println();
        printStudentReport(student2);
    }
}

