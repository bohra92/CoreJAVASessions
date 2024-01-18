package logicalSessions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(5);
		
		//System.out.println(numbers.size());
		
		//numbers.clear();
		
		//System.out.println(numbers);
		
//		System.out.println(numbers.isEmpty());
//		
//		System.out.println(numbers.contains(2));
		
		
		//iteration of list and sets using iterator
//		Iterator<Integer> it = numbers.iterator();
//		
//		while(it.hasNext()) {
//			//System.out.println(it.next());
//		}
		
		
		//maps HashMap
		
		HashMap<Integer,String> weeks =  new HashMap<Integer, String>();
		
		weeks.put(1,"Monday");
		weeks.put(2,"Tuesday");
		weeks.put(3,"Wednesday");
		weeks.put(4,"Thrusday");
		weeks.put(5,"Friday");
		weeks.put(6,"Saturday");
		weeks.put(7,"Sunday");
		
		weeks.put(6,"Shanivar");
		
		//System.out.println(weeks.get(1));
		//System.out.println(weeks.remove(1));
		//System.out.println(weeks.get(1));
		
//		System.out.println(weeks.keySet());
//		
//		
//		System.out.println(weeks.containsKey(2));
//		System.out.println(weeks.containsValue("Saturday"));
//		
		
		//Collection amd Collections
		
		for(Map.Entry m : weeks.entrySet()) {
			System.out.println("Key : " + m.getKey()+"; Value :"+m.getValue());
		}
		
		
		
		
		
		
		

	}

}
