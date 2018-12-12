import java.util.Scanner;

public class MHS_Main {
	
     private static  MHS_Bank allBanks = new MHS_Bank();

     public static void main(String []args){ 
    	 Scanner scan = new Scanner(System.in);
    	 
	    	System.out.println("enter bank name");
    		String objectBankName = scan.next();
    		
    		System.out.println("enter account number");
    		String objectAccountNumber = scan.next();
    		
    		System.out.println("enter amount name");
    		double objectAmount = scan.nextDouble();
    		
    		buyTicket(objectBankName, objectAccountNumber, objectAmount);
    		
    		scan.close();
    	 }
    	 
	  public static void buyTicket(String bankName, String AccountNr, Double ticketPrice) {

		    boolean status = allBanks.PurchaseTicket(bankName, AccountNr, ticketPrice);
		    if(status)
		    {
	    		System.out.println("successful!");
		    }
		    else
		    {
	    		System.out.println("unsuccessful!");
		    }	
	  }
	}

