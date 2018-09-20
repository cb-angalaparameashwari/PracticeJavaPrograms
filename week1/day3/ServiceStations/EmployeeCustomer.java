package week1.day3.ServiceStations;
import java.util.Scanner;

public class EmployeeCustomer extends Customer{
	public String empId;
		public EmployeeCustomer(String name, String address, String contact, Vehicle vehicle,String empId){
		super(name,address,contact,vehicle);
		this.empId = empId;
	}

}