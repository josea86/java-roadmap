import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int sumNumbers = 0;
        int numberFromUser;
        
        while(true){
            
            System.out.println("Give a number:");
            numberFromUser = Integer.valueOf(scanner.nextLine());
            
            if(numberFromUser == 0){
                break;
            } else{
                number = number + 1;
                sumNumbers = numberFromUser + sumNumbers;
            }
        }
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: " + sumNumbers);
    }
}
