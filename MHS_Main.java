
package MoneyHandling;

public class MHS_Main {
	//The following variables are for test purpose, come as input from 
	//the other group otherwise.
    private static String bankAccount = "1234111222";
    private static double price = 10.45;
       
public static void main(String []args){ MHS_Bank bank = new MHS_Bank();
   
    if(bank.requestHandler(bankAccount, price)){
       System.out.println(bank.getBankName());
    }else{
        System.out.println("No enough balance");
    }
    
}  
}
