package learning;

import java.util.Scanner;

class threadexa extends Thread{
	
	private volatile boolean on =true;
	
	@Override
	public void run() {
		
		while(on)
		{
			System.out.println("thread is running");
		}
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void off()
	{
		
		on = false;
	}
	
	
}

public class volatileKeyword {

	public static void main(String[] args) {
		
		threadexa th1 = new threadexa();
		th1.start();
		
		System.out.println("press q to stop");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		th1.off();
		
		
	}

}
