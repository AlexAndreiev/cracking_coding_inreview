package com.alex.andreiev.ArraysAndStrings;

import java.awt.geom.Point2D;
import java.util.HashMap;

/*
One Away: There are three types of edits that can be performed on strings: insert a character,
        remove a character, or replace a character. Given two strings, write a function to check if they are
        one edit (or zero edits) away.
   Hints:
    #23 - Start with the easy thing. Can you check each of the conditions separately?
    #97 - What is the relationship between the "insert character" option and the "remove character" option?
        Do these need to be two separate checks?
    #130 - Can you do all three checks in a single pass?
*/
public class OneAway_1_5 {
    boolean isValid(String str1, String str2) {
/*
        Approach 1
        Time complexity - O(n)
        Space complexity - O(1)
*/
/*
        if (str1.length() == str2.length())
            return oneEditReplace(str1, str2);
        else if (str1.length() + 1 == str2.length())
            return oneEditInsert(str1, str2);
        else if (str1.length() - 1 == str2.length())
            return oneEditInsert(str2, str1);
        return false;
*/

        /*
        Approach 2
        Time complexity - O(n)
        Space complexity - O(1)
*/
        // length check
        if (Math.abs(str1.length() - str2.length()) > 1)
            return false;

        // get shorter and longer string
        String s1 = str1.length() < str2.length() ? str1 : str2;
        String s2 = str1.length() < str2.length() ? str2 : str1;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                // ensure that this is the first difference found
                if (foundDifference) return false;
                foundDifference = true;
                // on replace, move shorter pointer
                if (s1.length() == s2.length())
                    index1++;
            } else
                index1++;   // if matching, move shorter pointer

            index2++;   // always move pointer for longer string
        }
        return true;
    }

//    boolean oneEditReplace(String s1, String s2) {
//        boolean fondDifference = false;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                if (fondDifference)
//                    return false;
//                fondDifference = true;
//            }
//        }
//        return true;
//    }
//
//    // Check if you can insert a character into s1 to make s2
//    boolean oneEditInsert(String s1, String s2) {
//        int index1 = 0;
//        int index2 = 0;
//        while (index2 < s2.length() && index1 < s1.length()) {
//            if (s1.charAt(index1) != s2.charAt(index2)) {
//                if (index1 != index2)
//                    return false;
//                index2++;
//            } else {
//                index1++;
//                index2++;
//            }
//        }
//        return true;
//    }
}
