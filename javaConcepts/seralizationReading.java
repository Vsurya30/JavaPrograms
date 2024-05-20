package learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class seralizationReading {
	
	public static void main (String[] args)
	{
		System.out.println("reading objects");
		
		try(FileInputStream fileInput = new FileInputStream("vehicle.data"))
		{
			
			ObjectInputStream objectInput= new ObjectInputStream(fileInput);
			
			Vehicle vehicle1 = (Vehicle)objectInput.readObject();
			Vehicle vehicle2 = (Vehicle)objectInput.readObject();
						
			System.out.println(vehicle1);
			System.out.println(vehicle2);
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
