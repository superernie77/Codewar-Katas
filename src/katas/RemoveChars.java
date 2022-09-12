package katas;

public class RemoveChars {
	
	 public static String remove(String str) {
		 return str.length() > 1 ? str.substring(1, str.length()-1) : str;
	 }
	 
	 public static void main(String [] args) {
		 System.out.println(remove("eloquent"));
		 System.out.println(remove("abc"));
		 System.out.println(remove("ab"));
		 System.out.println(remove("a"));
	 }
	 

}
