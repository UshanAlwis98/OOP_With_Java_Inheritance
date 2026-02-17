import ChatGPT_Challange_01.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount("345876", "Ushan Loshitha", 545);

        System.out.println(ba1.getBalance());

        System.out.println(ba1.deposit(500));

        System.out.println(ba1.withdraw(300));

        ba1.displayAccountDetails();
    }
}