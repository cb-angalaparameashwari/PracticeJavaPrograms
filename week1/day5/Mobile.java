package week1.day5;
import java.util.*;

public class Mobile{
	private String name;
	private int remainingCharge;
	static ArrayList<Mobile> mobileList = new ArrayList<Mobile>();
	Scanner sc = new Scanner(System.in);
	//interface for mobile details
	interface MobileDetailsInterface{
		public void listMobileRange();
		public void getAllMobilesAndCharge();
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

	public static void getMobilesInRange(ArrayList<Mobile> mob, int lowerRange , int higherRange){
	
		MobileDetailsInterface mobile = new MobileDetailsInterface(){

		//List All Mobiles and charges
		public void getAllMobilesAndCharge(){
		Iterator itr = mob.iterator(); 
  		Mobile listMob = new Mobile();
  		System.out.println("Below is the list of mobiles and remaining charges ");
        // checking the next element availabilty 
        while (itr.hasNext()) 
        { 
           listMob = (Mobile) itr.next();
           	System.out.println("Mobile Name : " + listMob.name + " and "+ " Charge : " + listMob.remainingCharge);
        } 
		}

		// list the mobile names in specified range.
		public void listMobileRange(){
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

	mobile.listMobileRange();
	mobile.getAllMobilesAndCharge();
}

	public static void main(String args[]){
		Mobile mobObj = new Mobile();
		mobObj.addName();
		mobObj.addremainingCharge();

		Mobile mobObj1 = new Mobile();
		mobObj1.addName();
		mobObj1.addremainingCharge();

		Mobile mobObj2 = new Mobile();
		mobObj2.addName();
		mobObj2.addremainingCharge();

		mobileList.add(mobObj);
		mobileList.add(mobObj1);
		mobileList.add(mobObj2);		
		getMobilesInRange(mobileList,40,60);
		
	}
}