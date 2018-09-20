package week1.day3.Tax;
import java.util.Scanner;

public class EmpTax{
	public static void main(String[] args){
			Employee employee = new Employee();
			employee.getEmpName();
			employee.setEmpName();
			employee.getEmpGender();
			employee.setEmpGender();
			employee.getSalary();
			employee.setSalary();
			TaxCalculation tax = new TaxCalculation();
			
			System.out.println("tax to be paid " + tax.calculateTax(employee));
	}
}