package org.example.day4;
import java.util.Scanner;

public class MarksAnalyser {
    static int totalMarks(int[] a){
        int total=0;
        for(int i=0;i<a.length;i++){
            total += a[i];
        }
        return total;
    }
    static double average(int total,int[] a){
        int arrSize=a.length;
        return (double) total/arrSize;
    }
    static void highestAndLowestMarks(int[] a){
        int highMark=a[0];
        int lowMark=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>highMark){
                highMark=a[i];
            }
            if(a[i]<lowMark){
                lowMark=a[i];
            }
        }
        System.out.println("Highest Marks: "+highMark);
        System.out.println("Lowest Marks: "+lowMark);
    }

    static String calculateGrade(double average){
        if(average >= 90){
            return "A";
        }
        else if(average >= 80){
            return "B";
        }
        else if(average >= 70){
            return "C";
        }
        else if(average >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Subjects You have:");
        int subjects=sc.nextInt();
        System.out.println("Enter the Marks of Each Subject:");
        int marks[]=new int[subjects];
        for(int i = 0; i<subjects; i++){
            marks[i]=sc.nextInt();
        }
        int totalMarksScored = totalMarks(marks);
        double avgMarksScored = average(totalMarksScored, marks);
        System.out.println("Total Marks: " + totalMarksScored);
        System.out.println("Average Marks: "+ avgMarksScored);
        highestAndLowestMarks(marks);
        System.out.println("Grade: "+ calculateGrade(avgMarksScored));
    }
}
