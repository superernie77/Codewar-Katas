package katas;

import java.util.Arrays;

public class Tortoise {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Tortoise.race(80, 100, 40)));

	}
	
	 public static int[] race(int v1, int v2, int g) {
	      // speed in feet per second  
	      double v1s = ((double)v1) / 3600;
	      double v2s = ((double)v2) / 3600;
	      
	      // time to reach first turtle 
	      double t = g / (v2s-v1s);
	      
	      double seconds = t % 60;
	      double minutes = (t-seconds) % 3600 / 60;
	      double hours = (t-(seconds+minutes*60))/3600 ;
	      
	      return new int[] {(int)hours, (int)minutes, (int)Math.round(seconds)};
	}

}
