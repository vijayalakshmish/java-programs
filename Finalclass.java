package modifiers.java;


	final class FinalClass {
	    void show() {
	        System.out.println("This is a final class.");
	    }
	}


	class Parent {
	   
	    final int value = 100;

	   
	    final void display() {
	        System.out.println("Final method in Parent class: " + value);
	    }
	}



	public class FinalExample {
	    public static void main(String[] args) {
	        FinalClass obj1 = new FinalClass();
	        obj1.show();

	        Parent obj2 = new Parent();
	        obj2.display();

	    
	    }
	}



