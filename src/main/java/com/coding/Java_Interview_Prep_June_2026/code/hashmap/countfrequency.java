package com.coding.Java_Interview_Prep_June_2026.code.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Count frequency of characters in a string.
 *
 * Example:
 *   Input:  "abababaababab"
 *   Output: {a=9, b=5}
 *
 * Notes:
 * - This implementation is case-sensitive.
 * - Time complexity: O(n), n = length of the string.
 * - Space complexity: O(k), k = number of distinct characters.
 */
public class countfrequency {

    /**
     * Count character frequencies in the input string.
     * @param s input string
     * @return map of character -> frequency
     */
    public static Map<Character, Integer> countFrequency(String s) {
        Map<Character, Integer> count = new HashMap<>();
        if (s == null || s.isEmpty()) {
            return count;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abababaababab";
        Map<Character, Integer> result = countFrequency(s);
        System.out.println(result);
    }
}
