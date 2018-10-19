public class SavingsAccount{

    // Set up the attributes of savings account
    private String accountNumber;
    private double balance;
    private static double interest_rate;
    // This public attribute allows the money is able transfer to current account
    public double amountTransfer = 0.00;

    // The constructor of savings account
    public SavingsAccount(String numberIn){

        accountNumber = numberIn;
    }

    // Set up the getters and setters
    public String getAccountNumber(){

        return accountNumber;
    }

    public double getBalance(){

        return balance;
    }

    public void setBalance(double balance){

        this.balance = balance;
        System.out.println("Your balance on savings account is £" + balance);
    }

    // The parameter passed into this method would be added onto the current balance of account
    public void deposit(double amountIn){

        balance = balance + amountIn;
        System.out.println("You have deposited £" + amountIn + " to savings account. ");
    }

    // The parameter passed into this method would be substracted from the current balance of account
    public void withdraw(double amountOut){

        if (amountOut > getBalance()){
            
            System.out.println("Sorry. You don't have that amount of money in savings account. Transaction is unsuccessful");
        }
        else {

            balance = balance - amountOut;
            System.out.println("You have withdrawed £" + amountOut + " from the account. Now you have £" + balance + " remaining in savings account");
        }
    }
    public static double getInterest_rate(){

        return interest_rate;
    }

    // Get the interest rate by using the parameter
    public static void setInterest_rate(double rateIn){

        interest_rate = rateIn;
    }

    // Add the interest rate onto the current balance
    public void addInterest(){

        balance = balance + (balance * interest_rate)/100;
        System.out.println("Your interest has beed added onto your savings account. Your balance of savings account is "+ balance);
    }

    // Substract the amount of money from savings account and Current account has an other method to add that amount of money to the balance of current account
    public void transferMoney(double amountTransfer){

        if (amountTransfer > balance){
            System.out.println("Sorry. You don't have that amount of money can transfer to current account. Transaction is unsucessful");
        }
        else {

            balance -= amountTransfer;
            this.amountTransfer = amountTransfer;
            System.out.println("You have transferred £" + amountTransfer + " to current account. Now you have £" + balance + " remaining in savings account");
        }
    }

    // Output all the details of the customer
    public void printDetails(){
        
        System.out.println("Savings account - account number: " + getAccountNumber());
        System.out.println("Savings account - balance: £" + getBalance());
        System.out.println("Savings account - interest rate: " + getInterest_rate() + "%");
    }
}
