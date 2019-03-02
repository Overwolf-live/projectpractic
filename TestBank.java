package banking;


public class TestBank {
    public static void main(String[] args) throws OverdraftException, Exception {
        //Bank.addCustomer("Lesha", "Olexish");
        //(Bank.getCustomer(0)).setAccount(new Account(800.0) {});
        
        //Bank.addCustomer("Tim", "Soley");
        //(Bank.getCustomer(1)).setAccount(new Account(600.0) {});
        
        //(new CustomerReport()).generateReport();
        
        CheckingAccount ca1 = new CheckingAccount(900.0, 1000.0);
        
        try {
            ca1.withdraw(2000.0);
        }
        catch (OverdraftException ex) {
            System.out.println(ex.getDeficit());
        }
    }
}