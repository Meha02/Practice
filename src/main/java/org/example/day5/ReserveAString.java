package org.example.day5;

public class ReserveAString {
    static String reverse(String name) {
        String reverse = "";
        for (int ch = name.length() - 1; ch >= 0; ch--) {
            reverse += name.charAt(ch);
        }
        return reverse;
    }

    public static void main(String args[]) {
        System.out.println(reverse("tokyo"));
    }
}
