package katas;

public class XAndOhs {
	
	
	 public static boolean getXO (String str) {
		 int x = 0;
		 int o = 0;
		 str = str.toLowerCase();
		 for(int i = 0; i < str.length(); i++) {
			 String sub = str.substring(i, i+1);
			 if (sub.equals("o")) o++;
			 if (sub.equals("x")) x++;
		 }
		 return x == o;
	}

	public static void main(String[] args) {
		System.out.println(getXO(""));

	}

}
