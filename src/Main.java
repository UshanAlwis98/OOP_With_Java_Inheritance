import ChatGPT_Challange_01.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String word = "Welcome to Pearson";

        String[] arr = word.split(" ");

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }


    }
}