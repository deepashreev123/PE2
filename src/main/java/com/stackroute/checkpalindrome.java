package com.stackroute;

public class checkpalindrome {
    public static boolean isPalinedrome(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
