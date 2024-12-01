
package simplebankingsystem;


public class BankAccount {
    
         String cardNo,pin,accountType, declaration,atmCard,internet,mobile,email,cheque,statement;
         
         int idNo;

    public BankAccount(int idNo,String cardNo, String pin, String accountType, 
            String declaration, String atmCard, String internet, String mobile,
            String email, String cheque, String statement) {
        this.cardNo = cardNo;
        this.pin = pin;
        this.accountType = accountType;
        this.declaration = declaration;
        this.atmCard = atmCard;
        this.internet = internet;
        this.mobile = mobile;
        this.email = email;
        this.cheque = cheque;
        this.statement = statement;
        this.idNo = idNo;
        
        
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

  

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getAtmCard() {
        return atmCard;
    }

    public void setAtmCard(String atmCard) {
        this.atmCard = atmCard;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
    
}
