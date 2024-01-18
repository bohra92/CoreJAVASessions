package logicalSessions;

import java.util.Arrays;

public class ArraysLearning {

	public static void main(String[] args) {
		// arrays with new operator
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 45;
		arr[3] = 123;

		// System.out.println(arr.length);

		// iteration with for loop
//		for(int i=0 ;i<arr.length ;i++) {
//			System.out.println(arr[i]);
//		}

		// iteration with Arrays class
		System.out.println(Arrays.toString(arr));

		String cars[] = new String[4];
		cars[0] = "TATA";
		cars[1] = "MARUTI";
		cars[2] = "HONDA";
		cars[3] = "Lamborgini";

		System.out.println(Arrays.toString(cars));

		// replace maruti with 'notsafe'
		// 1. for loop 2. if(cars[i].equals(("maruti").toUppercase())) 3. cars[i] =
		// "notsafe" 4. break

		// arrays with literals
		int arr2[] = { 2, 3, 4, 5, 23, 34 };

		// System.out.println(Arrays.toString(arr2));

		// Limtations in Arrays
		// 1. no heterogenous elements 2. size is fixed
		// ArrayList
		for (int ele : arr) {
			System.out.println(ele);
		}

		// Object , Integer , Character , String

		Object obj[] = { 12, "Tanuj", 12.23, 'a', '%' };

		for (Object ele : obj) {
			System.out.println(ele);
		}

		int arr2D[][][] = new int[5][2][7];
		arr2D[0][0] = 1;
		arr2D[0][1] = 2;
		arr2D[1][0] = 3;
		arr2D[1][1] = 4;
		
		
		
		System.out.println("**********" + arr2D[4].length); // rows : 5 ; columns : 2

		for(int i =0 ; i<arr2D.length ; i++) {
			for(int j = 0;j<arr2D[i].length ; j++) {
				System.out.print(arr2D[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
