package org.example.day4;

public class FindAverageAndSum {
    static int sum(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    static int average(int sum,int a[]){
        int arrayLength=a.length;
        int avg=sum/arrayLength;
        return avg;
    }
    public static void main(String args[]){
        int[] marks={90,78,56,34,100};
        System.out.println(sum(marks));
        System.out.println(average(sum(marks),marks));

    }
}
