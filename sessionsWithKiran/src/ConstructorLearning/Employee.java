package ConstructorLearning;

public class Employee {

	String empId;
	int exp;
	int age;
	String name;

	// contructor
	// used for initialization
	// after declaring class variable
	// same name as class
	// no return not even void
	// this operator : this belongs to class and its variable

	// default constructor
	public Employee() {
		System.out.println("Default Constructor is called");
	}

	// parameterised constructor
	public Employee(String id, String name, int exp, int age) {
		System.out.println("Parameterised Constructor is called");
		this.age = age;
		this.empId = id;
		this.exp = exp;
		this.name = name;

	}

	// parameterised constructor
	public Employee(String id, String name) {
		this();
		System.out.println("Parameterised Constructor with two fields  is called");
		this.empId = id;
		this.name = name;

	}

	public static void main(String[] args) {
		// Employee emp1 = new Employee();
//		Employee emp2 = new Employee("E001", "Amit", 3, 23);
//		System.out.println(emp2.age);
//		System.out.println(emp2.empId);
//		System.out.println(emp2.name);
//		System.out.println(emp2.exp);
		
		Employee e2= new Employee("id","name");

	}

}
