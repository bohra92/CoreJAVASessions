package EncapsulationLearning;

//encapsulation : security reasons , hidding the unrequired info 
//creating class variable private 

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String dept;

	
	//CRUD = create , rerieve , update , delete
	public Employee() {
		
	}
	
	//POST
	public Employee(String name, int age, double salary, String dept) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	// getter and setters
	//GET
	public String getName() {
		return name;
	}

	//PUT /PATCH
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "] yes this is all we want";
	}
	

	// setting and getting the value ; getter and setters

}
