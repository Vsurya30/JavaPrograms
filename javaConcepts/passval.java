package learning;

public class passval {
	
	public static void main(String[] args) {
		
		passval app = new passval();
		
		//non primitive types
		
		cat cat1= new cat("luna");
		
		System.out.println("1" + cat1);
		app.display(cat1);
		System.out.println("4" + cat1);
		cat1.setCatname("vicks");
		System.out.println("5" + cat1);
		
		
	}
	
	public void display(cat cat1) {
		System.out.println("2" + cat1);
		cat1.setCatname("cheks");
		cat1= new cat("chims");
		System.out.println("3" + cat1);
		
		
	}

}
