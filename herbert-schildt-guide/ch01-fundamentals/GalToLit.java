/**
 * Gallons to liters conversion program.
 * Based on examples from "Java: A Beginner's Guide" by Herbert Schildt.
 * 
 * This program demonstrates basic variable declaration using floating-point types,
 * value assignment, and console output concatenation.
 */
 
class GalToLit {
    
    public static void main(String[] args) {

        // Declare variables using 'double' (double-precision floating-point type)
        double gallons; 
        double liters;  

        // Assign an initial value to the variable 'gallons'
        gallons = 10; 

        // Perform the arithmetic conversion
        // Multiplies gallons by the conversion factor (1 US gallon = 3.7854 liters)
        liters = gallons * 3.7854; 

        // Print the result to the console
        // The '+' operator here performs string concatenation, joining variables and text
        System.out.println(gallons + " gallons is " + liters + " liters");
    }
}
