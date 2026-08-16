public class Room {
  
    // Instance variables (fields) to store room properties
  
    private String code;
    private int seats;
    
    // Constructs a new Room instance.

    public Room(String classCode, int numberOfSeats) {
        this.seats = numberOfSeats;
        this.code = classCode;
    }
}
