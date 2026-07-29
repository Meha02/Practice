package org.example.day3;

public class FindMaxValue {
    static void maxValue(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is the Maximum value");
        }
        else{
            System.out.println(n2+" is the maximum value");
        }
    }
    public static void main(String[] args){
        maxValue(3,8);
    }
}
