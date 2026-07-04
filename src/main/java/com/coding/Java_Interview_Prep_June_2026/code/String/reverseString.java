package com.coding.Java_Interview_Prep_June_2026.code.String;

import java.util.Scanner;

// Reverse string and palindrome checker

public class reverseString {

    public static void main(String[] args)
    {
       System.out.print("Enter the string: ");
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String rev = "";

       for (int i = 0; i < str.length(); i++) {
          rev = str.charAt(i) + rev;
       }

       int len = str.length();
       if (str.equals(rev)) {
          System.out.println(String.format("\"%s\" is a palindrome. Reversed: \"%s\" (length: %d)", str, rev, len));
       } else {
          System.out.println(String.format("\"%s\" is NOT a palindrome. Reversed: \"%s\" (length: %d)", str, rev, len));
       }

       sc.close();
    }

}
