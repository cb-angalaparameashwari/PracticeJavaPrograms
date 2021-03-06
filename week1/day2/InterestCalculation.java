package week1.day2;
import java.util.Scanner;
public class InterestCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Get Prinipal Amount
		System.out.println("Specify the Principal Amount");
		double principalAmount = sc.nextDouble();
		// Get rate of Interest
		System.out.println("Specify the rate of interest");
		double rateOfInterest = sc.nextDouble();
		// Get Period in years
		System.out.println("Specify the period in years");
		double noOfYears = sc.nextDouble();
		calculateSimpleInterest(principalAmount,rateOfInterest,noOfYears);
		calculateCompoundInterest(principalAmount,rateOfInterest,rateOfInterest);
	}
	
	//Calculate simple interest.

	public static void calculateSimpleInterest(double principalAmount,double rateOfInterest,double noOfYears){
		// Calculate simple interest
		double simpleInterest = (principalAmount*rateOfInterest*noOfYears)/100;
		// Display Simple Interest
		System.out.println("Simple Interest is : " + simpleInterest );
	}
	// calculate Compound interest
	public static void calculateCompoundInterest(double principalAmount,double rateOfInterest,double noOfYears){
		//Claculate compund Interest
		double compoundInterest = (principalAmount *
                    (Math.pow((1 + rateOfInterest / 100), noOfYears))) - principalAmount;
         //Display the compound interest
		System.out.println("Compound Interest is : " + compoundInterest );
	}
}