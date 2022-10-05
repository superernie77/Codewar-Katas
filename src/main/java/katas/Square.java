package katas;

public class Square {

	public static final String generateShape(int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result += "+";
			}
			if (i != n-1) {
				result += "\n";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		  
		  System.out.println(generateShape(3));
	  }


}
