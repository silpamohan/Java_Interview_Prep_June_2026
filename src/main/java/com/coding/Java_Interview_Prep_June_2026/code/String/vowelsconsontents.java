package com.coding.Java_Interview_Prep_June_2026.code.String;

import java.util.Scanner;

public class vowelsconsontents {

    public static void main(String[] args) {
        int vc = 0;
        int con = 0;
        System.out.println("enter a string");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vc++;
            } else {
                con++;
            }
        }
        System.out.println("Count of vowels: " + vc);
        System.out.println("Count of consonents: " + con);
    }
}
