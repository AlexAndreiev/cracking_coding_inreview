package com.alex.andreiev.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.*;

class IsUnique1_1Test {

    @org.junit.jupiter.api.Test
    void isUnique() {
        var target = new IsUnique1_1();
        assertTrue(target.isUnique(""));
        assertTrue(target.isUnique("qwerty"));
        assertFalse(target.isUnique("qwerrty"));
    }
}