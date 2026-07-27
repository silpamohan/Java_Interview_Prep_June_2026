package com.coding.Java_Interview_Prep_June_2026.code.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//Store and print student names
//	Find duplicates using ArrayList
//Sort an ArrayList
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class student {
    public static void main(String[] args) {
        List<String> student = new ArrayList<String>();
        student.add("silpa");
        student.add("silpa1");
        student.add("silpa2");
        student.add("silpa3"); 
        student.add("silpa3"); 
        Collections.sort(student);
        List<String> duplicates = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        for(String std:student){
            if(!seen.add(std))
            {
                duplicates.add(std);
            }

        }
        System.out.println(duplicates);

     }
}
    

