class GalToLits2{
  public static void main(String[] args){

    // Declare double variables
    double gallons, liters;

    // Declare a counter
    int counter;

    // Set counter to 0
    counter = 0;

    // Make a loop for showing conversion gallons to liters
    for(gallons = 1; gallons <= 100; gallons++){

      // Convert gallons on liters
      liters = gallons * 3.7854;

      // Print result on screen
      System.out.println(gallons + " gallons is " + liters + " liters");

      //Increase counter by 1
      counter++;

      // Make an if statement to insert an empty line every 10 gallons
      if(counter == 10){

        System.out.println();

        // Set counter to 0
        counter = 0;
      } // Close the if statement

    } // Close the for loop

  } // Close the public static void main

} // Close the class GalToLits2