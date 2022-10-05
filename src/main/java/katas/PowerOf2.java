package katas;


public class PowerOf2 {
	
	public static long[] powersOfTwo(int n){
		long[] result = new long[n+1];
		for (int i = 0 ; i <= n ; i++) {
			result[i] = (long)Math.pow(2, i);
		}
	  return result;
	  }
	
	
	
	
	public static void main(String args[]) {
		System.out.println(powersOfTwo(4).toString());
		
	}

}
