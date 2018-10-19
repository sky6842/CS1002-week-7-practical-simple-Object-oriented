public class CurrentAccount {

    // Set all the attributes of CurrentAccount as private, so other classes are unable to access it.
    private String accountNumber;
    private double balance;
    private double overdraft;
    private double moneyAvailable;

    // Make a new object of SavingsAccount class in CurrentAccount class
    SavingsAccount savingsAc = new SavingsAccount("");

    // The constructor Current account class
    public CurrentAccount (String numberIn){
        
        accountNumber = numberIn;
    }

    public String getAccountNumber(){
        
        return accountNumber;
    }


    public double getBalance(){
        
        return balance;
    }

    public void setBalance(double balance){

        this.balance = balance;
        System.out.println("Your balance on current account is £" + balance);
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
        System.out.println("You have deposited £" + amountIn + " to current account. ");
    }

    // Substract the amount of money by using parameter, is the amount of money is bigger than the money available on current account, then the program would be terminated.
    public void withdraw(double amountOut){
        
        if (amountOut > getMoneyAvailable()){
            
            System.out.println("Sorry. You don't have that amount of money available in current account. Transaction is unsuccessful");      
        }
        else{

            balance = balance - amountOut;
            System.out.println("You have withdrawed £" + amountOut + " from the account. Now you have £" + balance + " remaining in savings account");
        }
    }

    // This method is to add the amount of money to the balance of current account that had been substracted from savings account
    public void moneyReceived(){

        balance += savingsAc.amountTransfer;
        System.out.println("Your current account have received £" + savingsAc.amountTransfer + " from your savings account");
    }


    // Output all the details of current account
    public void printDetails(){
        System.out.println("Current account - account number: " +getAccountNumber());
        System.out.println("Current account - balance: £" + getBalance());
        System.out.println("Current account - overdraft: £" + getOverdraft());
        System.out.println("Total amount of money available on current account: £" + getMoneyAvailable());
    }
}