
public class W07Practical{

    public static void main (String[] args){

        CurrentAccount janesCurrentAc = new CurrentAccount("987654321");
        SavingsAccount janesSavingsAc = new SavingsAccount("123456789");

        Customer jane = new Customer("StA-2017-xy23", "Jane Brown");
        
        jane.currentAc = janesCurrentAc;
        jane.savingsAc = janesSavingsAc;

        janesCurrentAc.savingsAc = janesSavingsAc;
        
        jane.calculateAge(1996 , 6, 22);
        
        janesCurrentAc.setBalance(2000.00);
        janesSavingsAc.setBalance(3000.00);
        
        janesCurrentAc.setOverdraft(500.00);
        janesSavingsAc.setInterest_rate(1.25);
        janesSavingsAc.addInterest();
        
        janesCurrentAc.deposit(200.00);
        janesSavingsAc.deposit(400.00);
        
        janesCurrentAc.withdraw(2000.00);
        janesSavingsAc.withdraw(3000.00);
        
        janesSavingsAc.transferMoney(400.00);
        janesCurrentAc.moneyReceived();
        
        jane.getTotalMoney();
        
        jane.printDetails();
        janesCurrentAc.printDetails();
        janesSavingsAc.printDetails();
        
        System.out.println();
        
        CurrentAccount jackCurrentAc = new CurrentAccount("12121212");
        SavingsAccount jackSavingsAc = new SavingsAccount("21212121");
        
        Customer jack = new Customer("StA-2017-xy24", "Jack Smith");
        
        jack.currentAc = jackCurrentAc;
        jack.savingsAc = jackSavingsAc;
        
        jackCurrentAc.savingsAc = jackSavingsAc;
        
        jack.calculateAge(1990, 12, 18);
        
        jackCurrentAc.setBalance(1000.00);
        jackSavingsAc.setBalance(1500.00);
        
        // I don't have to set interest rate again because interest rate is static attribute and is has already been settled
        jackCurrentAc.setOverdraft(100.00);
        jackSavingsAc.addInterest();
        
        jackCurrentAc.deposit(350.00);
        jackSavingsAc.deposit(10.00);
        
        // These withdrawals should be unsuccessful
        jackCurrentAc.withdraw(3000.00);
        jackSavingsAc.withdraw(2000.00);
        
        jackSavingsAc.transferMoney(2500.00);
        jackCurrentAc.moneyReceived();
        
        jack.getTotalMoney();
        
        jack.printDetails();
        jackCurrentAc.printDetails();
        jackSavingsAc.printDetails();

    }	
}