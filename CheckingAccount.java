package banking;

public class CheckingAccount extends Account { 
    
    private double overdraftAmount;
    
    public CheckingAccount(double initBalance) {
        super(initBalance);
    }
    
    public CheckingAccount(double initBalance, double overdraftAmount) {
        super(initBalance);
        this.overdraftAmount = overdraftAmount;
    }
    
     public boolean withdraw(double amt) throws OverdraftException {
        if (amt > overdraftAmount) {
            throw new OverdraftException("Insufficient funds!", amt - overdraftAmount);
        } else {
            balance -= amt;
            return true;
        }
    }
}