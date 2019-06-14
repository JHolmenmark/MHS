
package MoneyHandling;

public class MHS_BankAccount {
    
    private String bankAccount;
    private double accBalance ;
    double [][] bankInfo = {{1234111222.0, 1205.56},
                            {1423111222.0, 1205.56},
                            {5531111222.0, 1205.56},
                            {9951612229.0, 1205.56}};
    public MHS_BankAccount(){
        this.accBalance = 0.0;
    }
	public double getBalance(double accNr){
         for (int i = 0; i < 4; i++){
            if (accNr == bankInfo[i][0]){
               this.accBalance= bankInfo[i][1]; 
            }
        }
         return this.accBalance;
     }
  //Set-Methods
    
    public void setBalance(double currentBalance){
        
      this.accBalance = currentBalance;
    }
}