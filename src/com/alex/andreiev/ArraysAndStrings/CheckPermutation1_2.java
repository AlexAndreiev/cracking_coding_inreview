package com.alex.andreiev.ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
Hints:
    #1 - Describe what it means for two strings to be permutations of each other. Now, look at
        that definition you provided. Can you check the strings against that definition?
    #84 - There is one solution that is 0( N log N) time. Another solution uses some space, but is O(N) time
    #122 - Could a hash table be useful?
    #131 - Two strings that are permutations should have the same characters, but in different
        orders. Can you make the orders the same?
*/

public class CheckPermutation1_2 {

    public boolean isPermutationStrings(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) return false;
        if (str1.length() != str2.length()) return false;

        /*
          Approach 1
          Time complexity - O(n log n)
          Space complexity- O(1)
        */
//        var str1Arr = str1.toCharArray();
//        Arrays.sort(str1Arr);
//        var str2Arr = str2.toCharArray();
//        Arrays.sort(str2Arr);
//        return Arrays.equals(str1Arr, str2Arr);

        /* Approach 1
            Time complexity - O(n)
            Space complexity - O(n)
        */
        var hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str1.length(); i++)
        {
            var ch = str1.charAt(i);
            var val = hashMap.getOrDefault(ch, 0);
            hashMap.put(ch, val + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            var ch = str2.charAt(i);
            var val = hashMap.getOrDefault(ch, 0);
            if (val == 0) return false;
            hashMap.put(ch, val - 1);
        }
        return true;
    }
}