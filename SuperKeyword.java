package Java;

class Super{
	String name ;
	Super(String name){ //constructor                    
	this.name=name;	
	System.out.println("My name in constructor:"+this.name);
	}
	
}
class Child3 extends Super{

	Child3(String name) {
		super(name);
		System.out.println("My name in constructor(parent):"+this.name);
		
	}
	
}

public class SuperKeyword {//main class

	public static void main(String[] args) {
		Child3 s =new Child3("Nokesh");
	
		

	}

}
