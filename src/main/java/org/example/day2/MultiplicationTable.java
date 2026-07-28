package org.example.day2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        double number=sc.nextDouble();
        for(int i=0;i<=10;i++){
            System.out.println(number*i);
        }
    }
}
