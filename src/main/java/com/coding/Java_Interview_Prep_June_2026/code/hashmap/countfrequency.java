package com.coding.Java_Interview_Prep_June_2026.code.hashmap;

import java.util.HashMap;
//•	Count frequency of characters in string
public class countfrequency
{
public static void main(String[] args)
{
    String s = "abababaababab" ;
    HashMap<Character,Integer> count = new HashMap<>();
    int c =0;
    char[] s1 = s.toCharArray();
    for(int i =0;i<s.length();i++)
    {    char ch = s1[i];
        count.put(s1[i],count.getOrDefault(ch,0)+1);
    }
     
    System.out.println(count);
}   
}