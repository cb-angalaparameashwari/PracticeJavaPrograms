package week1.day2;
import java.util.Scanner;
import java.util.ArrayList;

public class Book{
		String bookName;
		static ArrayList<String> authorNames = new ArrayList<String>();
		double bookPrice;
		int qtyInStock = 0 ;

	public Book (String bookName, ArrayList<String> authorNames,double bookPrice, int qtyInStock){
		this.bookName = bookName;
		this.authorNames = authorNames;
		this.bookPrice = bookPrice;
		this.qtyInStock = qtyInStock;
	}
	
	//get Book Name
	public String getName(){
		return bookName;
	}
	//Get Author Name
	public ArrayList<String> getAuthorName(){
		return authorNames;
	}
	//set price
	public void setPrice(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price");
		bookPrice = sc.nextDouble();
	}
	//set Stock Qty
	public void setQTY(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Qty");
		qtyInStock = sc.nextInt();
	}
	//Display Author's name
	public void printAuthors(){
		System.out.println("Author Names");
		for(int iterator = 0 ; iterator < authorNames.size(); iterator++)
		{
			System.out.println(authorNames.get(iterator));
		}
	}
	// Display the details
	public void toDisplay(){
		System.out.print(bookName + "  by " );
		for(int iterator = 0 ; iterator < authorNames.size(); iterator++)
		System.out.print(authorNames.get(iterator) + "  , ");
	}

	public static void main(String args[]){
		authorNames.add("Rowling");
		authorNames.add("HP");
		Book objBook = new Book ("HP",authorNames,100,4);
		objBook.setPrice();
		objBook.setQTY();
		objBook.printAuthors();
		objBook.toDisplay();

	}
}