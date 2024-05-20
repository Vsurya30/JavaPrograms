package learning;

public class cat {
	
	private String catname;
	
	public cat(String catname){
		this.catname=catname;		
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}
	
	@Override
	public String toString() {
		return "cat :" + catname ;
	}
}
