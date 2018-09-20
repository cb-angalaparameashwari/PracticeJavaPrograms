package week1.day2;
import java.util.Scanner;

public class Author{
		private String authorName;
		private String authorEmail;
		private char authorGender;
	
	public Author (String authorName, String authorEmail, char authorGender){
		this.authorName = authorName;
		this.authorEmail = authorEmail;
		this.authorGender = authorGender;
	}
	public String getName(){
		return authorName;
	}
	public String getEmail(){
		return authorEmail;
	}
	//set new email id
	public void setEmail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Email id");
		authorEmail = sc.next();
	}
	// get gender
	public char getGender(){
		return authorGender;
	}
	// Display the details
	public String toDisplay(){
		return (authorName+" " +authorGender + " " + authorEmail);
	}
	public static void main(String args[]){
		Author objAuthor = new Author ("AP","ap@gmail.com",'F');
		System.out.println(objAuthor.toDisplay());
		objAuthor.setEmail();
		System.out.println(objAuthor.toDisplay());
		System.out.println("Author name and mail id :" + objAuthor.getName() + objAuthor.getEmail());

	}

}