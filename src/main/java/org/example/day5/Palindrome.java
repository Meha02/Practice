package org.example.day5;

public class Palindrome {
    static void checkPalindrome(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        if (reverse.equals(name)) {
            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }
    }

    public static void main(String args[]) {
        checkPalindrome("racecar");
        checkPalindrome("madam");
        checkPalindrome("meha");
    }
}
