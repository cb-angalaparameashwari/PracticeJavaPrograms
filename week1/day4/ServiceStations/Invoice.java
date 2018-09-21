package week1.day4.ServiceStations;
import java.util.Scanner;

public class Invoice{
	private String employee_assigned;
	public static void createInvoice(Customer customer, String employee_assigned){
		System.out.println("Invoice:");
		System.out.println("Customer Name : " + customer.name);
		System.out.println("Vehicle Name : " + customer.vehicle.brand);
		System.out.println("Total Amount : " + customer.vehicle.service);
		System.out.println("Employee Assigned : " + employee_assigned);
	}
}