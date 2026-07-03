import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, number1, number2;
        
        System.out.print("First number? ");
        number1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        number2 = Integer.valueOf(scanner.nextLine());
        
        if (number1 < number2) {
        
            for (int i = number1; i <= number2; i++){
                sum = sum + i;
            }
            System.out.println("The sum is: " + sum);
        } else if(number1 > number2){
            for (int i = number2; i <= number1; i++){
                sum = sum + i;
            }
            System.out.println("The sum is: " + sum);
        }  
    }
}
