package katas;

public class SecureTester2 {
	
	public static boolean alphanumeric(String s){
	    return s != null ? s.matches("[0-9a-zA-Z]+") : false;
	  }
	
	public static void main(String[] args) {
		System.out.println(alphanumeric("aaaa "));
		
	}

}