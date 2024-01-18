package inheritanceLearning;

public class Test {

	public static void main(String[] args) {
		//class CAR  : BMW , MERCEDES , FERARRI
		
//		Car car = new Car();
//		car.start();
//		car.transmission();
//		car.getWheelsNo();
//		
//		BMW bmw = new BMW();
//		bmw.start();
//		bmw.getWheelsNo();
//		bmw.transmission();
//		bmw.seatAdjustment();// BMW's own method
//		bmw.body();
//		bmw.windows();//this is called multilevel Inheritance
		//there is no multiple inheritance in java because of diamond problem
		
		
		
		// polymorphism : many form 
		//method overload : method with same name and different parameters
		//method overriding : same method name overriding with same params and same return type+
		
		
//		//Top casting :
//		Car c1 = new BMW();
//		c1.getWheelsNo();//overriden : 
//		c1.transmission();//only in car : 
//		c1.start();//overriden :
//		c1.ac();//
//		Car.OriginalFeature();
//		BMW.OriginalFeature();
//		
//		// with parent reference we can only call methods in the parent class and the methods which are overriden in child class
//
//		Car c2 = new Car();
		//Car.OriginalFeature();
		
//		Car c3 = new Car();
//		Car c4 = new Car("Metal",16);
//		
		BMW b1 = new BMW();// BMW default
		//BMW b2 = new BMW("plastic",1); // BMW params
		
		//this ; this can be used to call constructor ; this should be first statement
		//super ; this can be used to call parent constructor , variables , methods ; this should also be the first statement ; A hiden super is always present and is calling default parent constructor
		// this and super cant be used together
	}

}
