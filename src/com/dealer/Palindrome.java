package com.dealer;

/**
 * Created by harshith on 5/18/16.
 */
public class Palindrome {

    /**
     * Checks if a string is a palindrome. Ignores case and all
     * non-alphabetical characters. Note: an empty string is assumed
     * to be a valid palindrome.
     * @param str
     *      The input string
     * @return Boolean result of the string being a palindrome
     */
    public boolean checkPalindrome(String str) {
        // clean the string of all non-alpha characters and convert to uppercase
        String cleaned = str.replaceAll("[^A-Za-z]", "").toUpperCase();
        // reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();
        // compare the cleaned string with the reverse
        return cleaned.equals(reversed);
    }
}
