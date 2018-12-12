
public class MHS_BankAccount {
	
	private String AccountNr;
		 private double Balance;
		 
 public MHS_BankAccount (String AccountNr, double Balance) {
   this.AccountNr =AccountNr ;
   this.Balance = Balance;	
   }

	  public String getAccountNr(){
	    return this.AccountNr;
	  }
	  public double getBalance(){
	    return this.Balance;
	  }
	  
	  public void setBalance(double balance){
		    this.Balance = balance;
		  }
}