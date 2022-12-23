package miniProjectAttempt2;
import java.util.Scanner;
public class HeaderMain {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ch,SN=0,ch1;
		//SN: Serial Number
		System.out.println("Hi Customer");
		BankAccount[] A= new BankAccount[100];
		System.out.println(".*.*.*.*.*.****Banking System Applcation****.*.*.*.*.*.");
		System.out.println("");
		try {
			do{
				System.out.println("Select the Following Options to procced \n1)Create New Account \n2)Search Account details\n3)Deposit Money\n4)Withdraw Money\n5)Update Bank Details\n6)Exit");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					{
						System.out.println("\n\n\n........Create Account........");
						System.out.println("Enter your Bank details ");
						A[SN]=new BankAccount();
						A[SN].CreateAccount(1,false);
						SN++;
						
						break;
					}
				case 2:
				    {
				    	
				    	System.out.println("Enter the Account Number you want to Search");
				    	String Acc_no=sc.next();
				    	boolean got=false;
				    	for(int i=0;i<=A.length;i++) {
				    		
				    		got=A[i].Search(Acc_no);
				    		if(got) {
				    			break;
				    		}
				    	}
				    	if(!got) {
				    		System.out.println("The Account Number you Entered is Incorrect \n....Search Failed....");
				    	}
				    	break;
				    }
				case 3:
				    {
				    				    	
				    	System.out.println("Enter the Account Number ");
				    	String Acc_no=sc.next();
				    	boolean got=false;
				    	for(int i=0;i<=A.length;i++) {
				    		
				    		got=A[i].Search(Acc_no);
				    		if(got) {
				    			A[i].Deposit();
				    			break;
				    		}
				    	}
				    	if(!got) {
				    		System.out.println("The Account Number you Entered is Incorrect \n....Deposition Failed....");
				    	}
				    	break;
					
				    }
				case 4:
				    {		    	
				    	
				    	System.out.println("Enter the Account Number ");
				    	String Acc_no=sc.next();
				    	boolean got=false;
				    	for(int i=0;i<=A.length;i++) {
				    		
				    		got=A[i].Search(Acc_no);
				    		if(got) {
				    			A[i].Withdraw();
				    			break;
				    		}
				    	}
				    	if(!got) {
				    		System.out.println("The Account Number you Entered is Incorrect \n....Withdrawl Failed....");
				    	} 
				    	break;
				    }
				case 5:
				    {
				    	
				    	System.out.println("Enter th Account Number you want to update");
				    	String Acc_no=sc.next();
				    	boolean got=false;
				    	
				    	for(int i=0;i<=A.length;i++) {
				    		got=A[i].Search(Acc_no);
				    		if(got) {
				    			A[i].ReCheck();
				    			break;
				    		}
				    	}
				    	if(!got) {
				    		System.out.println("The Account Number you Entered is Incorrect \n....Incorrect Account Number....");
				    	} 
				    	break;
				    }
				case 6:
				     {
				    	 System.out.println(".....See you Later.....");
				    	 break;
				     }
				     default:
				     {
				    	 System.out.println("You Chose the wrong Option \n Try Again");
				    	 break;
				     }
				
	   			}
			}while(ch!=6 );

		}catch(Exception e) {
				System.out.println("Enter Integers Only---------------------------------");
		}
		
	}
}
