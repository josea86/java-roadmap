public class YourFirstBankTransfer {

    public static void main(String[] args) {
        
        // Create Matthew's account with an initial balance of 1000.00
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        
        // Create my account with an initial balance of 0.00
        Account myAccount = new Account("My account", 0.00);
        
        // Display initial account states
        System.out.println("Initial state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        
        // Perform the transfer: withdraw 100.00 from Matthew and deposit it into my account
        matthewsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        // Display final account states after the transfer
        System.out.println("Final state");
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
