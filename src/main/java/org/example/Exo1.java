package org.example;

public class Exo1 {
    public Exo1() {
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        } else {
            s = s.toLowerCase().replaceAll("\\s+", "");
            int i = 0;

            for(int j = s.length() - 1; i < j; --i) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }

            return true;
        }
    }
}
