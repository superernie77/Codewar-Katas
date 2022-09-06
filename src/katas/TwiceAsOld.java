package katas;

public class TwiceAsOld {

	public static void main(String[] args) {
		System.out.println(TwiceAsOld(30, 0));
		System.out.println(TwiceAsOld(30, 7));
		System.out.println(TwiceAsOld(45, 30));

	}
	
	public static int TwiceAsOld(int dadYears, int sonYears){
	   return Math.abs(2*sonYears-dadYears); 
		  
	  }

}
