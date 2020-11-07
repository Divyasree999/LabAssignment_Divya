package exercise;

import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		Map<Integer, Integer> studentDetails = new HashMap<>();
		studentDetails.put(1521, 78);
		studentDetails.put(1522, 99);
		studentDetails.put(1523, 87);
		Map<Integer, String> medalDetails = getStudents(studentDetails);
		System.out.println(medalDetails);
	}

	private static Map<Integer, String> getStudents(Map<Integer, Integer> studentDetails) {
		Map<Integer, String> medalDetails = new HashMap<>();
		for (Map.Entry<Integer, Integer> entry : studentDetails.entrySet()) {
			if (entry.getValue() >= 90) {
				medalDetails.put(entry.getKey(), "Gold");
			} else if (entry.getValue() >= 80 && entry.getValue() < 90) {
				medalDetails.put(entry.getKey(), "Silver");
			} else if (entry.getValue() >= 70 && entry.getValue() < 80) {
				medalDetails.put(entry.getKey(), "Bronze");
			}
		}
		return medalDetails;
	}
}
