/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhsdereje;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    
    private String bankName;
    private String accountCode;
    private List<BanKAccount> listOfAccounts;

    public Bank(String bankName, String accountCode, List<BanKAccount> listOfAccounts) {
        this.bankName = bankName;
        this.accountCode = accountCode;
        this.listOfAccounts = listOfAccounts;
    }

    public Bank() {
        this.listOfAccounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public List<BanKAccount> getListOfAccounts() {
        return listOfAccounts;
    }

    public void setListOfAccounts(List<BanKAccount> listOfAccounts) {
        this.listOfAccounts = listOfAccounts;
    }
    // This will return true if bank account is added or
    
    public boolean add(BanKAccount bankAccount){
      return this.listOfAccounts.add(bankAccount);
    }
    
    
    
    
}
// Constructor


        
    
            
