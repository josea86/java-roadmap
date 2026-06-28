import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]");
        int points = Integer.valueOf(scan.nextLine());

        String message = "";

        if (points < 0) {
            message = "impossible!";
        } else if (0 <= points & points <= 49 ) {
            message = "failed";
        } else if (50 <= points & points <= 59) {
            message = "1";
        } else if (60 <= points & points <= 69) {
            message = "2";
        } else if (70 <= points & points <= 79) {
            message = "3";
        } else if (80 <= points & points <= 89) {
            message = "4";
        } else if (90 <= points & points <= 100) {
            message = "5";
        } else {
            message = "incredible!";
        }
        
        System.out.println("Grade: " + message);
    }
}
