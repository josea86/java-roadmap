// Represents a payment card used to pay for meals and manage a cash balance.

public class PaymentCard {

    // The current balance available on the card.
    private double balance;

    // Constructs a new PaymentCard with an initial balance.

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    //  Deducts the cost of an affordable meal (€2.60) from the balance,

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        }
    }

    // Deducts the cost of a hearty meal (€4.60) from the balance,

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }

    /* Adds a specified amount of money to the card balance.
     * Negative values are ignored, and the maximum allowed balance is capped at €150.
     */
    public void addMoney(double amount) {
        if (this.balance < 150 && ((this.balance + amount) <= 150) && amount > 0) {
            this.balance = this.balance + amount;
        } else if (this.balance < 150 && amount > 0) {
            this.balance = 150;
        }
    }

    // Returns a string representation of the card's current balance.

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
