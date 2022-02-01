package BanquetHallPackage;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banquet banquet = new Banquet();

		// TOTAL BASE COST
		System.out.println("Enter base cost");
		banquet.baseCost = sc.nextDouble();
		System.out.println("Enter food cost");
		banquet.foodCost = sc.nextDouble();
		System.out.println("Enter beverage cost");
		banquet.beverageCost = sc.nextDouble();
		System.out.println("Enter the desired Tip amount");
		banquet.tip = sc.nextDouble();
		double setCalculateBaseCost = banquet.calculateBaseCost(banquet.baseCost, banquet.foodCost,
				banquet.beverageCost, banquet.tip);
		System.out.println("Total Base cost: " + setCalculateBaseCost);

		// TOTAL TAX ON BASE COST
		System.out.println("Enter total tax in decimal number, example 13% is 0.013: ");
		banquet.taxPercent = sc.nextDouble();
		double setTaxPercentage = banquet.calculatetax(banquet.taxPercent);
		System.out.println("Total cost after tax: " + setTaxPercentage);

		// TOTAL SERVICE CESS BASED ON NO. OF GUESTS
		System.out.println("Enter no. of guests present: ");
		banquet.noOfGuests = sc.nextDouble();
		double setNoOfGuests = banquet.calculateCess(banquet.noOfGuests, setCalculateBaseCost);
		System.out.println("Service cess based on no. of guests is: " + setNoOfGuests);

		double setTotalCost = banquet.calculateTheTotalCost(setCalculateBaseCost, setNoOfGuests, setTaxPercentage);
		System.out.println("Total Cost is: " + setTotalCost); 
		
		System.out.println("Have a nice day. Good luck paying ");
		
	}

}
