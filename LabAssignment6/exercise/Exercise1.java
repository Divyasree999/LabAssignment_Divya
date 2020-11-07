package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "kaya");
		hashmap.put(2, "Riya");
		hashmap.put(3, "Priya");
		hashmap.put(4, "Maya");
		List<String> SortedList = new ArrayList<String>();
		SortedList = getValues(hashmap);
		System.out.println(SortedList);
	}

	private static List<String> getValues(HashMap<Integer, String> hashmap) {
		List<String> sortedList = new ArrayList<String>();
		for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
			sortedList.add(entry.getValue());
		}
		Collections.sort(sortedList);
		return sortedList;
	}
}
