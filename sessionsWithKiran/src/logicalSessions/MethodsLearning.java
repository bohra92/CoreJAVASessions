package logicalSessions;

import java.lang.annotation.Retention;
import java.util.ArrayList;

import test.Test;

public class MethodsLearning {

	// functions / methods : methods are resuable entities which reduces efforts and
	// line of code , and they are data members of class

	int a = 90;

	public static void main(String args[]) {
		MethodsLearning ml = new MethodsLearning();
		String name1 = "Kiran";
		int yrs = 9;
//		String returnedValue = ml.printName(name1) + " Welcome!!";
//		System.out.println(returnedValue);

//		String returnedValue = ml.greetingEmail(name1, yrs);
//		System.out.println(returnedValue);
//		

		// problem A ,B ,C
		String companyName = "D";

		
		ArrayList<String> returnedList = ml.sendEmployees(companyName);
		System.out.println(returnedList);
		
		LearnngLoops l1 = ml.testingClass();
		System.out.println(l1.a);

	}

	public void test() {

		a = a + 10;
		System.out.println("Everything is OK");
		System.out.println("Everything is OK!!!!");
		return;

	}

	public String printName(String name)// parameter
	{
		// System.out.println("Hello!!! "+name);
		return ("Hello!! " + name);

	}

	public String greetingEmail(String 
			name, int yrsOfExp)// parameter
	{
		return ("Hello!! " + name + " Congratulations!!! on completing " + yrsOfExp + " yrs :)");

	}

	public int add(int a, int b) {

		return a + b;
	}
	
	public LearnngLoops testingClass() {
		
		LearnngLoops ll = new LearnngLoops();
		return ll;

	}

	public ArrayList<String> sendEmployees(String companyName) {
		ArrayList<String> empsOfA = new ArrayList<String>();
		ArrayList<String> empsOfB = new ArrayList<String>();
		ArrayList<String> empsOfC = new ArrayList<String>();

		empsOfA.add("Nitesh");
		empsOfA.add("Ramesh");
		empsOfA.add("Suresh");

		empsOfB.add("Amit");
		empsOfB.add("Sumit");
		empsOfB.add("Santosh");

		empsOfC.add("Abhay");
		empsOfC.add("Sunny");
		empsOfC.add("Bobby");

		switch (companyName) {

		case "A":
			return empsOfA;

		case "B":
			return empsOfB;

		case "C":
			return empsOfC;

		default:
			System.out.println("Wrong Input !!");

		}
		return null;

	}

	// void : no input and no return
	// void : some input but no return
	// void : inputs an return
	// string : inputs an return
	// int :

}
