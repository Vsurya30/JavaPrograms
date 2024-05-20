package learning;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args)
	{
		HashMap <Integer,String> map = new HashMap<Integer,String>();
		
		map.put(3, "three");
		map.put(2, "two");
		map.put(1, "one");
		map.put(8, "eight");
		map.put(7, "seven");
		map.put(711, "seven");
		map.put(78, "seven");
		
		String num= map.get(8);
		
		System.out.println(num); // to print the value based on the key
		
		for(Map.Entry<Integer, String> mynums : map.entrySet()) {
			
			int key= mynums.getKey();
			String numval=mynums.getValue();
			
			System.out.println(key + " " + numval);
		}
		
		System.out.println(map);
		
	}
}
