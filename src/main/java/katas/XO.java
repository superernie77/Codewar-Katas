package katas;

public class XO {

	public static boolean getXO(String str) {
		return  str.replace("X", "").replace("x", "").length() == str.replace("O", "").replace("o", "").length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
