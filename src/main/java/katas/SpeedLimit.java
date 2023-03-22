package katas;

import java.util.Arrays;

public class SpeedLimit {
	
	  public static int speedLimit(final int speed, final int[] signals) {
	       return Arrays.stream(signals).map( i -> speed-i).reduce( 0 , (fine, exceed) -> {
	    	   if (exceed >= 10 & exceed <= 19 ) fine += 100;
	    	   else if ( exceed >= 20 & exceed <= 29) fine += 250;
	    	   else if (exceed >= 30 ) fine += 500;
	    	   return fine;
	       });
	  }

}
