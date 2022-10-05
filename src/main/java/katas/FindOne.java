package katas;

import java.util.Arrays;

public class FindOne {
	
	 public static boolean check(Object[] a, Object x) {
	      return Arrays.stream(a).anyMatch( s -> s.equals(x));
	    }

}
