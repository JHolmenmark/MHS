
package mhsdereje;

import java.util.ArrayList;
import java.util.List;

public class MHSDereje {

    
    
    private static final List<Bank> bankList=new ArrayList<>();

    public MHSDereje() {
        // create four banks
    Bank nordea = new Bank();
    
    nordea.setBankName("Nordea");
    nordea.setAccountCode("1234");
    Bank handelsbanken = new Bank();
    handelsbanken.setBankName("Handelsbanken");
    handelsbanken.setAccountCode("1423");
    Bank seb = new Bank();
    seb.setBankName("SEB");
    seb.setAccountCode("5531");
    Bank swedbank = new Bank();
    swedbank.setBankName("Swedbank");
    swedbank.setAccountCode("99516");
    
        bankList.add(nordea);
        bankList.add(handelsbanken);
        bankList.add(seb);
        bankList.add(swedbank);
        
    }
    
    public boolean accountExist(String accountNumber){
        if (10 != accountNumber.length())
            return false;
        for(int index=0; index<bankList.size();index++){
            String code = bankList.get(index).getAccountCode();
            if(accountNumber.startsWith(code)){
                String bankName = bankList.get(index).getBankName();
                // BanKAccount banKAccount = bankList.get(index);
           for(int i=0; i<bankList.get(index).getListOfAccounts().size();i++){
                BanKAccount banKAccount = bankList.get(index).getListOfAccounts().get(i);  
               if (accountNumber.equals(banKAccount.getAccountNumber()))
               if ("Swedbank".equalsIgnoreCase(bankName)) {
                   return accountNumber.endsWith("9");
               } else{
                   return true;
               }
                     
                  
              }  
            }
            
        }
        return false;
    }
           
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
