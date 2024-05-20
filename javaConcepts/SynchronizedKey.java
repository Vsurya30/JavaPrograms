package learning;

public class SynchronizedKey {
	
	private int count=0;
	
	
	public synchronized void incrementfunc() {
		count++;  // here the synchronized keyword makes the instance incremented for both the thread
	}
	public static void main(String[] args)
	{
		SynchronizedKey sy1 = new SynchronizedKey();
		sy1.multiplethreads();
		
	}
	
	
	public void multiplethreads() {
	Thread firstth = new Thread(new Runnable() {
		public void run()
		{
			for(int i=0;i<10000;i++)
			{
				incrementfunc();
			}
		}
		
	});
	Thread secondth = new Thread(new Runnable() {
		public void run()
		{
			for(int i=0;i<10000;i++)
			{
				incrementfunc();
			}
		}
		
	});
	
	firstth.start();
	secondth.start();
	
	
	try {
		firstth.join();
		secondth.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("count : " + count); // only by using the synchronized method we are able to get the values 20000 or else we get different values
	
	}
	
	
	
	
}
