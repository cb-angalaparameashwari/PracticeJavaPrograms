package week1.day3.Tax;

import java.util.Scanner;
public class Employee{
	public String empName;
	public char gender;
	public double salary;
	private Scanner sc = new Scanner(System.in);

	//get Employee name
	public String getEmpName(){
		return empName;
	}
	//set Employee name
	public void setEmpName(){
		System.out.println("Enter Emp Name");
		empName = sc.next();
	}
	// get Employee Gender
	public char getEmpGender(){
		return gender;
	}
	//set Employee gender
	public void setEmpGender(){
		System.out.println("Enter Emp Gender");
		gender = sc.next().charAt(0);
	}
	// get Taxable Amount
	public double getSalary(){
		return salary;
	}
	//set Employee gender
	public void setSalary(){
		System.out.println("Enter Emp Amount");
		salary = sc.nextDouble();
	}
}