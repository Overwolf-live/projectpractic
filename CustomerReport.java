package banking;

public class CustomerReport {

  public CustomerReport() {}

  public void generateReport() throws Exception {

    // Print report header
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

    // For each customer...
    for ( int cust_idx = 0; cust_idx < Bank.getNumOfCustomers(); cust_idx++ ) {
      Customer customer = Bank.getCustomer(cust_idx);

      // Print the customer's name
      System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

      // For each account for this customer...
      for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
        Account account = customer.getAccount(acct_idx);

        // Print the current balance of the account
        System.out.println("\t" + "current balance is: " + account.getBalance() + "$");;
      }
    }
  }
}