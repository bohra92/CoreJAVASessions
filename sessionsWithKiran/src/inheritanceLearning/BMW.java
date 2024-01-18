package inheritanceLearning;

public class BMW extends Car {
	String coverType;
	int spare;

	public BMW(String coverType, int spare) {
		super("test",123);
		System.out.println("BMW parameterised constructor");
		this.coverType = coverType;
		this.spare = spare;
	}

	public BMW() {
		//hidden ; super()
		System.out.println(super.body);
		System.out.println(super.wheelSize);
		super.getWheelsNo();
		
		System.out.println("BMW default constructor");
	}

//	@Override
//	public void start() {
//		System.out.println("BWM is Started from push Button!!!!");
//	}

	public void seatAdjustment() {
		System.out.println("BMW --> yes we have 2 way seat adjustment");
	}

	public void convertible() {
		System.out.println("BMW --> Covertible");
	}

	@Override
	public void getWheelsNo() {
		System.out.println("BMW wheels --->4");
	}

	@Override
	public void ac() {
		System.out.println("BMW basic AC");
	}

	public static void OriginalFeature() {
		System.out.println("BMW original featutre");
	}

}
