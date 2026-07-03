import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int sum = 0;
        
        while (true){
            
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());
            
            if(numberFromUser == 0){
                break;
            } else if(numberFromUser > 0){
                number = number + 1;
                sum = numberFromUser + sum;
            }
        }
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        }        
        else{
            double average = (double) sum / number;
            System.out.println(average);
        }        
    }
}
