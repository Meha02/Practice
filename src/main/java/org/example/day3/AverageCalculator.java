package org.example.day3;

public class AverageCalculator {
    static int average(int n1, int n2, int n3){
        int total=(n1+n2+n3)/3;
        return total;
    }
    static String checkGrade(int total){
        if(total>=90 && total<=100){
            return "A";
        }
        else if(total>=80){
            return "B";
        }
        else if(total>=70){
            return "C";
        }
        else if(total>=60){
            return "D";
        }
        else{
            return "F";
        }
    }
    public static void main(String[] args){
        int avg=average(80, 90, 70);
        String grade=checkGrade(avg);
        System.out.println(avg);
        System.out.println(grade);
    }
}
