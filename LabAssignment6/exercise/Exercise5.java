package exercise;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		int[] numbers = { 41, 38, 7, 74, 89 };

		int result = getSecondSmallest(numbers);

		System.out.println(result);

	}

	private static int getSecondSmallest(int[] numbers) {
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			numberList.add(numbers[i]);
		}
		Collections.sort(numberList);
		return numberList.get(1);
	}

}
