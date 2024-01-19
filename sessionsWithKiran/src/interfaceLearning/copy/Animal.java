package interfaceLearning.copy;

public interface Animal {
	
	final static int animalLegs = 10;

	public void voices();

	public void family();

	public void foodType();

	//in java 1.8 we cat new feature 
	
	public static void habitat() {
		System.out.println("Wild animal lives in Jungle");
	}
	
	//default are applicable for only interfaces
	default void definition() {
		System.out.println("Wild beings living in different parts of world");
	}
	
	
	
//	public void implementThis() {
//		System.out.println("can be implemented in Abstract classes");
//	}

}
