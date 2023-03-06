package katas;

import java.util.Arrays;

public class Tortoise2 {
	
	 public static int[] race(int v1, int v2, int g) {
	        if (v1 >= v2) return null;
	        double t = g/(v2/3600d-v1/3600d);
	        double seconds = (int)t % 60;
		    double minutes = (int)((t%3600)/60);
		    int hours = (int)t/3600 ;
		      
	        return new int[] {(int)hours,(int)minutes,(int)seconds};
	 }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(race(720, 850, 70)));
		System.out.println(Arrays.toString(race(80, 91, 37)));
		System.out.println(Arrays.toString(race(80, 100, 40)));

	}

}
