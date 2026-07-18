class ChkNum {

    // Return true if the number is even, false otherwise.
    boolean isEven(int x) {
        // Use the modulus operator to check if the remainder of x divided by 2 is zero
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        // Create an instance of the ChkNum helper class
        ChkNum e = new ChkNum();

        // Loop downwards from 10 to 1
        for (int i = 10; i > 0; i--) {
            // Pass the current loop index to the isEven method
            if (e.isEven(i)) {
                System.out.println(i + " is even.");
            }
        }
    }
}
