import java.util.ArrayList;
public class W07Practical{

    public static void main (String[] args){
        
        CurrentAccount janesCurrentAc = new CurrentAccount();
        CurrentAccount jackCurrentAc = new CurrentAccount();
        
        ArrayList<SavingsAccount> janesSavingsAc = new ArrayList<SavingsAccount>();
        ArrayList<SavingsAccount> jackSavingsAc = new ArrayList<SavingsAccount>();

        Customer jane = new Customer("StA-2017-xy23", "Jane Brown");
        Customer jack = new Customer("StA-2017-xy24", "Jack Smith");
        
        jane.currentAc = janesCurrentAc;
        jane.listOfAccounts = janesSavingsAc;
        
        jack.currentAc = jackCurrentAc;
        jack.listOfAccounts = jackSavingsAc;
        
        jane.addNumberOfSavingsAccounts(3);
        jack.addNumberOfSavingsAccounts(1);

        janesSavingsAc.get(0).currentAc = janesCurrentAc;
        jackSavingsAc.get(0).currentAc = jackCurrentAc;
        
        janesCurrentAc.setAccountNumber("987654321");
        jackCurrentAc.setAccountNumber("21212121");
        
        janesSavingsAc.get(0).setAccountNumber("123456789");
        jackSavingsAc.get(0).setAccountNumber("12121212");
        
        jane.calculateAge(1996 , 6, 22);
        jack.calculateAge(1990, 12, 18);
        
        jackCurrentAc.setBalance(1000.00);
        jackSavingsAc.get(0).setBalance(1500.00);
        
        janesCurrentAc.setBalance(2000.00);
        janesSavingsAc.get(0).setBalance(3000.00);
        janesSavingsAc.get(1).setBalance(1000.00);
        janesSavingsAc.get(2).setBalance(100.00);
        
        janesCurrentAc.setOverdraft(500.00);
        janesSavingsAc.get(0).setInterest_rate(1.25);
        janesSavingsAc.get(0).addInterest();
        janesSavingsAc.get(1).addInterest();
        janesSavingsAc.get(2).addInterest();
        
        // I don't have to set interest rate again because interest rate is static attribute and is has already been settled
        jackCurrentAc.setOverdraft(100.00);
        jackSavingsAc.get(0).addInterest();
        
        
        janesCurrentAc.deposit(200.00);
        janesSavingsAc.get(0).deposit(400.00);
        janesSavingsAc.get(1).deposit(500.00);
        janesSavingsAc.get(2).deposit(100.00);
        
        jackCurrentAc.deposit(350.00);
        jackSavingsAc.get(0).deposit(10.00);
        
        //These withdrawals should be unsuccessful
        janesCurrentAc.withdraw(2000.00);
        janesSavingsAc.get(0).withdraw(3000.00);
        
        jackCurrentAc.withdraw(3000.00);
        jackSavingsAc.get(0).withdraw(5000.00);
        
        janesSavingsAc.get(0).transferMoney(400.00);
        
        //jackSavingsAc.transferMoney(200.00);
        
        //jack.transferToSpouse(jane, 1);
        jane.transferToSpouse(jack, 2);
        
        jane.getSavingsAccountTotalBalance();
        jane.getTotalBalance();
        
        jane.printDetails();
        jack.printDetails();

    }	
}