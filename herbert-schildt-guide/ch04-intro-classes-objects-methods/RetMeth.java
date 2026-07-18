class vehicle {
    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)

    // Calculates and returns the total driving range of the vehicle.
    int range() {
        // Return the result of the calculation back to the caller
        return fuelcap * mpg;
    }
}

class RetMeth {
    public static void main(String[] args) {
        // Create two separate vehicle instances
        vehicle minivan = new vehicle();
        vehicle sportscar = new vehicle();

        // Variables to store the values returned by the range() method
        int range1, range2;

        // Set specifications for the minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Set specifications for the sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Invoke the range() method and capture the returned values
        range1 = minivan.range();
        range2 = sportscar.range();

        // Display the results combining object fields and captured ranges
        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range1 + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers with a range of " + range2 + " miles.");
    }
}
