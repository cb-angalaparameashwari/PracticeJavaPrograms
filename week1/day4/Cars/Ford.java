package week1.day.Cars;
import java.util.Scanner;

public class Ford extends Car{

	private double manufacturerDiscount;
	private int year;

	public Ford(int speed, double regularPrice,String color, int year, double manufacturerDiscount){
 		super(speed,regularPrice,color);
 		this.year = year;
 		this.manufacturerDiscount = manufacturerDiscount;
	}
	// return Sales price
	public double getSalePrice(){
			double acutalSalePrice = super.getSalePrice();
			return (acutalSalePrice - manufacturerDiscount);
	}
}