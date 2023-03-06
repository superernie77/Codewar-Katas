package katas;

public class AddBigNumbers {
	
	public static String add(String a, String b) {
		int diff = a.length() - b.length();
		diff = (diff < 0 ? -diff : diff);
		String pad = "";
		for (int i = 0 ; i < diff ; i++) { pad += "0";}
		if (a.length() < b.length()) {
			a = pad + a; 
		} else {
			b = pad + b;
		}
		int overflow = 0;
		String resultStr = "";
		for (int i = a.length(); i>0;i--) {
			Integer result = Integer.parseInt(Character.toString(a.charAt(i-1)))+Integer.parseInt(Character.toString(b.charAt(i-1)));
			result = result + overflow;
			if (result > 9){overflow = 1; result = result -10;} 
			else {overflow = 0;}
			resultStr = "" + result + resultStr; 
		}
		if (overflow == 1) {
			resultStr = "1"+ resultStr;
		}
		
		
		int j = 0;

		while (resultStr.charAt(j) == '0' && j < resultStr.length() - 1)
		    j++;

		
		return resultStr.substring(j);
	}
	
	
	public static void main(String[] args) {
		System.out.println(add("63829983432984289347293874","90938498237058927340892374089"));
	}
}
