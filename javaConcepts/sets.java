package learning;

import java.util.TreeSet;

public class sets {
	
	public static void main(String[] args) {
		
		String[] array1= {
				"laptop","headphone","cell","laptop","televison","apple"
		};
		
		TreeSet<String> val = new TreeSet<String>();
		
		for(String vals:array1) {
			
			val.add(vals);
		}
		
		
		System.out.println((val));
		for(String my : val) {
			System.out.print(my+" ");
		}
		if(val.contains("laptop"))
		{
			System.out.println("this contains laptop");
		}
		
		
	}
}
