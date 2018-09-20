package week1.day3.mammals;
import java.util.Scanner;

public class Bat extends Bird{
	private String locomotion;
	private String foodChain;
	
	//set locomotion
	public void setLocomotion(){
		
		locomotion = "Gliding";
	}

	//set food chain
	public void setfoodChain(){
		foodChain = "Carnivorous";
	}
	public void movement()
	{
		System.out.println("Bat is " + locomotion);
	}
}