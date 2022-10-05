package katas;

import java.util.Arrays;

public class SumArray {

	 public static int grow(int[] x){
		   return Arrays.stream(x).reduce( (z , y) -> {return z*y;}).orElseGet( () -> 0);
	 }
	
	public static void main(String[] args) {
		System.out.println(grow(new int[] {1,2,3,4,5,6}));

	}

}
