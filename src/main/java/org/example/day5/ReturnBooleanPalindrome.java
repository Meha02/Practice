package org.example.day5;

public class ReturnBooleanPalindrome {
    static boolean isPalindrome(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        return reverse.equals(name);
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("meha")); // false
    }
}
