package org.example.day2;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess A Number:");
        int number=sc.nextInt();
        int secret=7;
        while(number!=secret){
            System.out.println("Try Again");
            number=sc.nextInt();
        }
        System.out.println("Your Guess is correct!");
    }
}
