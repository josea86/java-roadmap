import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();
        
        while(true){
            
            System.out.print("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.parseInt(sc.nextLine());
            
            System.out.print("Publication Year: ");
            int publicationYear = Integer.parseInt(sc.nextLine());
            
            books.add(new Book(title, pages, publicationYear));
        }
        
        System.out.print("What information will be printed? ");
        String info = sc.nextLine();
        for(Book n: books){
            if(info.contains("everything")){
                System.out.println(n);
            }else if(info.contains("name")){
                System.out.println(n.getName());
            }
        }
    }
}
