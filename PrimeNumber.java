package Javaprogram;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumber {

	public static void main(String[] args) {
// Create a method that with abcdsa find the all characters in the string and print them along with their count by using map

		String str = "abcdsa";
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
