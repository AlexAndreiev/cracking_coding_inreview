package com.alex.andreiev.ArraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMaxtrix_1_8Test {

    @Test
    void setZeros() {
        var target = new ZeroMaxtrix_1_8();
        var matrix = new int[][] {
                {1, 2, 3, 4},
                {4, 0, 2, 1},
                {0, 1, 1, 1}
        };
        target.setZeros(matrix);
        assertArrayEquals(new int[] {0, 0, 3, 4}, matrix[0]);
        assertArrayEquals(new int[] {0, 0, 0, 0}, matrix[1]);
        assertArrayEquals(new int[] {0, 0, 0, 0}, matrix[2]);
    }
}