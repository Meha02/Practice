package org.example.day4;

public class PrintArrays {
    static int[] arrays(int a[]){
        return a;
    }
    public static void main(String args[]){
        int arr[]= {45,87,37,89,56};
        int[] result=arrays(arr);
        for(int i : result){
            System.out.println(i);
        }

    }
}
