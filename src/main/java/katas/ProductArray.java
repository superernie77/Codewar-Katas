package katas;

public class ProductArray {
	
	public static long[] productArray(int[] numbers) {
		long[] result = new long[numbers.length];
		for (int i = 0 ; i < numbers.length; i++) {
			long number = 1;
			for (int j = 0 ; j < numbers.length ; j++) {
				if ( i != j) {
					number *= numbers[j];	
				}
			}
			result[i] = number;
		}
		return result;
    }
	
	public static void main(String[] args) {
		
	}

}
