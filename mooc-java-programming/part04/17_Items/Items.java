import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            items.add(new Item(name));
        }
        
        int index = 0;
        
        for (index = 0; index < items.size(); index++){
            System.out.println(items.get(index));
        }

    }
}
