package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAway_1_5Test {

    @Test
    void isValid() {
        var target = new OneAway_1_5();
        assertTrue(target.isValid("pale", "ple"));
        assertTrue(target.isValid("pales", "pale"));
        assertTrue(target.isValid("pale", "bale"));
        assertFalse(target.isValid("pale", "bake"));
        assertFalse(target.isValid("pale", "pale111"));
    }
}