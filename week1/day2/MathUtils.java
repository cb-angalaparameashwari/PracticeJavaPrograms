package week1.day2;

public class MathUtils{
public static void main(String args[]){
	int x=4;  //Initialisation of x x
	int y = 5;  // Initialisation y
	int z = addNumbers(x,y);  
	System.out.println(z); // Display the result 
}
// Add two integers
public static int addNumbers(int x , int y){
	int z = x + y ; // Summing x and y
	return z;	
}
}