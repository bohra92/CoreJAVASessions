package ExceptionHandlingLearning;

public class ThrowLearnings {

	public static void main(String[] args) {
		int a = 21;
		System.out.println(9/0);
		try {
			if (a % 2 != 0) {
				
				throw new MyException("number is odd");
			}
		} catch (Exception e) {
			System.out.println("Exception !!! : "+ e.getMessage());
		}

	}

}
