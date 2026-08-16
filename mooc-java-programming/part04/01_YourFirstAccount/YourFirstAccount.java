public class YourFirstAccount {

    public static void main(String[] args) {

        // Create a new Account object with an owner name/title and an initial balance of 100.00
        Account myAccount = new Account("My account", 100.00);

        // Print the initial state of the account
        System.out.println("Initial state");
        System.out.println(myAccount);


        // Deposit 20.00 into the account
        myAccount.deposit(20.00);


        // Print the updated state of the account after the deposit
        System.out.println("End state");
        System.out.println(myAccount);
    }
}
