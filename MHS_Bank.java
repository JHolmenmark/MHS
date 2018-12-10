import java.util.ArrayList;

public class MHS_Bank {
  public static ArrayList<MHS_BankAccount> bankList = new ArrayList<MHS_BankAccount>();

  public boolean addAccount(String bankName, String accountNr, double balance){
    if(accountGoodFormat(bankName, accountNumber)){
      MHS_BankAccount accnew = new MHS_BankAccount();
      accnew.setBankName(bankName);
      accnew.setAccountNumber(accountNr);
      accnew.setBalance(balance);
      bankList.add(accnew);
      return true;
    } else {
      return false;
    }
  }

  public boolean accountGoodFormat(String bankName, String accountNumber) {
    switch(bankName){
      case "Nordea":
        if(accountNumber.substring(0, 4).contains("1234")) {
          return true;
        }
        break;
      case "Handelsbanken":
        if(accountNumber.substring(0, 4).contains("1423")) {
          return true;
        }
        break;
      case "SEB":
        if(accountNumber.substring(0, 4).contains("5531")) {
          return true;
        }
      case "Swedbank":
        if(accountNumber.substring(0, 5).contains("99156")
        && accountNumber.substring(10).contains("9")) {
          return true;
        }
      default:
        return false;
        break;
    }
  }

  public String makePurchase(String accountNumber, double ticketPrice) {
    for(int i=0; i < bankList.size(); i++) {
      if((bankList.get(i).getAccountNumber() == accountNumber) {
        if(bankList.get(i).purchase(ticketPrice) {
          return banklist.get(i).getBankName();
        } else {
          return "Insufficient Funds"
        }
      } else {
        return "Wrong AccountNr";
      }
    }
  }

  public ArrayList<MHS_BankAccount> getBankList(){
    return bankList;
  }
