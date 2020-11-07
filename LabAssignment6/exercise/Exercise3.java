package exercise;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int[] numbers = { 3, 6, 9, 1, 2 };
		Map<Integer, Integer> squareMap = getvalues(numbers);
		System.out.println(squareMap);
	}

	private static Map<Integer, Integer> getvalues(int[] numbers) {
		Map<Integer, Integer> squareMap = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			squareMap.put(number, (number * number));
		}
		return squareMap;
	}
}
