package week1.day3;
import java.util.Scanner;

public class Seden extends Car{

	private int length;

	public Seden(int speed, double regularPrice,String color, int length){
 		super(speed,regularPrice,color);
 		this.length = length;
	}
	// return Sales price
	public double getSalePrice(){
			double acutalSalePrice = super.getSalePrice();
			double discountAmount = 0 ;
			if(length>20) // Calculate sale price when length is greater than 20
			{
				discountAmount = acutalSalePrice*5/100;
				return (acutalSalePrice - discountAmount);
			}
			else          // calculate sale price when the length is lesser than 20
			{
				discountAmount = acutalSalePrice*10/100;
				return (acutalSalePrice - discountAmount);
			}
	}
}