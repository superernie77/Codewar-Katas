package katas;

public class CarRental {
	
	 public static int rentalCarCost(int d) {
		    int amount = d * 40;
		    if (d > 6) return amount -50;
		    else if (d > 2) return amount -20;
		    return amount;
	}

}
