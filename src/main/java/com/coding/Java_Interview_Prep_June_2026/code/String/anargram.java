package com.coding.Java_Interview_Prep_June_2026.code.String;

import java.util.Arrays;


public class anargram {

    public static void main(String[] args)
    {
        anargram.findanargram("hi","ih");

    }
    

    public static void findanargram(String a, String b)
    {
        String na = a.replaceAll("\\s+", "").toLowerCase();
        String nb = b.replaceAll("\\s+", "").toLowerCase();

        if (na.length() != nb.length()) {
            System.out.println("not anagram");
            return;
        }

        char[] sa = na.toCharArray();
        char[] sb = nb.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(sb);

        if (Arrays.equals(sa, sb)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

    }
}
