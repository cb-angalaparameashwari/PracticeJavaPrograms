package  week1.day1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MaxAndMinArray{
	public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
		// Get Array Size
		System.out.println("Enter the array Size");
		int arraySize = sc.nextInt();
        //Get Array Elements
        System.out.println("Enter Array Elements");
        int[] inputArray = new int[arraySize];
        for(int iterator= 0 ; iterator <arraySize ; iterator++)
        {
        	inputArray[iterator] = sc.nextInt();
        }
        findLargest(inputArray);
        findSmallest(inputArray);
    }
    // Find the largets element in the array
    public static void findLargest(int[] arr) 
    {
    	//sorting array
        Arrays.sort(arr); 
     //Display the largest element
    System.out.println("Largest value is " + arr[arr.length-1]);
    } 
    // Find the smallest element in the array.
    public static void findSmallest(int[] arr) 
    {
    	//Sorting the array
        Arrays.sort(arr); 
     //Display the smallest element
    System.out.println("Smallest value is " + arr[0]);
    } 
}
