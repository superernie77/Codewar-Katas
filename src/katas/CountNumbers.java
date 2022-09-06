package katas;


public class CountNumbers {
	
	public static int oddCount(int n){
		//return IntStream.range(0, n).reduce(0, (x,y ) -> y%2 > 0 ? ++x : x );
		return (n-1)/2 + (n-1)%2;
	}
	
	public static void main(String[] args) {
		System.out.println(oddCount(1));
		System.out.println(oddCount(2));
		System.out.println(oddCount(3));
		System.out.println(oddCount(4));
		System.out.println(oddCount(5));
		System.out.println(oddCount(6));
		System.out.println(oddCount(7));
	}

}

