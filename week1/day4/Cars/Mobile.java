package week1.day4.mobiles;
import java.util.Scanner;

public class Mobile{
	private String name;
	private int remainingCharge;
	ArrayList<Mobile> mobileList = new ArrayList<Mobile>();
	Scanner sc = new Scanner(System.in);
	//interface for mobile details
	interface MobileDetailsInterface(){
		public void listMobileRange(ArrayList<Mobile> mobileList, int lowerRange , int higherRange);
	}
	
	public void addName(){
			System.out.println("Enter the name of the mobile");
			this.name = sc.nextLine(); 
		}

	// add the remaining charge of the mobile
	public void addremainingCharge(){
		System.out.println("Enter the name of the charge");
		this.remainingCharge = sc.nextInt(); 
	}
	
	MobileDetails mobile = new MobileDetails() implements MobileDetailsInterface{
		
		public void listMobileRange(ArrayList<Mobile> mob, int lowerRange , int higherRange){
		Iterator itr = mob.iterator(); 
  		Mobile listMob = new Mobile();
  		System.out.println("Mobile phones with specified charges are : ");
        // checking the next element availabilty 
        while (itr.hasNext()) 
        { 
           listMob = (Mobile) itr.next();

           if(listMob.remainingCharge >= lowerRange && listMob.remainingCharge <= higherRange)
           	System.out.println(listMob.name);
        } 
		}
	};

	public static void main(String args[]){
		Mobile mobObj = new Mobile();
		mobObj.addName();
		mobObj.addremainingCharge();
	}
}