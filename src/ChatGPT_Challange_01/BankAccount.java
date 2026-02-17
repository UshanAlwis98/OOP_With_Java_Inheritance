package ChatGPT_Challange_01;

public class BankAccount {

    private String accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount (String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double deposit(double amount) {


        if (amount > 0) {
            return this.balance += amount;
        } else {
            System.out.println("Insufficient funds!");
        }

        return balance;
    }

    public double withdraw(double amount) {

        if(amount > balance || amount < 0) {
            System.out.println("Insufficient funds!");
        }
        else {
             return this.balance -=  amount;
        }

        return balance;
    }

    public void displayAccountDetails() {

        System.out.println("Account Number is: " + this.accountNumber + " ");
        System.out.println("Account Holder Name is: " + this.accountHolderName + " ");
        System.out.println( "Balance " + this.balance + " ");



    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

}
