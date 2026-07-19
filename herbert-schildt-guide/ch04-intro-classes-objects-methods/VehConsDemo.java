class vehicle {

    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)

    vehicle(int p, int f, int m){

        passengers = p;
        fuelcap = f;
        mpg = m;

    }

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

class VehConsDemo {
    public static void main(String[] args) {

        // Create two separate vehicle instances
        vehicle minivan = new vehicle(7, 16, 21);
        vehicle sportscar = new vehicle(2, 14, 12);

        double gallons;   // Variable to hold the calculated fuel volume
        int dist = 252;   // The target distance for the trip in miles

        // Calculate and print fuel requirements for the minivan
        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        // Calculate and print fuel requirements for the sportscar
        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");

    }
}
