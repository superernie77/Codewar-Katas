package katas;

import java.util.HashMap;

public class Duplicates {

	public static void main(String[] args) {
		System.out.println(duplicateCount("aabbcde"));

	}

	public static int duplicateCount(String text) {
		text = text.toLowerCase();
		HashMap<String, Integer> letters = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			String letter = text.substring(i, i + 1);
			if (letters.containsKey(letter)) {
				letters.replace(letter, letters.get(letter) + 1);
			} else {
				letters.put(letter, 1);
			}
		}
		return (int)letters.values().stream().filter( x -> x != 1).count();
		
	}
}
