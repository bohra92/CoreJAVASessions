package logicalSessions;

public class Employee {

	//class variable
	//class :  class is template/blueprint of an object
	//object : object is a physical entity which defines a class
	
	String empId ;
	int exp ;
	int age ;
	String name;
	final static String CEO = "Naresh";
	
	public static void main(String[] args) {
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.name = "Kiran";
		emp1.age = 32;
		emp1.exp = 10;
		emp1.empId = "M002";
		Employee.CEO = "Mahesh";
		
		emp2.name = "Kailash";
		emp2.age = 21;
		emp2.exp = 1;
		emp2.empId = "M010";
		
		emp3.name = "Tanuj";
		emp3.age = 31;
		emp3.exp = 9;
		emp3.empId = "M009";
		
		
		
//		System.out.println(emp1.name);
//		System.out.println(emp2.name);
//		System.out.println(emp3.name);
		
		System.out.println(emp1.name + " "+Employee.CEO);
		
	}

}
