import java.util.ArrayList;

public class arrays {
    
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        String name = "Benny Jennings";

        names.add(name);

        names.add("Betty Snyder");
        names.add("Frances Spence");
        names.add("Kay McNulty");
        names.add("Marlyn Wescoff");
        names.add("Ruth Lichterman");

        int index = 0;

        // 1st method to show array's elements - while loop
        while(index < names.size()){
            System.out.println(names.get(index));
            index = index + 1;
        }

        System.out.println();

        // 2nd method to show array's elements - standard for loop
        for (index = 0; index < names.size(); index++){
            System.out.println(names.get(index));
        }

        System.out.println();

        // 3rd method to show array's elements - for-each loop

        for (String n: names){
            System.out.println(n);
        }
    }

}
