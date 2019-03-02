package banking;

public class Bank {
    
    private static Customer[] customers;
    private static int numberOfCustomers;
    
    private Bank () {}
    
    static {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }
    
    public static void addCustomer(String f, String l) {
        customers[numberOfCustomers] = new Customer(f, l);
        numberOfCustomers++;
    }
    
    public static int getNumOfCustomers() {
        return numberOfCustomers;
    }
    public static Customer getCustomer(int customer_index) {
        return customers[customer_index];
    }
}