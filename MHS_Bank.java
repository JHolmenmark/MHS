import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MHS_Bank {

		public static Map<String, ArrayList<MHS_BankAccount>> bankList = new HashMap<String, ArrayList<MHS_BankAccount>>();
		
		public MHS_Bank()
		{

			ArrayList<MHS_BankAccount> nordeaAccountList = new ArrayList<MHS_BankAccount>();
			
			nordeaAccountList.add(new MHS_BankAccount("1234-000001", 1000));
			nordeaAccountList.add(new MHS_BankAccount("1234-000002", 1000));
			nordeaAccountList.add(new MHS_BankAccount("1234-000003", 1000));
			nordeaAccountList.add(new MHS_BankAccount("1234-000004", 1000));
			
			bankList.put("Nordea", nordeaAccountList);
			
			ArrayList<MHS_BankAccount> handelBankenAccountList = new ArrayList<MHS_BankAccount>();
			
			handelBankenAccountList.add(new MHS_BankAccount("1423-000001", 1000));
			handelBankenAccountList.add(new MHS_BankAccount("1423-000002", 1000));
			handelBankenAccountList.add(new MHS_BankAccount("1423-000003", 1000));
			handelBankenAccountList.add(new MHS_BankAccount("1423-000004", 1000));
			
			bankList.put("Handelsbanken", handelBankenAccountList);
			
			ArrayList<MHS_BankAccount> sebAccountList = new ArrayList<MHS_BankAccount>();
			
			sebAccountList.add(new MHS_BankAccount("5531-000001", 1000));
			sebAccountList.add(new MHS_BankAccount("5531-000002", 1000));
			sebAccountList.add(new MHS_BankAccount("5531-000003", 1000));
			sebAccountList.add(new MHS_BankAccount("5531-000004", 1000));
				
			bankList.put("SEB", sebAccountList);
			
			ArrayList<MHS_BankAccount> swedbankList = new ArrayList<MHS_BankAccount>();
			
			swedbankList.add(new MHS_BankAccount("99516-10009", 0100));
			swedbankList.add(new MHS_BankAccount("99516-20009", 1000));
			swedbankList.add(new MHS_BankAccount("99516-30009", 1000));
			swedbankList.add(new MHS_BankAccount("99516-40009", 1000));
			
			bankList.put("Swedbank", swedbankList);
		
		}
	
	  public boolean PurchaseTicket(String bankName, String accountNumber, double price) {

	    ArrayList<MHS_BankAccount> accounts = bankList.get(bankName);

	    if(accounts == null)
	    {
	    	System.out.println("bank name does not exist");
	    	return false;
	    }

	    for (MHS_BankAccount mhs_BankAccount : accounts) {

	    	String accnum = mhs_BankAccount.getAccountNr().toString(); 

			if(accnum.equals(accountNumber))
			{
		    	System.out.println(accnum);

				if(mhs_BankAccount.getBalance() >= price)
				{
					mhs_BankAccount.setBalance(mhs_BankAccount.getBalance() - price);
			    	System.out.println("remaining balance is: "+ mhs_BankAccount.getBalance());

					return true;
				}
				else
				{
					System.out.println("insufficient funds");
					return false;
				}
			}
		}
	    
	    System.out.println("Account does not exist");
	    return false;
	  }
}
