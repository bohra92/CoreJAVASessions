package logicalSessions;

public class PolyMorphismLearning {
	// polyphism = poly = many and morph =forms
	// method overloading , compile time polymorphism

	public static void main(String[] strArray) {
		PolyMorphismLearning pl = new PolyMorphismLearning();
		pl.add(2, 3);
		int sum = pl.add(2, 3, 4);
		String addTwoStr = pl.add("Hello", " Kiran", " welcome!!");
		int[] arr = {1,2,3,4};
		pl.main(arr);
		System.out.println(addTwoStr);

	}

	// jvm :int sum = main(1,2,3);
	//

	public static void main(int[] arr) {
		System.out.println("hello main 1");
	}

	public static void main(int a, int b) {
		System.out.println("hello main 2" + a);
	}

	public static void main(String s) {
		System.out.println("hello main 3" + s);
	}

	public static String main(float f) {
		System.out.println("hello main 4" + f);
		return "hello main 4" + f;
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public String add(String a, String b) {
		return a + b;
	}

	public String add(String a, String b, String c) {
		return a + b + c;
	}

}
