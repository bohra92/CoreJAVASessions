package interfaceLearning;

public class Test {

	public static void main(String[] args) {
		
		
		
		Animal animal = new Wolf();// Webdriver driver = new Chromedriver()
		animal.family();//driver.click
		animal.foodType();//driver.fillFields
		animal.voices();//driver.scroll
		System.out.println();
		Animal animal1 = new Lion();// Webdriver driver = new GekoDriver()
		animal1.family();
		animal1.foodType();
		animal1.voices();
		System.out.println();
		animal = new Turtle();
		animal.family();
		animal.foodType();
		animal.voices();
		
		//chome = chromedriver ; ff = gekodriver ; edge = edgeWebdriver
		//Chromedriver driver = new Chromedriver()
		//driver.click
		
	}

}
