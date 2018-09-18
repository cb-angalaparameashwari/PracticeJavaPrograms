package week1.day1;
public class MathUtilsPow{
	public static void main(String args[]){
		int baseValue = 4;  //Intialize the base value
		int maxResult = 60; //Intialize the max result value
		findMinPower(baseValue,maxResult);
	}

	public static void findMinPower(int baseValue,int maxResult)
	{
		double maxPower = Double.MIN_VALUE; // initialize maxPower with Min Value
		if(baseValue == 0)
		{
			System.out.println("Result is always 1 since the base value is 0"); // Display the result when base value is 0
		}
		else
		for(int iterator_MinPower= 0 ; ; iterator_MinPower++)
		{
			 maxPower = Math.pow(baseValue,iterator_MinPower); // Fine Power
			 if(maxPower > maxResult)  // Compare the actual result with the expected Max Value
			 {
			 	System.out.println("Maximum power value is " + iterator_MinPower);  // Display the min Power
				break;
			 }
		}
	}
}