
package simplebankingsystem;


public class Statement {
    
    
    String cardNo,transactionType;
      int balance,amount;

    public Statement(String cardNo,String transactionType, int balance, int amount) {
        this.cardNo = cardNo;
        this.balance = balance;
        this.amount = amount;
        this.transactionType = transactionType;
        
    }
  
    

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getTransactioType() {
        return transactionType;
    }

    public void setTransactioType(String transactioType) {
        this.transactionType = transactioType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    
    
}
