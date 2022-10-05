package katas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
	
	 public static int[] squareOrSquareRoot(int[] array) {
		List<Integer> result = Arrays.stream(array).map( i -> { 
			if (Math.sqrt(i) % 1 == 0 ) {
				return (int)Math.sqrt(i); }
			else {
				return i*i;}
		}).boxed().collect(Collectors.toList());
		
	    return result.stream().mapToInt(i->i).toArray();
	  }

}
