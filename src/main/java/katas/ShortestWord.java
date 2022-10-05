package katas;

import java.util.Arrays;

public class ShortestWord {
	
	 public static int findShort(String s) {
		 return Arrays.stream(s.split(" ")).mapToInt( v -> v.length()).min().getAsInt();
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
	 }

}
