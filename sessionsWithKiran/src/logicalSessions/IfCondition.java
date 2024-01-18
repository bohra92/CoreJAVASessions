package logicalSessions;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

//		int a = 2;
//		
//		if(a!=4) {
//			System.out.println("it will pass");
//		}
//		else { //dead code 
//			System.out.println("it will come in else anyways !!");
//		}

		// grade = {100: A+ , 90-100 : A , 80-90 : B+ , 70-80 : B }

//		int marks = 100;
//
//		if (marks >= 70 && marks < 80) {
//			System.out.println("grade is B");
//			if (marks >= 80 && marks < 90) {
//				System.out.println("grade is B+");
//				if(marks>=90 && marks <100) {
//					System.out.println("grade is A");
//				}
//				else System.out.println("grade is A+");
//
//			}
//		}

//		if(marks == 100) {
//			System.out.println("grade : A+");
//		}
//		else if(marks>=90 && marks<100) {
//			System.out.println("grade : A");
//			
//		}
//		else if(marks>=80 && marks<90) {
//			System.out.println("grade : B+");
//			
//		}
//		else {
//			System.out.println("grade : B");
//			
//		}

//		if(marks<80) {
//			System.out.println("grade:B");
//		}
//		else if(marks<90) {
//			System.out.println("grade:B+");
//		}
//		else if(marks<100) {
//			System.out.println("grade:A");
//		}
//		else System.out.println("grade:A+");
//		
//		

//		int marks = 91;
//
//		// switch case
//
//		switch (marks) {
//
//		case 100:
//			System.out.println("grade 100");
//			break;
//
//		case 90:
//			System.out.println("grade 90");
//			break;
//
//		case 80:
//			System.out.println("grade 80");
//			break;
//
//		case 70:
//			System.out.println("grade 70");
//			break;
//
//		default:
//			System.out.println("enter the correct value");
//
//		}
		
		Scanner sc = new Scanner(System.in);
		String character = sc.next();

		switch (character) {
		
				case "a":
					System.out.println("grade 100");
					break;
		
				case "e":
					System.out.println("grade 90");
					break;
		
				case "i":
					System.out.println("grade 80");
					break;
		
				case "o":
					System.out.println("grade 70");
					break;
		
				default:
					System.out.println("enter the correct value");
		
				}
	}

}

