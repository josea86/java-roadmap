import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        
        while(true){
            
            String text = scanner.nextLine();
            
            if(text.equals("")){
                break;
            }
            
            String[] parts = text.split(",");
            if(age < Integer.valueOf(parts[1])){
                age = Integer.valueOf(parts[1]);
            }           
        }
        
        System.out.println("Age of the oldest: " + age);
    }
}
