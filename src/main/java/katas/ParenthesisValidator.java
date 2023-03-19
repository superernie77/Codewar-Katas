package katas;

public class ParenthesisValidator {

	public static boolean validParentheses(String parenStr) {
		int parentCounter = 0;
		for (int i = 0; i < parenStr.length(); i++) {
			if (parenStr.substring(i, i + 1).equals("(")) {
				parentCounter++;
			} else {
				parentCounter--;
			}
			if (parentCounter < 0)
				return false;
		}
		return parentCounter == 0;
	}

}
