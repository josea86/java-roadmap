import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        int number = 0;
        
        System.out.println("Enter numbers:");
        
        while (number != -1){
            
            number = scanner.nextInt();
            if(number != -1){
                statistics.addNumber(number);
                if(number % 2 == 0){
                    statisticsEven.addNumber(number);
                } else{
                    statisticsOdd.addNumber(number);
                }
            }
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
        
    }
}
