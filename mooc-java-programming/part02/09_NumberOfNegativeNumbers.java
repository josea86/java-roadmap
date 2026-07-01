import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negativeNumbers = 0;
        
        while(true){
            
            System.out.println("Give a number:");
            int count = Integer.valueOf(scanner.nextLine());
            
            if(count < 0){
                negativeNumbers = negativeNumbers + 1;
            } else if(count == 0){
                break;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumbers);
    }
}
