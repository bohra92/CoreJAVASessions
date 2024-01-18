package EncapsulationLearning;

public class Test {

	public static void main(String[] args) {
//
//		Employee emp1 = new Employee("Satish",23,23000.00,"BFSI");
//		System.out.println(emp1);
//		System.out.println(emp1.getAge()+emp1.getDept()+emp1.getName()+emp1.getSalary());
//		emp1.setName("Satish");
//		System.out.println(emp1.getName());
		
		LoginPage lp = new LoginPage();
		lp.doLogin("Ramesh","password123",true);
		 
		
	}
	
	public void doSomething();
	
	
	
	

}
