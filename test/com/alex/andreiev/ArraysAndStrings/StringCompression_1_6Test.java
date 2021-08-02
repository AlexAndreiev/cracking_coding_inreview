package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompression_1_6Test {

    @Test
    void compress() {
        var target = new StringCompression_1_6();
        assertEquals("a2b1c5a3", target.compress("aabcccccaaa"));
        assertEquals("aabc", target.compress("aabc"));
    }
}