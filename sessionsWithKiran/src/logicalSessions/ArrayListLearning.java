package logicalSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListLearning {

	public static void main(String[] args) {
		// Arraylist , interface : List
		ArrayList arrList = new ArrayList();

		// adding elements
		arrList.add(100);
		arrList.add(true);
		arrList.add(12.23);
		arrList.add('v');

		// size
		// System.out.println(arrList.size());

		// fetch
		// System.out.println(arrList.get(2));

		// initially virtual capacity = 10 , physical capacity = 0 ; vc = 10 - pc ; new
		// vc = curr. pc/2 ; vc = pc/2 = 15/2 = 7

		// arrList.size()s

		ArrayList<Integer> intElements = new ArrayList<Integer>();

		intElements.add(12);
		intElements.add(11);
		intElements.add(23);
		intElements.add(45);

		int arr[] = { 23, 21, 233, 34 };

		// System.out.println(Arrays.toString(arr));

		// System.out.println(intElements);

		ArrayList<String> strElements = new ArrayList<String>();

		strElements.add("Honda");
		strElements.add("TATA");
		strElements.add("Maruti");
		strElements.add("Hyundayi");
		strElements.add("MG");
		strElements.add("VOLVO");
		strElements.add("VOLVO");

		for (int i = 0; i < strElements.size(); i++) {
			if(strElements.get(i).equals("Maruti")) {
				strElements.remove(i);
				strElements.add(i,"NOTSAFE!!");
				break;
			}
			
		}
		
		System.out.println(strElements);

//		System.out.println(strElements);
//		
//		strElements.remove(2);
//		
//		System.out.println(strElements);
//		
//		strElements.add(0,"Lamborgini");
//		
//		System.out.println(strElements);
//		
//		ArrayList<String> arrAsList = new ArrayList<String>(Arrays.asList("hon","Tata","Maruti"));
//		
//		System.out.println(arrAsList);
//		
//		strElements.add(6,"Ferrari");
//		
//		strElements.add(7,"Ford");
//		
//		System.out.println(strElements);
//		
//		

		// sort using Collections

		// Collections.sort(strElements);
		// System.out.println(strElements);

		Arrays.sort(arr);
		// System.out.println(Arrays.toString(arr));

		// reverse
		Collections.reverse(strElements);
		// System.out.println(strElements);
		
		
	

	}

}
