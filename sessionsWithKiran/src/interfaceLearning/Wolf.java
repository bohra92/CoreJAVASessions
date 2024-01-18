package interfaceLearning;

public class Wolf implements Animal {

	public Wolf() {
		System.out.println("Wolf jaag gya!!!!");
	}

	@Override
	public void voices() {
		System.out.println("wolf howls");

	}

	@Override
	public void family() {
		System.out.println("wolf is from Dog family");

	}

	@Override
	public void foodType() {
		System.out.println("Wolf is Carnivore");

	}


}
