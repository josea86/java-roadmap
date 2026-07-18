class vehicle {
    int passengers; // Number of passengers the vehicle can carry
    int fuelcap;    // Fuel capacity in gallons
    int mpg;        // Fuel consumption in Miles Per Gallon (MPG)
}

class vehicleDemo {
    public static void main(String[] args) {
        // Create an instance of the vehicle class called miniVan
        vehicle minivan = new vehicle();
        int range; // Variable to store the calculated driving range

        // Assign values to the fields of the miniVan object
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Calculate the maximum range of the minivan
        range = minivan.fuelcap * minivan.mpg;

        // Display the results in the console
        System.out.println("Minivan can carry " + minivan.passengers + 
                           " passengers with a range of " + range + " miles");
    }
}
