package katas;

import java.util.stream.IntStream;

public class StringRepeat {
	
	 public static String repeatStr(final int repeat, final String string) {
		 	StringBuilder builder = new StringBuilder();
	        IntStream.range(0, repeat).forEach( i -> builder.append(string) );
	        return builder.toString();
	 }

}
