package miniProjectAttempt2;
import java.util.Scanner;
public class BankAccount extends HeaderMain{
	protected int age,Account_Change_Count;
	protected long AdharNO,MobileNo,withdrawLimit=0;  
	protected String Name,AccNo,PanNo,Add;
	protected double balance;
	
	Scanner sc =new Scanner (System.in);
	void CreateAccount(int ch,boolean Re_choice) {//Re_choice : To Get the value If the Update Function s called 
		//ch: This is to take a serial Number from User to Change a particular Detail
		//using switch Because In case of Updating a Bank Details
		try {
			switch(ch) {
			case 1:
			{
				System.out.println("1)Name : ");
				Name=sc.next();
				if(Re_choice)
				{
				    ch=8;
				    break;
					
				}
				else {
					ch++;
					
				}
				
			}
			case 2:
			{
				do {
					System.out.println("Your age Should be less than <100> And greater than <15> years old");
					System.out.println("2)Age : ");
					age=sc.nextInt();
					
				}while(age<15 || age>100);
				//Just a normal do while loop till Limit
				if(Re_choice)
				{
					ch=8;
					break;
					
				}
				else {
					ch++;
					
				}
			}
			
			case 3:
			{
				System.out.println("3)Mobile NUmber : ");
				MobileNo=sc.nextLong();
				String s=Long.toString(MobileNo);
				int len=s.length();
				if(len!=10)
				{
					System.out.println("Enter correct Mobile Number");
					CreateAccount(3,false);
					break;
				}//I used Recursion Function 
				if(Re_choice)
				{
					ch=8;
					break;
				}
				else {
					ch++;
				}
			}
			case 4:
			{
				System.out.println("4)Adhar Number : ");
				AdharNO=sc.nextLong();
				if(Re_choice)
				{
					ch=8;
					break;
				}
				else {
					ch++;
				}
			}
			case 5:
			{
				System.out.println("5)Pan Card Number : ");
				PanNo=sc.next();
				if(Re_choice)
				{
					ch=8;
					break;
				}
				else {
					ch++;
				}
			}
			case 6:
			{
				System.out.println("6)Address : ");
				Add=sc.next();   
				if(Re_choice)
				{
					ch=8;
					break;
				}
				else { 
					ch++;
				}
			}
			case 7:
			{
				
					AccountNumberGenerator G=new AccountNumberGenerator();
		            AccNo=G.AccountBuilder();
		            System.out.println("The Account Number Genereted for you : "+AccNo+"\n");
		            break;
				
	        }
			case 8:
			{
				break;
			}
		}
		}
		catch(Exception e) {
			System.out.println("Write The specific Data types values----------------------");
		}
		
}
	void ShowAccount() {
		//To Display the details of the Account
		System.out.println("\n\n\nThe Name of the Account Holder : "+Name);
		System.out.println("Account Holders Age is : "+age);
		System.out.println("Mobile Number is : "+MobileNo);
		System.out.println("Adhar CArd Number is : "+AdharNO);
		System.out.println("Pan Card Number is : "+PanNo);
		System.out.println("Address is : "+Add);
		System.out.println("The Account number is "+AccNo);
	    System.out.println("Your Balance is : "+balance+"\n\n");
	}
	void Deposit() {
		//To deposit some Money in Account
		try {
			long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        balance = balance + amt; 
		
		}
		catch(Exception e) {
			System.out.println("Enter integer value only");
		}
	}
	void Withdraw() {
		//To Withdraw The Money
		try {
			long amt;
	        System.out.println("Enter the amount you want to withdraw: ");
	        System.out.println("You Can remove Only 10000/- Per day");
	        amt = sc.nextLong();  
	        withdrawLimit+=amt;
	        if(withdrawLimit>10000) {
	        	System.out.println("This is The Max Withdrawl You can Make today");
	        }
	        else {
	        if (balance >= amt) {  
	            balance = balance - amt;  
	            System.out.println("Balance after withdrawal: " + balance);  
	        } else {  
	            System.out.println("Your balance is less than the entered Withdrawl Amount :" + amt + "\n!!........Transaction failed........!!" );  
	        }  
	       }
		}catch(Exception e){
			System.out.println("Enter Integrs Only---------------------------------- ");
		}
	    
	}
	boolean Search(String AN) {
		//A search Function
		//An:Accountnumber to search the account 
		if (AccNo.equals(AN)) {  
            ShowAccount();  
            return (true);  
        }
        return (false);
	}
	void ReCheck() {
		try {
			boolean Re_choice=true;
			int ch,Warning=3;
			System.out.println("Enter The Serial Number adjacent to Details ShownBelow to Update ");
			do {
				System.out.println("1)!Name! \n2)!Age!\n3)!Mobile Number!\n4)!Adhar Card Number!\n5)Pan Card Number!\n6)!Address!");
			    System.out.println("You Cant Enter (7) to Change your Account Number//Warning//");
				System.out.println("!!Enter 8 to Exit!!");
			    ch=sc.nextInt();
			    if(ch==7) {
			    	Warning-=1;
			    	System.out.println(".........You Cannot Change The Account Number ..........");
			    	System.out.println("You Get "+Warning+" Chances to Choose right Option");
			    	if(Warning==0) {
			    		System.out.println("<<Warned You>>");
			    		break;
			    	}
			    }
			    if(ch!=7) {
			    CreateAccount(ch,Re_choice);
			    }
				
			}while(ch>0 && ch<8);
		}catch(Exception e) {
			System.out.println("Enter Interger Values only ----------------------------");
		}
		
	}
	
}
