class vehicle {
    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)

    // Calculates and prints the total driving range of the vehicle.
    void range() {
        // Local variable to store the calculated range using the object's fields
        int range = fuelcap * mpg;
        System.out.println("Range is " + range + " miles.\n");
    }
}

class addMeth {
    public static void main(String[] args) {
        // Create two separate vehicle instances
        vehicle minivan = new vehicle();
        vehicle sportscar = new vehicle();

        // Set specifications for the minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Set specifications for the sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Display passengers and invoke the range method for the minivan
        System.out.println("Minivan can carry " + minivan.passengers + " passengers.");
        minivan.range();

        // Display passengers and invoke the range method for the sportscar
        System.out.println("Sportscar can carry " + sportscar.passengers + " passenger.");
        sportscar.range();
    }
}
