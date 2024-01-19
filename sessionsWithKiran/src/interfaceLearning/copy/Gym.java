package interfaceLearning.copy;

public abstract class Gym {
	// interface provides 100% abstraction
	// abstract class is between 0 to 100% 
	
	//new operator se call hoga
	public Gym() {
		System.out.println("Gym's default constructor");
	}
	
	public abstract void noOfMachines();
	
	public void rules() {
		System.out.println("Rules");
	}

}
