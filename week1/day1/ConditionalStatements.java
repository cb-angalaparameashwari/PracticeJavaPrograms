package week1.day1;
public class ConditionalStatements{
	public static void main(String args[]){
		whilePrintNumbers(); 
	}
	// While loop behaviours
	public static void whilePrintNumbers()
	{
		int iterator = 0; // Initializing iterator variable
		while(iterator<10) 
		{
			System.out.println(iterator++); // Display and increment iterator value
		}
	}
}