package week1.day4.ServiceStations;
import java.util.Scanner;

public class ServiceStation{
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle("Car","White",5000);
		Customer customer = new Customer("AP","Madurai","Mob",vehicle);
		Invoice invoice = new Invoice();
		invoice.createInvoice(customer,"AAA");

		Vehicle vehicleEmp = new Vehicle("Car11","White1",50000);
		EmployeeCustomer empCustomer = new EmployeeCustomer("AP1","Madurai1","Mob1",vehicle,"13D101");
		Invoice invoiceEmp = new Invoice();
		invoiceEmp.createInvoice(empCustomer,"AAA");
	}
}