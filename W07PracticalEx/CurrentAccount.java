public class CurrentAccount {

    // Set all the attributes of CurrentAccount as private, so other classes are unable to access it.
    private String accountNumber;
    private double balance;
    private double overdraft;
    private double moneyAvailable;

    public String getAccountNumber(){

        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber){
        
        this.accountNumber = accountNumber;
    }

    public double getBalance(){

        return balance;
    }

    public void setBalance(double balance){

        this.balance = balance;
    }

    public double getOverdraft(){

        return overdraft;
    }

    // Set the limit of overdraft
    public void setOverdraft(double overdraft){

        this.overdraft = overdraft;
    }

    // money available in current account is all the money that a user can use on current account
    public double getMoneyAvailable(){

        moneyAvailable = balance + overdraft;
        return moneyAvailable;
    }

    public void deposit(double amountIn){

        balance = balance + amountIn;
    }

    // Substract the amount of money by using parameter, is the amount of money is bigger than the money available on current account, then the program would be terminated.
    public void withdraw(double amountOut){

        if (amountOut > moneyAvailable){

            System.out.println("Sorry. You don't have that amount of money available in current account. Transaction is unsuccessful");      
        }
        else{

            moneyAvailable -= amountOut;
            System.out.println("You have withdrawed £" + amountOut + " from the account. Now you have £" + moneyAvailable + " can use in current Account");
        }
    }
}