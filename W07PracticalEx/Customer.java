// Import the java time package, so that the function of the package can be used.
import java.time.*;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Customer {

    // Set all the attributes of Customer class as private to improve encapsulation
    private String id;
    private String name;
    private long age;
    private Customer spouse;                      

    CurrentAccount currentAc = new CurrentAccount();

    ArrayList<SavingsAccount> listOfAccounts = new ArrayList<SavingsAccount>();

    // The constructor of Customer class
    public Customer(String idIn, String nameIn){

        id = idIn;
        name = nameIn;
    }

    // the method is identified as public method, so other classes can access the private attributes via getter method.
    public String getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public long getAge(){

        return age;
    }

    // LocalDate is a data type from java time package
    public long calculateAge(int year, int month, int day){

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now(ZoneId.systemDefault());
        return age = ChronoUnit.YEARS.between(dob, now);
    }


    // Get total balance of a customer by adding customers' balances together
    public double getSavingsAccountTotalBalance(){
         
        double totalMoney = 0;
        
        for(int i = 0; i < listOfAccounts.size(); i++){
            
            totalMoney += listOfAccounts.get(i).getBalance();
        }

        return totalMoney;
    }

    public double getTotalBalance(){

        return currentAc.getBalance() + getSavingsAccountTotalBalance();
    }



    public void transferToSpouse(Customer fiance, double transferAmount2){

        fiance.currentAc.deposit(transferAmount2);
        currentAc.withdraw(transferAmount2);
    }

    public void addNumberOfSavingsAccounts(int number){

        for (int i = 1; i <= number; i++){

            listOfAccounts.add(new SavingsAccount());
        }

        //System.out.println(listOfAccounts.size());
    }

    // Print out all the details of customer
    public void printDetails(){

        System.out.println();
        System.out.println("Customer id: " + getId());
        System.out.println("Customer name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Total balance: £" + getTotalBalance());
        
        System.out.println();
        System.out.println("Current account - account number: " + currentAc.getAccountNumber());
        System.out.println("Current account - balance: £" + currentAc.getBalance());
        System.out.println("Current account - overdraft: £" + currentAc.getOverdraft());
        System.out.println("Total amount of money available on current account: £" + currentAc.getMoneyAvailable());
        System.out.println();


        System.out.println("Savings account - account number: " + listOfAccounts.get(0).getAccountNumber());
        System.out.println("Savings account - interest rate: " + listOfAccounts.get(0).getInterest_rate() + "%");

        for (int i = 0; i < listOfAccounts.size(); i++){

            System.out.println("Savings account " + (i + 1) + " - balance: £" + listOfAccounts.get(i).getBalance());
        }

        System.out.println("The overall balance of savings account is £" + getSavingsAccountTotalBalance());

    }
}