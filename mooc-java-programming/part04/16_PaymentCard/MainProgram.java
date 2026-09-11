// Main application class to demonstrate and test the PaymentCard operations.

public class MainProgram {

    //Entry point of the program. Simulates transactions between two payment cards.

    public static void main(String[] args) {
        
        // Initialize cards with starting balances
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        
        // Paul eats heartily (€4.60) and Matt eats affordably (€2.60)
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        
        // Print initial state after first meals
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        
        // Paul reloads €20, Matt eats heartily (€4.60)
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        
        // Print state after second round of actions
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        
        // Paul eats affordably twice (€2.60 x 2 = €5.20)
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        
        // Matt reloads €50
        mattCard.addMoney(50);
        
        // Print final states of both cards
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
    }
}
