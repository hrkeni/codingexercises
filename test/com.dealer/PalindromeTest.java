package com.dealer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by harshith on 5/18/16.
 */
public class PalindromeTest {
    @Test
    public void checkPalindromeTest() {
        Palindrome p = new Palindrome();
        assertTrue(p.checkPalindrome("pop"));
        assertTrue(p.checkPalindrome("Ah, Satan sees Natasha!"));
        assertFalse(p.checkPalindrome("Not really a palindrome!"));
    }

}