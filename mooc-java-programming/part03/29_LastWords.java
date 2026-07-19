import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            
            if(text.equals("")){
                break;
            }
            
            int i = pieces.length - 1;
            
            System.out.println(pieces[i]);
        }


    }
}
