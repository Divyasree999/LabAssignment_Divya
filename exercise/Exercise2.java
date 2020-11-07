package exercise;

import java.util.*;
import java.util.Map.Entry;

public class Exercise2 {
	public static void main(String[] args) {
		/**
		 * creating character array for storing character values in it
		 */
		char[] characters = { 'f', 'h', 'e', 'g', 'g', 'a' };

		Map<Character, Integer> countCharacters = countChars(characters);
		/*
		 * displaying the hashMap
		 */
		System.out.println(countCharacters);
	}

	private static Map<Character, Integer> countChars(char[] characters) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < characters.length; i++) {
			/**
			 * declaring count variable to keep count of repeated characters
			 */
			int count = 0;

			for (int j = 0; j < characters.length; j++) {
				/**
				 * if both the character are equal increment the count
				 */
				if (characters[i] == characters[j]) {
					count++;
				}
			}

			if (!(map.containsKey(characters[i]))) {

				map.put(characters[i], count);

			}
		}
		return map;
	}
}
