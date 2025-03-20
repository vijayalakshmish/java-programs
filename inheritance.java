package modifiers.java;
class parent{ // parent/super/derived class
	public void parent_method() {
		System.out.println("iam  a parent method");
	}
}
class child extends parent {
	public void child_method() {
		System.out.println("iam  a child method");
		}
	}
	

class inheritance {    //main class
	public void main (String[] args) {
		
	//	System.out.println();	
		child c =new child();
		c.parent_method();
		c.child_method();
		
	}
}
