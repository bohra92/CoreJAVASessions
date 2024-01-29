package ExceptionHandlingLearning;

public class Throwslearning {

	public void m1() throws ArithmeticException{
		System.out.println("calling m1");
		m2();
	}
	
	public void m2() throws ArithmeticException{
		System.out.println("calling m2");
		m3();
	}
	
	public void m3() throws ArithmeticException {
		System.out.println("calling m3");
		System.out.println(9/0);
	}
	
	public static void main(String[] args) {
		
		try {
		new Throwslearning().m1();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
