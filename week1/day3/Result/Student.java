package week1.day3.Result;

import java.util.Scanner;
public class Student{
	public String studentId;
	public String studentName;
	public char gender;
	public Subject subjects; 

	//get Student id
	public String getStdentId(){
		return studentId;
	}
	//set new student id
	public void setStdentId(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		studentId = sc.next();
	}
	//get Student Name
	public String getStdentName(){
		return studentName;
	}
	//set new student id
	public void setStdentName(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name");
		studentName = sc.next();
	}
	//get Student gender
	public char getStdentGender(){
		return gender;
	}
	//set new student id
	public void setStdentGender(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Gender");
		gender = sc.nextLine().charAt(0);
	}
	//get 
	public Subject getSubjects(){
		return subjects;
	}
	//set new student id
	public void setSubjects(){
		Subject subjects = new Subject();
		subjects.setSubOne();
		subjects.setSubOneMark();
		subjects.setSubTwo();
		subjects.setSubTwoMark();
		subjects.setSubThree();
		subjects.setSubThreeMark();
		subjects.subject1 = subjects.getSubOne();
		subjects.marks1 = subjects.getSubOneMarks();
		subjects.subject2 = subjects.getSubTwo();
		subjects.marks2 = subjects.getSubTwoMarks();
		subjects.subject3 = subjects.getSubThree();
		subjects.marks3 = subjects.getSubThreeMarks();
	}

}