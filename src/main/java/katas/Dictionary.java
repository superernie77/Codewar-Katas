package katas;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

	private Map<String, String> wordMap;

	public Dictionary() {
		wordMap = new HashMap<>();
	}

	public void newEntry(String key, String value) {
		wordMap.put(key, value);
	}

	public String look(String key) {
		if (wordMap.containsKey(key)) {
			return wordMap.get(key);
		} else {
			return "Cant find entry for " + key;
		}

	}
}
