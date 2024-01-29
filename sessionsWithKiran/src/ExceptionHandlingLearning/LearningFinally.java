package ExceptionHandlingLearning;

public class LearningFinally {

	public static void main(String[] args) {
		//finally is block
		int returnedValue = new LearningFinally().getValue(12);
		System.out.println(returnedValue);
		System.out.println("random message");
	}
	
	public int getValue(int value) {
		if(value == 12) {
			try {
				int i = 9/0;
				return 90;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.exit(1);
				return 50;
			}
			finally {
				System.out.println("finally block");
			}
		}
		return value;
	}

}
