package com.stackroute;

public class ReversingThePalindromeString {
    public boolean checkPalindrome(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(s.length() - i - 1);
        }

        return temp.equalsIgnoreCase(s);
    }
}
