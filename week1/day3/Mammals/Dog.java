package week1.day3.mammals;
import java.util.Scanner;

public class Dog extends Animal{
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
		System.out.println("Dog is " + locomotion);
	}
}