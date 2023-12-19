package Question_3;

public class Account {
    private int balance;
    private int accountID;

    public Account(int accountID, int initialPayment){
        this.balance = initialPayment;
        this.accountID = accountID;
    }

    public Account(){
        this.balance = 0;
        this.accountID = 0;
    }


    public void depositAmount(int amount){
        this.balance += amount;
        System.out.println("cash deposit successful. your balance is " + this.balance + " for the account with ID " + accountID);

    }

    public void withdrawAmount(int amount){
        

        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println("Cash Withdrawl successful. your account balance is " + this.balance + " for the account with ID " + accountID);

        }else{
            System.out.println("Insufficient Funds");
        }

    }

    public int checkBalance(){
        return this.balance;
    }

    
}
