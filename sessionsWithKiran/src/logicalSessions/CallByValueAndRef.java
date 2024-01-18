package logicalSessions;

public class CallByValueAndRef {

	String name;
	char gender;

	public static void main(String[] args) {
		// call by value
		CallByValueAndRef obj = new CallByValueAndRef();
		obj.name = "IntialValue";
		obj.gender='M';
		
		System.out.println(obj.name + "; " + obj.gender);
		
		System.out.println("After call change value");
		
		//obj.changeValue(obj.name, obj.gender);
		
		obj.changeValue(obj);
		
		System.out.println(obj.name + "; " + obj.gender);
		
		
		
		
		
		// call by reference

	}

	public void changeValue(String name, char gen) {

		name = "changedValue";
		gen = 'C';

	}
	
	public void changeValue(CallByValueAndRef obj) {

		obj.name = "changedValue";
		obj.gender = 'C';

	}

}
