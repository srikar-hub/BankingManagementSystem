package Bank;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("                               Banking Management System                    ");
	Customers c1=new Customers();
	
	int i;
	 do {
		 
		System.out.println("Press 0 to exit:");
		System.out.println("Press 1 to Register in a Bank");
		System.out.println("Press 2 to Display");
		System.out.println("Press 3 to WithDraw");
		System.out.println("Press 4 to Deposite");
		System.out.println("Press 5 to Display Balance");
		System.out.println("Enter Your choice:");
		i=sc.nextInt();
		switch(i) {
		case 1:
			Customer c=new Customer();
			c1.addCustomer(c);
			break;
		case 2:
			c1.display();
			break;
		case 3:
			c1.withDrawl();
			break;
		case 4:
			c1.depositeAmount();		
			  break;
		case 5:
			c1.displayBalance();
			break;
		}
	 }while(i!=0);
   
	}

}
