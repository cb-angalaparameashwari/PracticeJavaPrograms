package week1.day5;
import java.util.*;

public class MathUtil{
	private int lowerLimit;
	private int upperLimit;
	private ArrayList<Integer> factorials = new ArrayList<Integer>();

	public MathUtil(int lowerLimit, int upperLimit){
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

  // to convert object into a String
   public String toString(){
   	String result = "";
            for(int i = 0 ; i < factorials.size() ; i++)
            		result = result + factorials.get(i) + ",";
            	return result;
   }

   static class Factorial {

    // compute factorial for all the given input
   	public void calculateFactorialforAll(MathUtil f){
   		for(int facts = f.lowerLimit ; facts <= f.upperLimit ; facts++)
   		{
   			f.factorials.add(calculateFactorial(facts));
   		}

   }

   // calculate factorial recursively
  	public int calculateFactorial(int n){    
  		if (n == 0)    
   			 return 1;    
  		else    
    		return(n * calculateFactorial(n-1));    
 	}     
}
   public static void main(String[] args){
   		MathUtil f = new MathUtil(2,7);
   		MathUtil.Factorial mf = new MathUtil.Factorial();
   		mf.calculateFactorialforAll(f);
   		System.out.println(f.toString());
   }

}