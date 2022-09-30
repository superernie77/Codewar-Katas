package katas;

public class PigLatin {
	
	 public static String pigIt(String str) {
	        String[] words = str.split(" ");
	        
	        String result = "";
	        for (String s : words ) {
	        	if (s.matches(".*\\p{Punct}")) {
	        		result += s+" ";
	        	} else {
	        		result += s.substring(1)+s.substring(0,1)+"ay"+" ";	
	        	}
	        }
	        
	        return result.trim();
	    }
	 
	 public static void main(String[] args) {
		
		System.out.println( pigIt("Pig latin is ! cool"));
	}

}
