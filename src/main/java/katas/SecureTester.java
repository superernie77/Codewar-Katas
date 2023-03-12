package katas;

public class SecureTester {

	public static void main(String[] args) {
		System.out.println(alphanumeric("abcfdAAA"));

	}
	
	 public static boolean alphanumeric(String s){
		 if (s != null && s.length() > 1) {
			 return s.matches("^[a-zA-Z0-9]*$");
		 }
		 return false;
	}
}
