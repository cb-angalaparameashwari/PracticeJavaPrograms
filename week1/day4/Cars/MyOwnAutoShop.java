package week1.day4.Cars;
import java.util.Scanner;

public class MyOwnAutoShop{
	public static void main(String[] args){

		//Saden Object
		Seden seden = new Seden(180,1200000,"White",25);
		System.out.println("Sedan's sale price "+ seden.getSalePrice());

		//Ford Object
		Ford ford = new Ford(190,2000000,"Black",2017,100000);
		
		System.out.println("Ford's sale price"+ ford.getSalePrice());

		//Car Object
		Car car = new Car(210, 100000, "Grey");

		System.out.println("Ford's sale price "+ car.getSalePrice());
	}

}