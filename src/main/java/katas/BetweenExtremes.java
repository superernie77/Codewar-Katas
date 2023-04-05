package katas;

import static java.util.Arrays.stream;



public class BetweenExtremes {

	public static int betweenExtremes(int[] numbers) {
		return stream(numbers).max().getAsInt() - stream(numbers).min().getAsInt();
	}

}
