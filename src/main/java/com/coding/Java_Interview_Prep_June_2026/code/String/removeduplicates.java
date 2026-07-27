package com.coding.Java_Interview_Prep_June_2026.code.String;

import java.util.ArrayList;
import java.util.List;

public class removeduplicates {

    public static void main(String[] args) {
        String s = "silpli";
        List<Character> uniqueChars = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : uniqueChars) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
