package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrix_1_7Test {

    @Test
    void rotate() {
        var target = new RotateMatrix_1_7();
        int[][] input = new int[][] {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] expected = new int[][] {
                {13, 9,  5, 1},
                {14, 10, 6, 2},
                {15, 11, 7, 3},
                {16, 12, 8, 4}
        };
//        int[][] expected = new int[][] {
//                {16, 14, 15, 13},
//                {12, 11, 10, 9},
//                {8,  7,  6 , 5},
//                {4,  3,  2,  1}
//        };

        assertTrue(target.rotate(input));
        for (int i = 0; i < expected.length; i++)
            assertArrayEquals(expected[i], input[i]);
    }
}