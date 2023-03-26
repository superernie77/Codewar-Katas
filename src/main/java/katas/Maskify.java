package katas;

public class Maskify {
	
	public static String maskify(String str) {
		if (str.length() <= 4) return str;
		StringBuilder sb = new StringBuilder();
		while (sb.length() < str.length() - 4) {
		        sb.append('#');
		}
		sb.append(str.substring(str.length()-4, str.length()));
		return sb.toString();
    }

}
