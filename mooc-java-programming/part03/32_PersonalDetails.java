import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, count = 0;
        double average = 0.0;
        String longest = "";
        
        while(true){
            String text = scanner.nextLine();
            
            if(text.equals("")){
                break;
            }
            
            String[] pieces = text.split(",");
            
            sum = sum + Integer.valueOf(pieces[1]);
            count++;
            
            if(longest.length() < pieces[0].length()){
                longest = pieces[0];
            }
        }
        
        System.out.println("Longest name: " + longest);
        average = (double) sum / count;
        System.out.println("Average of the birth years: " + average);

    }
}
