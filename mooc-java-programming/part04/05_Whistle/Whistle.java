public class Whistle {
  
    // Private instance variable to store the sound of the whistle
    private String sound;
    
    // Constructs a new Whistle object with a custom sound.
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }
    
    // Prints the whistle's sound to the standard output console.
    public void sound() {
        System.out.println(this.sound);
    }
}
