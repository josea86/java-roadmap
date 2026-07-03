import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1, number;
        
        System.out.print("Give a number: ");
        number = Integer.valueOf(scanner.nextLine());
        
        if (number == 0){
            System.out.println ("Factorial: 1");
        } else{
            for(int i = number; i >= 1; i--){
                factorial = factorial * i;
            }
            System.out.println("Factorial " + factorial);
        }
    }
}
