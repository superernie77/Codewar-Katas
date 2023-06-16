package katas;

public class ConsonantValue {
	
	static String VOWELS = "aeiou";
	
	public static int solve(String s) {
		
		String stripped = s.replaceAll("(?i)[\\saeiou]", ",");
		
		String[] vovwels = stripped.split(",");
		
		int max = 0;
		for (String temp : vovwels) {
			int value = 0;
			for (char c : temp.toCharArray()) {
				value += charToNumber(c);
			}
			if (value > max) {
				max = value;
			}
		}
        return max;
    }
	
	public static int charToNumber(char c) {
		return ((int)c)-96;
	}

}
