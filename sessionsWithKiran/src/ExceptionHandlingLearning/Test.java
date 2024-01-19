package ExceptionHandlingLearning;

public class Test {

	int a = 9;

	public static void main(String[] args) {
		System.out.println("printed");
		System.out.println("printed");
		System.out.println("printed");

		try {
			System.out.println(3 / 0);
			Test test = null;
			test.call();
		} catch (ArithmeticException exp) {
			System.out.println(exp.getMessage());
		} catch (NullPointerException npeExp) {
			System.out.println(npeExp.getMessage());
		} 
		
		
		System.out.println("Last line");

	}

	public void call() {
		System.out.println("test call");
	}

}
