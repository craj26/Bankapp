import java.util.UUID;

public class SBIAccount implements  BankInterface{

    private String name;
    private String AccountNumber;
    private int balance;
    private String Password;
    private double interest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        Password = password;

        this.interest=8.9;
        this.AccountNumber= String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "Paise hi paisa"+amount;
    }

    @Override
    public String Withdraw(int amount,String enterPassword) {
        if(enterPassword.equals(this.Password)){
            if(balance<amount){
                return "paise nhi he itne";
            }else{
                balance-=amount;
                return "Money deducted";
            }


        }
        return "your password is incorrect";
    }

    @Override
    public double CalculateInterest(int time) {

        return (balance*interest*time)/100.0;
    }
}
