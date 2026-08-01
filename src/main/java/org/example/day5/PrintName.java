package org.example.day5;

import java.util.Scanner;

public class PrintName {
    static void stringOperations(String name) {
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        stringOperations(sc.nextLine());
    }
}
