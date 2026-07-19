//  Represents a mathematical power calculation (base raised to an exponent).
class Pwr {
    double b;   // Base value
    int e;      // Exponent value
    double val; // Resulting value of the power operation

    // Constructor that initializes the base and exponent, and computes the result.
    Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1; // Any number raised to the power of 0 is 1
        if (exp == 0) return; // Early exit if exponent is 0
        
        // Loop runs down from 'exp' to 1, multiplying 'val' by 'base' each time
        for (; exp > 0; exp--) {
            val = val * base;
        }
    } 
     
    // Return The target result stored in 'val'.
    double getVal() {
        return val;
    }
}

// Demonstration class to instantiate objects using constructors with parameters.
class DemoPwr {
    public static void main(String[] args) {

        // Instantiate Pwr objects using the defined constructor
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        // Display results using object fields and the getter method
        System.out.println(x.b + " raised to the " + x.e + " power is " + x.getVal());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());
    }
}
