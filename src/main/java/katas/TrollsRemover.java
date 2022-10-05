package katas;

public class TrollsRemover {
	
	  public static String disemvowel(String str) {
		  String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
		  for (String vowel : vowels) {
			  str = str.replaceAll(vowel, "");  
		  }
		  
		  return str;
	  }
	  
	  public static void main(String[] args) {
		  String result = TrollsRemover.disemvowel("This website is for losers LOL!");
		  
		  System.out.println(result);
	  }


}

