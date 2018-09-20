package week1.day3.Result;
import java.util.Scanner;

public class Subject{
	public String subject1; 
	public float marks1;	
	public String subject2;
	public float marks2; 
	public String subject3;
	public float marks3;
	//get subject one name
	public String getSubOne(){
		return subject1;
	}
	//set subject one 
	public void setSubOne(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 1 name");
		subject1 = sc.next();
	}
	//get subject two name
	public String getSubTwo(){
		return subject2;
	}
	//set subject two 
	public void setSubTwo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 2 name");
		subject2 = sc.next();
	}
	//get subject three name
	public String getSubThree(){
		return subject3;
	}
	//set subject three
	public void setSubThree(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 3 name");
		subject3 = sc.next();
	}
	//get subject one marks
	public float getSubOneMarks(){
		return marks1;
	}
	//set subject one marks
	public void setSubOneMark(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 1 marks");
		marks1 = sc.nextFloat();
	}
	//get subject two marks
	public float getSubTwoMarks(){
		return marks2;
	}
	//set subject two marks
	public void setSubTwoMark(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 2 marks");
		marks2 = sc.nextFloat();
	}
	//get subject three marks
	public float getSubThreeMarks(){
		return marks3;
	}
	//set subject one marks
	public void setSubThreeMark(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject 3 marks");
		marks3 = sc.nextFloat();
	}
}