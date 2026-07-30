package org.example.day4;

public class SmallestNumber {
    static int minNumber(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] arr={90,30,20,10,5,80};
        System.out.println(minNumber(arr));
    }
}
