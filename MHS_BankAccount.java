
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