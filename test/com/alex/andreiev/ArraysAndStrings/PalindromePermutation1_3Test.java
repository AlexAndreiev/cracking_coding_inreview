package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutation1_3Test {

    @Test
    void isPalindrome() {
        var target = new PalindromePermutation1_3();
        assertTrue(target.PermutationOfPalindrome("Tact Coa"));
        assertFalse(target.PermutationOfPalindrome("palindrome"));
        assertFalse(target.PermutationOfPalindrome("emordwe"));
    }
}