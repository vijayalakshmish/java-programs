package modifiers.java;

interface ani{
	
	abstract void sound();
	
class Horse implements ani{
	public void sound() {
		System.out.println("Animal sound...");	
	}
}
	
class Tiger  implements ani{
	public void sound() {
		System.out.println("tiger sound");
		
		}
}
public class Interfaces {
	public static void main(String [] args) {
		Horse a  = new Horse ();
		a.sound();
		Tiger t = new Tiger ();
		t.sound();
		
	}

}
}


