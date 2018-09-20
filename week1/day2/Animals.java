package week1.day2;
import java.util.Scanner;

public class Animals{
	
	public void getAnimalDeails(){
		// Declare Animal parameters
		String kingdom;
		String classOfAnimal
		String familyName;
		String commonName;
		String scientificName;
		Scanner sc = new Scanner(System.in);
		int countAnimal = 0;
		char continueCheck = 'Y';
		do
		{
			//Get Animal Details from the user
			System.out.println("Enter the Animals Kingdome");
			kingdom = sc.nextLine();
			System.out.println("Enter the Animals Class");
			classOfAnimal = sc.nextLine();
			System.out.println("Enter the Animals Family Name");
			familyName = sc.nextLine();
			System.out.println("Enter the Animals Common Name");
			commonName = sc.nextLine();
			System.out.println("Enter the Animals Scientific name");
			scientificName = sc.nextLine();
			//Increment the count of animal details entered
			countAnimal++;
			System.out.println("No Of Animals created " + countAnimal);
			AnimalCatogory objAnim = new AnimalCatogory(kingdom,classOfAnimal,familyName,commonName,scientificName); 
			objAnim.displayAnimals();
			// Get the users choice to continue
			System.out.println("Wnat to enter another entry ? (Y/N)");
			continueCheck = sc.next().charAt(0);
		}while(continueCheck == 'Y'); // Continues the loop if the user gives 'Y'
	}
	public static void main(String args[]){
		
		// Get Details
		getAnimalDeails();
	}
}