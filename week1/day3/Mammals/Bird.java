package week1.day3.mammals;
import java.util.Scanner;

public abstract class Bird{

	public String catogory = "Bird";
	public String name;
	public char gender;
	private Scanner sc = new Scanner(System.in);
	
	//get Name
	public String getName(){
		return name;
	}
	//set name
	public void setName(){
		System.out.println("Enter Bird Name");
		name = sc.next();
	}
	//get gender
	public char getGender(){
		return gender;
	}
	//set gender
	public void setGender(){
		System.out.println("Enter Bird gender");
		gender = sc.next().charAt(0);
	}

	abstract public void setLocomotion();
	abstract public void setfoodChain();
	abstract public void movement();

}

