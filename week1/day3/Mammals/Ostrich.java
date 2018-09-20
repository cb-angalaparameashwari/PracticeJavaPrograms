package week1.day3.mammals;
import java.util.Scanner;

public class Ostrich extends Bird{
	private String locomotion;
	private String foodChain;

	//set locomotion
	public void setLocomotion(){
		
		locomotion = "Walking and running";
	}

	//set food chain
	public void setfoodChain(){
		foodChain = "Carnivorous";
	}
	public void movement()
	{
		System.out.println("Ostrich is" + locomotion);
	}
}