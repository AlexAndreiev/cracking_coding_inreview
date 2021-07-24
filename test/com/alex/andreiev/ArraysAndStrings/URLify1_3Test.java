package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLify1_3Test {

    @Test
    void getUrl() {
        var target = new URLify1_3();
        var charString = "Mr John Smith    ".toCharArray();
        target.getUrl(charString, 13);
        assertArrayEquals("Mr%20John%20Smith".toCharArray(), charString);
    }
}