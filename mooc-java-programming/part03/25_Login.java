import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name, password;
        
        System.out.print("Enter username: ");
        name = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        
        if(name.equals("alex") && password.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if(name.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
