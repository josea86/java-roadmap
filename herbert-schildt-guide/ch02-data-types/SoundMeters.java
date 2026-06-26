class SoundMeters{
  public static void main(String[] args){

    // Declare a double variable (with decimals) for the time
    
    double time = 7.2;

    // Declare a variable for the speed of sound in meters per second
    
    double velSound = 343.2;

    // Dynamically declare and initialize the variable dist as the product of time and velSound
    
    double dist = time * velSound;

    // Print the final result to the console.
    
    System.out.println("The distance is " + dist + " meters away.");
  }
}
