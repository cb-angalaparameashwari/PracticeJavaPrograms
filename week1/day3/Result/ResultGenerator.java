package week1.day3.Result;

public class ResultGenerator{
	public static void generateResults(Student student){
		float total = student.subjects.marks1 + student.subjects.marks2 + student.subjects.marks3;
		float average = total/3;

		System.out.println("Student name"+ student.studentName);
		System.out.println("Total marks"+ total);
		System.out.println("Total marks"+ average);
	}
}