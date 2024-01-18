package inheritanceLearning;

public class Car extends Vehicle{
	
	public String body = "Metal";
	public int wheelSize = 22;
	
	public Car() {
		System.out.println("CAR default constructor invoked");
	}
	
	public Car(String body, int wheelSize) {
		System.out.println("CAR parametrised constructor invoked");
		this.body = body;
		this.wheelSize = wheelSize;
	}
	
	

	// private methods() {} : wonts get inherited
	// public methods will only get inherited
	
	public final void start() {
		System.out.println("Car is Started from key!!!!");
		
	} 
	
	public void getWheelsNo() {
		System.out.println("Car wheels --->4");
	}
	
	public void transmission() {
		System.out.println("Car TRansmission --> manual");
	}
	
	public void ac() {
		System.out.println("Car basic AC");
	}
	
	//method hiding
	public static void OriginalFeature() {
		System.out.println("CAR original featutre");
	}
	

}
