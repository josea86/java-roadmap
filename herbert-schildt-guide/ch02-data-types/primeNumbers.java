class primeNumbers{

	public static void main(String[] args){

		int numbers;

		// Set a for statement to run along numbers from 2 to 100

		for(numbers = 2; numbers <= 100; numbers++){

			// Set a variable isPrime as boolean

			boolean isPrime = true;

			// Set another for statement to run along the divisors of the numbers
			
			for(int count = 2; count < numbers; count++){

				// Set an if statement to change isPrime to false if there's some exact division

				if((numbers % count) == 0) isPrime = false;

			}

			// Print on terminal the prime numbers
			
			if(isPrime) System.out.println(numbers);
		}
	}
}
