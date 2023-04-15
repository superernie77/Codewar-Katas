package katas;


// Kata https://www.codewars.com/kata/58fec262184b6dc30800000d/train/java
import java.util.Arrays;

public class Tennis {
	
	public static int maximizePoints(int[] team1, int[] team2) {
		
	    Arrays.sort(team1);
	    Arrays.sort(team2);
	    
	    int counter = 0; 
	    for (int i = 0 ;i < team1.length ;  i++ ) {
	    	int player1 = team1[i];
	    	for (int y = 0 ; y < team2.length ; y++) {
	    		int player2 = team2[y];
	    		if ( player1 > player2) {
	    			counter++;
	    			team2[y] = 99999;
	    			break;
	    		}
	    	}
	    }
	    return counter;
	  }

}
