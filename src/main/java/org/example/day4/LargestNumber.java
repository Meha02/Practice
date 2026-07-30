package org.example.day4;

public class LargestNumber {
    static int MaxNumber(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] numbers={70,80,100,34,60};
        System.out.println(MaxNumber(numbers));
    }
}
