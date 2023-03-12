package katas;

public class HumanReadableTime {

	public static String makeReadable(int seconds) {
		int hours = seconds / 3600;
		int minutes = (seconds- (hours * 3600)) /60;
		int sec = (seconds- (hours * 3600) - minutes * 60);
		
		return String.format("%02d:%02d:%02d",hours,minutes,sec);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(HumanReadableTime.makeReadable(0));
		System.out.println(HumanReadableTime.makeReadable(5));
		System.out.println(HumanReadableTime.makeReadable(60));
		System.out.println(HumanReadableTime.makeReadable(86399));
		System.out.println(HumanReadableTime.makeReadable(359999));
		
	}

}
