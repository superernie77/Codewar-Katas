package katas;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

	
	public static String reverseWords(String str){
		List<String> strings = Stream.of(str.split(" ")).collect(Collectors.toList());
		Collections.reverse(strings);
		return String.join(" ", strings);
	
	 }
	
	public static void main(String[] args) {
		System.out.println(reverseWords("I like eating"));

	}

}
