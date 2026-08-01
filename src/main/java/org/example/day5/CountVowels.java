package org.example.day5;

public class CountVowels {
    static int vowels(String name) {
        int vowelCount = 0;
        String value = name.toLowerCase();
        for (int i = 0; i <= value.length() - 1; i++) {
            if (value.charAt(i) == 'a' || value.charAt(i) == 'e' || value.charAt(i) == 'i' || value.charAt(i) == 'o' || value.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        int count = vowels("Umberlla");
        System.out.println("Number of vowels: " + count);
    }
}
