package com.alex.andreiev.ArraysAndStrings;

import java.lang.invoke.CallSite;

/*
Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
Hints:
    #106 - You do not have to-and should not-generate all permutations. This would be very inefficient.
    #121 - What characteristics would a string that is a permutation of a palindrome have?
    #134 - Have you tried a hash table? You should be able to get this down to 0( N) time
    #136 - Can you reduce the space usage by using a bit vector?
*/
public class PalindromePermutation1_3 {
    public boolean PermutationOfPalindrome(String phrase) {
        /* Approach 1
         * Time complexity - O(n)
         * Space complexity - O(1)
         * */
        /*
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
        */

        /* Approach 2
         *  Time complexity - O(n)
         *  Space complexity - O(1)
         * */
/*
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1)
                    countOdd++;
                else
                    countOdd--;
            }
        }
        return countOdd <= 1;
*/
        /* Approach 3
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */
        int bitVector = createBitVector(phrase);
        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

//    // Check that no more that one character has an odd count
//    boolean checkMaxOneOdd(int[] table) {
//        boolean foundOdd = false;
//        for (int count : table) {
//            // more that two odds means it's not a palindrome
//            if (count % 2 == 1) {
//                if (foundOdd) {
//                    return false;
//                }
//                foundOdd = true;
//            }
//        }
//        return true;
//    }
//
    // Map each character to a number. a->0, b->1, c->2, etc
    // This is case insensitive. Non-letter characters map to -1
    int getCharNumber(Character ch) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(ch);
        if (a <= val && val <= z)
            return val - a;
        return  -1;
    }

//    // Count how many times each character appears.
//    int[] buildCharFrequencyTable(String phrase) {
//        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
//        for (char c: phrase.toCharArray()) {
//            int x = getCharNumber(c);
//            if (x != -1)
//                table[x]++;
//        }
//        return table;
//    }
    // Create a bit vector for the string. For each letter with value i, toggle the ith bit
    int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    // Toggle the ith bit in the integer.
    int toggle(int bitVector, int index) {
        if (index < 0) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0)
            bitVector |= mask;
        else
            bitVector &= ~mask;
        return bitVector;
    }

/*
    Check that exactly one bit is set by subtracting one from the integer and ANDing it with the original integer.
    00101000-1 = 00100111
    00101000 & 00100111 != 0

    00010000 - 1 = 00001111
    00010000 & 00001111 = 0
*/
    boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }
}
