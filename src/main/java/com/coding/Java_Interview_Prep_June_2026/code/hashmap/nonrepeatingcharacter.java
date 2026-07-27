package com.coding.Java_Interview_Prep_June_2026.code.hashmap;

import java.util.Map;
import java.util.TreeMap;

// First non-repeating character
public class nonrepeatingcharacter {

	public static void nonreapeating(String s) {
		TreeMap<Character, Integer> treemap = new TreeMap<>();
		char[] c = s.toCharArray();
		// treemap.get
		for (int i = 0; i < c.length; i++) {
			char c1 = c[i];
			treemap.put(c1, treemap.getOrDefault(c1, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : treemap.entrySet()) {
			System.out.println(entry);
		}

		for (char c1 : s.toCharArray()) {
			if (treemap.get(c1) == 1) {
				System.out.println(c1);
				return;
			}
		}

		System.out.println("No non-repeating characters");
	}

	public static void main(String[] args) {
		nonrepeatingcharacter.nonreapeating("ananpan");
	}
}
