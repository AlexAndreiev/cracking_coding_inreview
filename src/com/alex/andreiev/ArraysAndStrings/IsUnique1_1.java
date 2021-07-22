package com.alex.andreiev.ArraysAndStrings;

import java.util.HashSet;
/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

    Hints:
    #44     Try a hash table
    #117    Could a bit vector be useful?
    #132    Can you solve it in O(N log N) time? What might a solution like that look like?

 */

public class IsUnique1_1 {

    public boolean isUnique(String str) {
        /*
            Approach 1
            Time complexity - O(N) + O(N*1) + O(N*1) = O(N)
            Space complexity - O(N)
        */
//        var hashSet = new HashSet();
//        for (int i = 0; i < str.length(); i++) {
//            int val = str.charAt(i);
//            if (hashSet.contains(val))
//                return false;
//            hashSet.add(val);
//        }
//        return true;

        /*
            Approach 2
            Time complexity - O(n)
            Space complexity -O(1)
        */
//        var len = str.length();
//        if (len > 128) return false;
//        boolean[] arr = new boolean[128]; // 128-alphabet (ASCII)
//        for (int i = 0; i < str.length(); i++) {
//            int val = str.charAt(i);
//            if (arr[val]) return false;
//            arr[val] = true;
//        }
//        return true;

        /*
            Approach 3
            Time complexity - O(n)
            Space complexity -O(1)
        */
        // assume that string only uses the lowercase letters a through z.
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            // just move the bit and check if we already have it set
            if ((checker & (1 << val)) > 0)
                return false;
            checker = checker | (1 << val);
        }
        return true;
    }
}
