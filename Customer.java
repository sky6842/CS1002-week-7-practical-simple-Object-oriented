// Import the java time package, so that the function of the package can be used.
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Customer {

    // Set all the attributes of Customer class as private to improve encapsulation
    private String id;
    private String name;
    private long age;
    Customer spouse;

    CurrentAccount currentAc = new CurrentAccount("");
    SavingsAccount savingsAc = new SavingsAccount("");

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
    public double getTotalMoney(){

        return currentAc.getBalance() + savingsAc.getBalance();
    }

    // Print out all the details of customer
    public void printDetails(){
        
        System.out.println();
        System.out.println("Customer id: " + getId());
        System.out.println("Customer name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Total balance: £" + getTotalMoney());
    }
}