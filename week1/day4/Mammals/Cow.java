package week1.day4.mammals;
import java.util.Scanner;

public class Cow extends Animal{
	private String locomotion;
	private String foodChain;
	private Scanner sc = new Scanner(System.in);

	//set locomotion
	public void setLocomotion(){
		
		locomotion = "Walking and running";
	}

	//set food chain
	public void setfoodChain(){
		foodChain = "Herbivorors";
	}
	public void movement()
	{
		System.out.println("Cow is" + locomotion);
	}
}