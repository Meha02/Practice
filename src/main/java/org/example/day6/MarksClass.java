package org.example.day6;

public class MarksClass {
    String name;
    int[] marks;

    public MarksClass(String name,int[] marks){
        this.name=name;
        this.marks=marks;
    }
    int getTotalmarks(){
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }
    double getAverage(){
        int total = getTotalmarks();
        int arrSize = marks.length;
        return (double) total / arrSize;
    }
    int getHighestMarks(){
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;
    }
    int getLowestMarks(){
        int min=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        return min;
    }
    String getGrade(){
        double average=getAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
