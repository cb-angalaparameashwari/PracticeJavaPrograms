package week1.day3.Cars;
import java.util.Scanner;

public class Car{
	public int speed; 
	public double regularPrice; 
	public String color; 

	public Car(int speed, double regularPrice,String color)
	{
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	// return Sales price
	public double getSalePrice(){
			return 10000000;
	}
}