class Factor {
    
    // Checks if the first integer is a factor of the second integer.
    boolean isFactor(int a, int b) {
        // Check if the remainder of b divided by a is zero
        if (b % a == 0) return true;
        else return false;
    }
}

class isFact {
    public static void main(String[] args) {
        // Create an instance of the Factor helper class
        Factor x = new Factor();

        // First check: 3 is not a factor of 20 (remainder is 2), so this code block is skipped
        if (x.isFactor(3, 20)) {
            System.out.println("This won't be displayed!");
        }

        // Second check: 2 is a factor of 20 (remainder is 0), so this message prints
        if (x.isFactor(2, 20)) {
            System.out.println("2 is factor");
        }
    }
}
