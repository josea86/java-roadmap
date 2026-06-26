class SCops{
	public static void main(String[] args){

		// Set n, d as int and set values
		int n, d;

		n = 10;
		d = 2;

		// The if statement evaluates the first condition and if it's true then evaluates the second condition
		
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);

		// Set d value as 0
		d = 0;

		// This statement with the short-circuit prevents a division by zero

		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
	}
}
