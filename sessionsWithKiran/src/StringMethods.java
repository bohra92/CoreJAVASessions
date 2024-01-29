
public class StringMethods {
	public static void main(String[] args) {
		//scp = string constant pool
		// literal , new Keyword

		String str1 = "Tanuj";
		String str2 = new String("Tanuj");
		String str3 = "Tanuj";
		String str4 = new String("Tanuj");
		String str5 = "Hello";
		
		//scp say : 
		String aadhar = "12345";
		int aadharInt = Integer.parseInt(aadhar);
		System.out.println(aadharInt++);
		//System.out.println(Integer.parseInt(aadhar));
		
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str5);//false
		System.out.println(str1 == str3);//true
		System.out.println(str4 == str2);//false
		
		
	}

}
