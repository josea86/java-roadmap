class vehicle {
    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)
}

class twoVehicles {
    public static void main(String[] args) {
        // Instantiate two separate vehicle objects
        vehicle minivan = new vehicle();
        vehicle sportscar = new vehicle();
        
        // Variables to store the calculated driving range for each vehicle
        int range1, range2;

        // Assign specifications to the minivan object
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign specifications to the sportscar object
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Calculate the maximum range for both vehicles
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        // Display the results for the minivan
        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + range1 + " miles");
        
        // Display the results for the sportscar
        System.out.println("Sportscar can carry " + sportscar.passengers + " passenger with a range of " + range2 + " miles");
    }
}
