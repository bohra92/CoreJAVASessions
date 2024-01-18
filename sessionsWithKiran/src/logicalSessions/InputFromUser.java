package logicalSessions;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		//System.out.println("Tell me years of experience you have ");
		Scanner sc = new Scanner(System.in);
//		final int YEARSOFEXP = sc.nextInt();
//		System.out.println(YEARSOFEXP);
		
		System.out.println("Tell me about you");
		final String EMPLOYEEDETAILS = sc.nextLine();
		System.out.println(EMPLOYEEDETAILS);
		
	}

}//if ,if else , switch , while , do while , for , array , Collections (list , set , map),forEach , oops : classes object inheritance , interaface , abstraction , encapsulation 
