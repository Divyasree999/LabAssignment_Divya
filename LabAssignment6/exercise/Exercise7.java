package exercise;
import java.util.*;
public class Exercise7 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 7, 1, 9, 9, 9 };
		int result = getSorted(numbers);
		System.out.println(result);
	}
    private static int getSorted(int[] numbers) {
		StringBuffer stringbuffer = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			stringbuffer.append(numbers[i]);
		}
		stringbuffer.reverse();
		String string = stringbuffer.toString();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			list.add(Integer.parseInt(string.valueOf(string.charAt(i))));
		}
	    Collections.sort(list);
		StringBuffer stringsuffer1 = new StringBuffer();
		for (Integer l : list) {
			stringsuffer1.append(l);
		}
		int result = Integer.parseInt(stringsuffer1.toString());
		return result;
	}
}
