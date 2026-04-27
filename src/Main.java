import ChatGPT_Challange_01.BankAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Valid Details
        Student student = new Student();
        student.setName("Ushan");
        student.setAge(18);
        student.setGpa(3.18);
        student.printDetails();


        System.out.println("---------------");

        // Invalid details
        student.setName("");
        student.setAge(15);
        student.setGpa(4.18);
        student.printDetails();


    }
}