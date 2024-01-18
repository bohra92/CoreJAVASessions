package interfaceLearning;

public class Lion implements Animal {

	public Lion() {
		System.out.println("Lion jaag gya!!!!");
	}

	@Override
	public void voices() {
		System.out.println("Lion Roars ");

	}

	@Override
	public void family() {
		System.out.println("Lion is from cat family");
	}

	@Override
	public void foodType() {
		System.out.println("Lion is Carnivore");

	}

}
