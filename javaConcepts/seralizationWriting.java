package learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class seralizationWriting {
	
	public static void main(String[] args)
	{
		Vehicle car= new Vehicle(31,"toyata");
		Vehicle truck= new Vehicle(56,"bharat");
		System.out.println("writtting objects");
		System.out.println(car);
		System.out.println(truck);
		
		
		try(FileOutputStream fileOutput= new FileOutputStream("vehicle.data")){
			
			ObjectOutputStream objectOutput= new ObjectOutputStream(fileOutput);
			
			objectOutput.writeObject(car);
			objectOutput.writeObject(truck);
			
			
			objectOutput.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
