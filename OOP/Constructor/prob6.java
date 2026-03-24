package Constructor;
 class  Account{   
    String accountNumber;
    int balance;
    
    Account(String accountNumber, int balance ){
        if (accountNumber == null || accountNumber.isEmpty()) {
            // Print error message if accountNumber is null or empty
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }
        // Validate balance
        if (balance < 0) {
            // Print error message if balance is negative
            System.err.println("Error: Balance cannot be negative.");
            return;
        }
        // Initialize accountNumber with the provided parameter
        this.accountNumber = accountNumber;
        // Initialize balance with the provided parameter
        this.balance = balance;
    }

}
public class prob6{
    public static void main(String Args[]){
        Account a1 = new Account("" , -1);
        System.out.println(a1);
    }
}