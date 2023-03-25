package katas;
// https://www.codewars.com/kata/61fef3a2d8fa98021d38c4e5
public class CardGame {

	 public static long cardGame(long n) {
		 long alice = 0;
		 boolean aliceTurn = true;
		 while (n != 0) {
			 if (aliceTurn) {
				 aliceTurn = false;
				 if (even(n) && (!even(n/2) || n/2==2)) {
					 alice += (int)(n/2);
					 n = n/2;
				 } else {
					 alice++;
					 n = n-1;
				 }	 
			 } else {
				 aliceTurn = true;
				 if (even(n)) {
					 n = n/2;
				 } else {
					 n = n-1;
				 }	 
			 }	 
		 }
		 return alice;  
	 }
	 
	 private static boolean even(long n) {
		 if (n%2 == 1) return false;
		 return true;
	 }
	
	
}
