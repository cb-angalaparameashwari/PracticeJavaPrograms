package week1.day3.Tax;
import java.util.Scanner;

public class TaxCalculation{

public static double calculateTax(Employee emp){
  double taxAmount = 0;
           if(emp.gender == 'F')// If the Employee is Female
           {
            if(emp.salary < 500000) // Female employee with slaary below 500000
            {
              taxAmount = emp.salary*0.05;
              return taxAmount;
            }
            else                  // Female employee with slaary above 500000
            {
              taxAmount = emp.salary*0.1;
              return taxAmount;
            }
           }
            else // Male Emplyee Tax calculation
            {
              if(emp.salary < 500000)  //male employee with slaary below 500000
              {
                taxAmount = emp.salary*0.1;
                return taxAmount ;
              }
              else         //male employee with salary below 1000000
              {
                taxAmount = emp.salary*0.2;
                return taxAmount ;
              }
            }
  } 
}