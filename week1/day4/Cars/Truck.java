package week1.day4.Cars;
import java.util.Scanner;

public class Truck extends Car{

	private int weight;

	public Truck(int speed, double regularPrice,String color, int weight){
 		super(speed,regularPrice,color);
 		this.weight = weight;
	}
	// return Sales price
	public double getSalePrice(){
			double acutalSalePrice = super.getSalePrice();
			double discount = 0 ;
			if(weight>2000) // Calculate sale price when weight is greater than 2000
			{
				discountAmount = acutalSalePrice*10/100;
				return (acutalSalePrice - discountAmount);
			}
			else          // calculate sale price when the weight is lesser than 2000
			{
				discountAmount = acutalSalePrice*20/100;
				return (acutalSalePrice - discountAmount);
			}
	}
}