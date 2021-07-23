package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutation1_2Test {

    @Test
    void isPermutationStrings() {
        var target = new CheckPermutation1_2();
        assertTrue(target.isPermutationStrings("qwerty", "ytrewq"));
        assertTrue(target.isPermutationStrings("qwerty", "rywteq"));
        assertFalse(target.isPermutationStrings("qweerty", "qwetryy"));
        assertFalse(target.isPermutationStrings("qwerty", "tr"));
        assertFalse(target.isPermutationStrings("qwerty", "sdgq"));
    }
}