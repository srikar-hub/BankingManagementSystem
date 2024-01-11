package Bank;

import java.util.*;

public class Customers {
	Scanner sc=new Scanner(System.in);
//Customer cArray[]=new Customer[100];
	int count=0;
	List<Customer> cArray=new ArrayList<Customer>();
	public int check(Customer a,Customer b) {
		if(a.getCid()==b.getCid()) {
			return 0;
		}
		return 1;
	}
	public void addCustomer(Customer c) {
	     for(int i=0;i<count;i++) {
	    	 if(check(c,cArray.get(i))==0) {
	    		 System.out.println("Same Adhar-No cannot register");
	    		 return;
	    	 }
	     }
	      cArray.add(c);
	      count++;
		  System.out.println("You have Registered Successfully");
	     
	}
	public void display() { 
		System.out.println("Customer-Name\t\tCustomer-Adhar\t\tCutomer-DepositeAmount");
		// array[i].name
		
		for(Customer i:cArray) {
			System.out.println(i.getCname()+"\t\t        "+i.getCid()+"\t\t        "+i.getCamount());
			}
		
	}
	public void withDrawl() {
	    System.out.println("Enter Adhar-Number to Debit Amount");
	    int no = sc.nextInt();
	    boolean adhar = false;

	    for (Customer j : cArray) {
	        if (no == j.getCid()) {
	            adhar = true;
	            System.out.println("Enter the Amount you want to Debit");
	            int amount = sc.nextInt();
	            
	            if (j.getCamount() >= amount) {
	                j.setCamount(j.getCamount() - amount);
	                System.out.println("Amount Debited Successfully");
	            } else {
	                System.out.println("Insufficient Balance");
	            }
	        }
	    }

	    if (!adhar) {
	        System.out.println("Adhar-No Not found");
	    }
	}

	
	public void depositeAmount() {
		System.out.println( "Enter the Registration Number ");
		int rno=sc.nextInt();
		boolean mark=false;
		for(Customer k:cArray) {
			if(rno==k.getCid()) {
				mark=true;
				System.out.println("Enter the Amount You want to Add");
				int n=sc.nextInt();
				if(n>0) {
					k.setCamount(k.getCamount()+n);
				}
				else {
					System.out.println("Deposite some Amount");
				}
			}
		}
		if(!mark) {
			System.out.println("Adhar Number  Not found");
		}
		
	}
	public void displayAfterDebit() {
        System.out.println("Customer Balance");
        System.out.println("Customer-Name\t\tCustomer-Adhar\t\tCutomer-DepositeAmount");

        for (Customer j : cArray) {
            System.out.println(j.getCname() + "\t\t        " + j.getCid() + "\t\t        " + j.getCamount());
        }
    }
}