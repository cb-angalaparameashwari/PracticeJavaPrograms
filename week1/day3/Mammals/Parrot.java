package week1.day3.mammals;
import java.util.Scanner;

public class Parrot extends Bird{
	private String locomotion;
	private String foodChain;

	//set locomotion
	public void setLocomotion(){
		
		locomotion = "Flying";
	}

	//set food chain
	public void setfoodChain(){
		foodChain = "Herbivorous";
	}
	public void movement()
	{
		System.out.println("Parrot is " + locomotion);
	}
}