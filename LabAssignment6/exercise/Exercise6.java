package exercise;

import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		Map<Integer, Integer> voterDetails = new HashMap<>();
		voterDetails.put(121, 68);
		voterDetails.put(122, 14);
		voterDetails.put(123, 10);
		voterDetails.put(124, 34);
		List<Integer> voterList = votersList(voterDetails);
		System.out.println(voterList);

	}

	private static List<Integer> votersList(Map<Integer, Integer> voterDetails) {
		List<Integer> voterList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : voterDetails.entrySet()) {
			if (entry.getValue() > 18) {
				voterList.add(entry.getKey());
			}
		}
		return voterList;
	}

}
