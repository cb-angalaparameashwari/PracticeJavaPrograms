package week1.day1;
public class MathUtilsPow{
	public static void main(String args[]){
		int baseValue = 4;  //Intialize the base value
		int maxResult = 60; //Intialize the max result value
		findMinPower(baseValue,maxResult);
	}

	public static void findMinPower(int baseValue,int maxResult)
	{
		int iterator_MinPower = 0 ;
		double maxPower = Double.MIN_VALUE; // initialize maxPower with Min Value
		if(baseValue == 0)
		{
			System.out.println("Result is always 1 since the base value is 0"); // Display the result when base value is 0
		}
		else
		while(maxPower <= maxResult) 
		{
			 maxPower = Math.pow(baseValue,iterator_MinPower); // Find Power
			 iterator_MinPower++;
		}
		System.out.println("Maximum power value is " + iterator_MinPower);
	}
}