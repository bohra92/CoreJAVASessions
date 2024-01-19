package interfaceLearning.copy;

public class Turtle implements Animal {

	public Turtle() {
		System.out.println("Turtle jaag gya!!!!");
	}

	@Override
	public void voices() {
		System.out.println("Turtle is mute");

	}

	@Override
	public void family() {
		System.out.println("Turtle is from Reptile family");

	}

	@Override
	public void foodType() {
		System.out.println("Turtle is Herbivore");

	}

}
