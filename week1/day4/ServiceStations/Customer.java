package week1.day4.ServiceStations;
import java.util.Scanner;

public class Customer{
	public String name;
	public String address;
	public String contact;
	public Vehicle vehicle;
	public Customer(String name, String address, String contact, Vehicle vehicle){
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.vehicle = vehicle;
	}

}