package modifiers.java;
import java.util.Scanner;

abstract class ATM{ //parent class
	double balance;// initial balance
	
	ATM(double balance){ //parent constructor
		this.balance = balance;
	}
	
	abstract void withDraw(double amount);
	abstract void deposit(double amount);
	abstract void checkBal();
	
}
class SBI  extends ATM{
	SBI(double balance){
		super(balance);
	}
	//withdraw method
	@Override
	void withDraw(double amount) {
		if(amount>0 && amount <= balance) {
			balance -= amount;
			System.out.println("WITHDRAW SUCCESS : AVL BAL"+balance);
		}
		else {
			System.out.println(" NOT AVL BAL");
		
		}
		
	}
	//deposit method
	@Override
	void deposit(double amount) {
		if(amount>0 && amount <= balance) {
			balance += amount;
			System.out.println("DEPOSIT SUCCESS : AVL BAL"+balance);
		}
		else {
			System.out.println(" DEPOSIT FAILED");
		
		}
		
	}
	//check balance method
	@Override
	void checkBal() {
		System.out.println("CHECK BALANCE "+balance);
		}
		
	
}

public class Atm {
	public static void main(String[] args) {
		SBI obj = new SBI(2000);
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("*******ATM MENU*******");
			System.out.println("----------------------");
			System.out.println("1.WITHDRAW MONEY");
			System.out.println("2.DEPOSIT MONEY");
			System.out.println("3.CHECKING BALANCE");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR CHOICE");
			
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("ENTER WITHDRAW MONEY ");
				double with_amt = s.nextDouble();
				obj.withDraw(with_amt);
				break;
					
			case 2:
				System.out.println("ENTER DEPOSIT MONEY ");
				double dept_amt = s.nextDouble();
				obj.deposit(dept_amt);
				break;
				
			case 3:
				System.out.println("AVL BALANCE ");
			    obj.checkBal();
				break;
				
			case 4:
				System.out.println("THANK YOU VISIT AGAIN ");
				System.exit(0);
			    default:
			    	System.out.println("ENTER CORRECT OPTION");
			
			}
			
		}
		
		
	}

}
