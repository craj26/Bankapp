public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String Withdraw(int amount,String enterPassword);
    double CalculateInterest(int time);


}
