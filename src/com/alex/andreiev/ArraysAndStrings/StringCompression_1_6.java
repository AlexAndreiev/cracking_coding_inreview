package com.alex.andreiev.ArraysAndStrings;

/*
String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

Hints:
    #92 - Do the easy thing first. Compress the string, then compare the lengths
    #110 - Be careful that you aren't repeatedly concatenating strings together. This can be very inefficient.
* */

public class StringCompression_1_6 {
    public String compress(String str) {
        if (str == null && str.length() == 0 ) return str;
        var finalLength = countCompression(str);
        if (str.length() <= finalLength) return str;

        int count = 0;
        var sb = new StringBuilder(finalLength);
        for (int i = 0; i < str.length(); i++){
            count++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return sb.toString();
    }

    private int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            // if next character is different than current, increase the length
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }
}
