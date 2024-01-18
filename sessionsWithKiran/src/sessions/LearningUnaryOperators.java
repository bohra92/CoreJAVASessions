package sessions;

public class LearningUnaryOperators {

	public static void main(String[] args) {
		
		//post increment
		
		//int a = 5;//a=5
		//int b= a++;//a=6;b=5
		//System.out.println(a);//6
		//System.out.println(b);//5
		
		//System.out.println(a++ + a++ + a++ + a++);//5 + 6 + 7 + 8 
		//System.out.println(a);//8
		
		//int b = 4;
		//int c = b++ + b-- + b ;//4+5+4
		//System.out.println(b);//4
		//System.out.println(c);//9
		
		//int b = 10;
		//int c = b + b++ + b-- + b-- + b;//10 + 10 + 11 + 10 + 9
		
		//System.out.println(b);//9
		//System.out.println(c);//50
		
		//pre increment a++ or ++a = a+1
		
		int a = 6 ;
		//int b = ++a;//
		//System.out.println(a);//7
		//System.out.println(b);//7
		
		System.out.println(++a + ++a + --a);//7 + 8 + 7
		
		
		
		
		

	}

}
