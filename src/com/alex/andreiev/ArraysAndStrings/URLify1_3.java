package com.alex.andreiev.ArraysAndStrings;

/*
Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)

EXAMPLE
Input: "Mr John Smith    ", 13
Output: "Mr%20John%20Smith"

Hints:
    #53 - It's often easiest to modify strings by going from the end of the string to the beginning.
    #118 - You might find you need to know the number of spaces. Can you just count them?
*/

public class URLify1_3 {

    /*
        Time complexity - O(n)
        Space complexity - O(1)
    */

    public void getUrl(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }

        int index = trueLength + (spaceCount * 2);
        if (trueLength < str.length)
            str[trueLength] = '\0'; // end array
        for (int i = trueLength - 1; i >= 0; i--){
            if (str[i] == ' ') {
                str[index -1] = '0';
                str[index -2] = '2';
                str[index -3] = '%';
                index -= 3;
            }
            else
            {
                str[index -1] = str[i];
                index--;
            }
        }
    }
}
