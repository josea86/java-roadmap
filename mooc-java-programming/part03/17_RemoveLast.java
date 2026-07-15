import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        System.out.println(strings + "\n");
        
        removeLast(strings);
        
        removeLast(strings);
    }
    
    public static void removeLast(ArrayList<String> strings){
        if (strings.size() == 0){
            return;
        }else{
            int i = strings.size() - 1;
            strings.remove(i);
            System.out.println(strings + "\n");
        }
    }
}
