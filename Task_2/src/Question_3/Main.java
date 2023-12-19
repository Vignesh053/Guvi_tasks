package Question_3;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(1, 2500);
        Account account2 = new Account();

        System.out.println("your account balance is "+ account1.checkBalance());
        System.out.println( "your account balance is " +  account2.checkBalance());
        System.out.println();

        account1.depositAmount(2500);
        account2.depositAmount(3000);
        System.out.println();


        account1.withdrawAmount(3000);
        account2.withdrawAmount(1500);
        System.out.println();


        System.out.println("your account balance is " + account1.checkBalance());
        System.out.println("your account balance is " + account2.checkBalance());




    }
}
