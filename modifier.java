package modifiers.java;

 class modi{
	//user defined class
	
	public int a = 100; //public
	protected int b =200;//protected
	int c = 300; //default
	private String d = "viju";//private
	public String getName() {
		return d;//getter method
	}
	public void setName(String d) {
		this.d=d;
		
	
	}
	
	
}


public class modifier {  //main class
	public int a = 100; //public
	protected int b =200;//protected
	int c = 300; //default
	private String d = "viju";//private
	public static void main(String[] args) {
		//main class object
		modifier m = new modifier();
		System.out.println("a value:"+m.a);
		System.out.println("a value:"+m.b);
		System.out.println("a value:"+m.c);
		System.out.println("a value:"+m.d);
		
		//user defined object
		modi m1 = new modi();
		System.out.println("a value:"+m.a);
		System.out.println("a value:"+m.b);
		System.out.println("a value:"+m.c);
		m1.setName("viju");
		System.out.println("a value:"+m.d);
		
	}
	
	

}
