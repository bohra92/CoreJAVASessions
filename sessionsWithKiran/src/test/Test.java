package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
//		int x = 121;
//		int num = x;
//		int revNum = 0;
//		if (x < 0) {
//			System.out.println("negative");
//		}
//		while (x > 0) {
//			revNum = (revNum * 10) + (x % 10);
//			x /= 10;
//			System.out.print(revNum);
//
//		}
//		System.out.print(revNum);
//		System.out.println(revNum == num);

		String romanDigits = "MDLXX";
		java.util.HashMap<Character, Integer> romanToNumber = new HashMap<Character, Integer>();
		romanToNumber.put('I', 1);
		romanToNumber.put('V', 5);
		romanToNumber.put('X', 10);
		romanToNumber.put('L', 50);
		romanToNumber.put('C', 100);
		romanToNumber.put('D', 500);
		romanToNumber.put('M', 1000);

		int roundOff = 0;
		int sum = 0;

		for (int i = 0; i < romanDigits.length(); i++) {
			System.out.println("i=="+i+" "+romanDigits.charAt(i));
			System.out.println(romanDigits.length());
			System.out.println(sum);
			switch (romanDigits.charAt(i)) {
			case 'I':
				if ((i!=romanDigits.length()-1) && (romanDigits.charAt(i + 1) == 'V' || romanDigits.charAt(i + 1) == 'X')) {
					i++;
					sum += romanToNumber.get(romanDigits.charAt(i));
					roundOff += 1;
					break;
				} else {
					sum += romanToNumber.get(romanDigits.charAt(i));
					break;
				}

			case 'X':
				if ((i!=romanDigits.length()-1) && (romanDigits.charAt(i + 1) == 'L' || romanDigits.charAt(i + 1) == 'C')) {
					i++;
					sum += romanToNumber.get(romanDigits.charAt(i));
					roundOff += 10;
					break;
				} else {
					sum += romanToNumber.get(romanDigits.charAt(i));
					break;
				}

			case 'C':
				if ((i!=romanDigits.length()-1) && (romanDigits.charAt(i + 1) == 'D' || romanDigits.charAt(i + 1) == 'M')) {
					i++;
					sum += romanToNumber.get(romanDigits.charAt(i));
					roundOff += 100;
					break;
				} else {
					sum += romanToNumber.get(romanDigits.charAt(i));
					break;
				}

			default:
				sum += romanToNumber.get(romanDigits.charAt(i));
				break;
			}
		}
		System.out.println(sum-roundOff);
		int[] arr = {1,2,3};
		int[] arr1= {1,2,3};
		arr=arr1;
		System.out.println(Arrays.toString(arr));
		
		
		 FileReader fr;
		try {
			fr = new FileReader("D:\\testout.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();   
		

	}

}
