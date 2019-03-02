package banking;

public abstract class Account {

    protected double balance;
    
    protected Account(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amt){
        balance = balance + amt;
    }
}