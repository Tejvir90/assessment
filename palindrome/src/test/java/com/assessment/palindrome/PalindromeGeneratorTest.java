package com.assessment.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeGeneratorTest {

    PalindromeGenerator subject;

    @Test
    void testGeneratePalindrome() {
        subject = new PalindromeGenerator();
        String input = "Test";
        String palindrome = subject.generatePalindrome(input);
        assertEquals(palindrome, "tseT");
    }

    @Test
    void testGeneratePalindromeOdd() {
        subject = new PalindromeGenerator();
        String input = "YOy";
        String palindrome = subject.generatePalindrome(input);
        assertEquals(palindrome, "yOY");
    }
}