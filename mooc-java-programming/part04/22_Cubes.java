import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cube = 0;
        
        while(true){
            
            String number = scanner.nextLine();
            
            if(number.equals("end")){
                break;
            }
            
            int line2number = Integer.valueOf(number);
            
            cube = line2number * line2number * line2number;
            
            System.out.println(cube);
            
        }

    }
}
