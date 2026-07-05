import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give the first number: ");
        int beginning = Integer.valueOf(scanner.nextLine());
        System.out.print("Give the second number: ");
        int end = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(beginning, end);

    }
    
    public static void divisibleByThreeInRange(int beginning, int end){
    
        int i = 0;
        
        for (i = beginning; i <= end; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
