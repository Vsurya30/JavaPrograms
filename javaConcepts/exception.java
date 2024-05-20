package learning;
import java.io.*;

public class exception {
	public  void sumval() throws ArithmeticException  {
		int a=0;
		int b=5/a;
	}

	
	public static void main(String args[])
	{
		exception ex= new exception();
		
		try {
		ex.sumval();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
