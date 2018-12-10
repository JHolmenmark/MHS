package MoneyHandling;

public class MHS_Bank {
    
    private String bankAccount;
    private double balance;
    MHS_BankAccount MHSbank = new MHS_BankAccount();
    String [][] banks = {{"1234", "Nordea"},
                         {"1423", "Handelsbanken"},
                         {"5531", "SEB"}, 
                         {"99516", "Swedbank"}};
    public MHS_Bank(){
        
    }
	  public boolean requestHandler(String accountNo, double price){
        this.bankAccount = accountNo;
        this.balance= MHSbank.getBalance(Double.parseDouble(accountNo));
        if(price < this.balance){
           this.balance = this.balance - price;
           MHSbank.setBalance(this.balance);
            System.out.println("Current balance: "+this.balance);
           return true;
        } 
       return false;
    }
	public String getbankAccount(){
        return this.bankAccount;
    }
    public String trim(int length){
        return this.bankAccount.substring(0, length);
    }
	public String getBankName(){
        String bankName = "";
        String clearanceNr; 
        clearanceNr = trim(4);
        for (int i = 0; i < 4; i++){
           
            if (clearanceNr.equals(banks[i][0])){
                bankName= banks[i][1];
            }
        }
        clearanceNr = trim(5);
        for (int i = 0; i < 4; i++){
            if (clearanceNr.equals(banks[i][0])){
               bankName = banks[i][1]; 
            }
        }
        return bankName;
    }
}