package week1.day3.Result;

public class StudentDemo{
	public static void storeStudentData(Student student){
		student.setStdentId();
		student.setStdentName();
		student.setStdentGender();
		student.setSubjects();
	}
	public static void main(String[] args){
		Student student = new Student();
		storeStudentData(student);
		ResultGenerator results = new ResultGenerator();
		results.generateResults(student);
	}
}
