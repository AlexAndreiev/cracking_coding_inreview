package com.alex.andreiev.ArraysAndStrings;

/*
Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
   Hints:
    #17 - If you just cleared the rows and columns as you found Os, you'd likely wind up clearing
        the whole matrix. Try finding the cells with zeros first before making any changes to the matrix.
    #74 - Can you use O(N) additional space instead of O(N^2)? What information do you really need from
        the list of cells that are zero?
    #102 - You probably need some data storage to maintain a list of the rows and columns that need to be zeroed.
        Can you reduce the additional space usage to 0(1) by using the matrix itself for data storage?
*/
public class ZeroMaxtrix_1_8 {

    void setZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        var height = matrix.length;
        var width = matrix[0].length;

        /* Approach 1
         * Time complexity - O(N)
         * Spoce complexity - O(n+m) = O(n)
         * */
/*
        var rowsZeroed = new boolean[height];
        var columnsZeroed = new boolean[width];

        for (int i = 0; i < height; i++) {
            for (var j = 0; j < width; j++) {
                if (matrix[i][j] == 0) {
                    rowsZeroed[i] = true;
                    columnsZeroed[j] = true;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            if (rowsZeroed[i])
                matrix[i] = new int[width];
        }

        for (int i = 0; i < width; i++) {
            if (columnsZeroed[i]) {
                for (int j = 0; j < height; j++)
                    matrix[j][i] = 0;
            }
        }
*/

        /* Approach 2
         * Time complexity - O(N)
         * Spoce complexity - O(1) = O(1)
         * */

        var rowHasZero = false;
        var columnHasZero = false;
        // check if first row has a zero
        for (int i = 0; i < width; i++) {
            if (matrix[0][i] == 0) {
                rowHasZero = true;
                break;
            }
        }
        // check if first column has a zero
        for (int i = 0; i < height; i++) {
            if (matrix[i][0] == 0) {
                columnHasZero = true;
                break;
            }
        }

        for (int i = 1; i < height; i++) {
            for (var j = 1; j < width; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][i] = 0;
                    matrix[j][0] = 0;
                }
            }
        }

        for (int i = 1; i < height; i++) {
            if (matrix[i][0] == 0)
                matrix[i] = new int[width];
        }

        for (int i = 1; i < height; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < height; j++)
                    matrix[j][i] = 0;
            }
        }

        if (rowHasZero)
            matrix[0] = new int[width];

        if (columnHasZero) {
            for (int j = 0; j < height; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
