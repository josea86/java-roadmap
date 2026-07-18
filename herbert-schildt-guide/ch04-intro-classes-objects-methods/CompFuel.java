class vehicle {
    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)

    // Return The maximum distance the vehicle can travel on a full tank.
    int range() {
        return fuelcap * mpg;
    }

    // Computes the amount of fuel required to cover a specific distance.
    double fuelNeeded(int miles) {
        // Explicitly cast 'miles' to double to perform a floating-point division
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        // Create two separate vehicle instances
        vehicle minivan = new vehicle();
        vehicle sportscar = new vehicle();

        double gallons;   // Variable to hold the calculated fuel volume
        int dist = 252;   // The target distance for the trip in miles

        // Set specifications for the minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Set specifications for the sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Calculate and print fuel requirements for the minivan
        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        // Calculate and print fuel requirements for the sportscar
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
