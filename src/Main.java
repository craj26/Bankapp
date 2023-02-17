import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME AND PASSWORD");
        String name=sc.nextLine();
        String Password=sc.nextLine();
        int balance =sc.nextInt();

        SBIAccount arpitAcount=new SBIAccount(name,balance,Password);
        System.out.println("your account has been created with account number"+arpitAcount.getAccountNumber());

        //getbalance
        System.out.println("your current balance is :"+arpitAcount.getBalance());
        //update balace
        System.out.println("enter amount to depsot");
        int depsotmoney=sc.nextInt();
        System.out.println(arpitAcount.depositMoney(depsotmoney));
        System.out.println("new balace is"+arpitAcount.getBalance());

        //withdraw'
        System.out.println("enter money want to withdraw");
        int amount=sc.nextInt();
        System.out.println("enter password");
        String enterpassword=sc.next();
        System.out.println(arpitAcount.Withdraw(amount,enterpassword));
        System.out.println("your balace is "+arpitAcount.getBalance());

        //
        System.out.println("intereset on current balace for 4 years"+arpitAcount.getBalance()+"is"+arpitAcount.CalculateInterest(4));










        ///System.out.println("Hello world!");
    }
}