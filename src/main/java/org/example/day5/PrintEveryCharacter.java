package org.example.day5;

public class PrintEveryCharacter {
    static void printChar(String name) {
        for (char c : name.toCharArray()) {
            System.out.println(c + " ");
        }
    }

    public static void main(String args[]) {
        printChar("Meha");
    }
}
