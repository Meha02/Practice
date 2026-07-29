package org.example.day3;

public class FindMaxValue {
    static int maxValue(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args){
        int maxVal=maxValue(899008848,453467584);
        System.out.println(maxVal);
    }
}
