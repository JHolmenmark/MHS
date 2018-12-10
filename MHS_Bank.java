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