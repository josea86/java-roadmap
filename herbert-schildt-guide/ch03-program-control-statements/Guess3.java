import java.util.Scanner;

class Guess3{
	public static void main(String[] args)
	throws java.io.IOException{

		
		char ch, answer = 'K';

		Scanner scanner = new Scanner(System.in);

		while(true){

			System.out.println("I'm thinking of a letter between A and Z. ");
			System.out.print("Can you guess it: ");

			String input = scanner.nextLine();

			ch = input.charAt(0);

			if (ch == answer){

				System.out.println("** Right **");
				break;

			} else {

				System.out.print("... Sorry, you're ");

				if (ch < answer){

					System.out.println("too low.");
					continue;

				} else{

					System.out.println("too high.");
					continue;
				}
			}
		}		
	}
}
