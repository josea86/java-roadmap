import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, number;
        
        System.out.print("Last number? ");
        number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
