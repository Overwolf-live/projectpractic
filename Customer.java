package banking;

public class Customer {

    private static int baseNumber = 1000;

    private String firstName;
    private String lastName;
    private int custNumber;

    private int numberOfAccounts;
    private int currentAccountNumber = 0;
    private Account[] accounts;

    Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.numberOfAccounts = 1;     
        accounts = new Account[numberOfAccounts];
    }

    public boolean setAccount(Account newAccount) {
        if (currentAccountNumber < numberOfAccounts) {
            accounts[currentAccountNumber] = newAccount;
            currentAccountNumber++;
            return true;
        } else {
            return false;
        }
    }

    public Account getAccount(int accountNumber) throws Exception {
        if (accountNumber < numberOfAccounts) {
            return accounts[accountNumber];
        } else {
            throw new Exception("неправильный номер счета!");
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getNumOfAccounts () {
        return numberOfAccounts;
    }

    @Override
    public String toString() {
        return "\n"+ firstName + " " + lastName + "\n===\n номер клиента: " + custNumber + "\n количество счетов: " + numberOfAccounts;
    }
}