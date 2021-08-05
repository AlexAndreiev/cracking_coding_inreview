package com.alex.andreiev.ArraysAndStrings;

/*
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
write a method to rotate the image by 90 degrees. Can you do this in place?

Hints:
    #51 - Try thinking about it layer by layer. Can you rotate a specific layer?
    #100 - Rotating a specific layer would just mean swapping the values in four arrays. If you were
        asked to swap the values in two arrays, could you do this? Can you then extend it to four arrays?

*/
public class RotateMatrix_1_7 {
    boolean rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) return false;

        /*
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                //left -> top
                matrix[first][i] = matrix[last-offset][first];

                //bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];

                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top; //right <- saved top
            }
        }
        return true;
    }
}
