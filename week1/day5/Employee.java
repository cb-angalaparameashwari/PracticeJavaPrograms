package week1.day5;
import java.util.*;

public class Employee{

	public String name;
	public double salary;
	public int age;
	public static ArrayList<Employee> empList = new ArrayList<Employee>();

	public Employee(String name, double salary, int age){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public void addToList(Employee emp){
		empList.add(emp);
	}

	public static Comparator sortData(){
		
		 Comparator<Employee> comp = new Comparator<Employee>(){

			@Override
			public int compare(Employee emp_1, Employee emp_2){
				return emp_1.name.compareTo(emp_2.name);
			}

		};

		return comp;
		
	}

	// private static class EmpComp implements Comparator{
	// 	@Override
	// 		public int compare(Employee emp_1, Employee emp_2){
	// 			return emp_1.name.compareTo(emp_2.name);
	// 		}
	// }
	
	public static void main(String args[]){
		Employee employee = new Employee("Ammu", 5000, 22);
		Employee employee1 = new Employee("CP", 50001, 21);
		Employee employee2 = new Employee("BP", 50001, 21);
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);

		Collections.sort(empList, sortData()); 
		
		for(int i = 0 ; i < empList.size() ; i++)	
		System.out.println(empList.get(i).name);	
	}
}
