package org.example;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your details");
        String name=sc.next();
        int age=sc.nextInt();
        String city=sc.next();
        System.out.println("My name is "+name+".");
        System.out.println("I am "+age+" old.");
        System.out.println("I am living in "+city+".");
    }
}
