
// added argument under run configurations (x)= Arguments

public class ShowArgs {
	
	// string with [] is an array (args)
	// args is an array thats passed to the program from the command line (java ShowArgs strawberries mangoes)
	public static void main(String[] args) {
		
		
		// prints out arg[0] which is the first argument passed to the program (strawberries)
		System.out.println("Here are some " + args[0] + ", they are delicious.");
		
		// prints out arg[1] which is the second argument passed to the program (mangoes)
		System.out.println("Here are some " + args[1] + ", the juice is nicer than the fruit.");
		
		
	}
	

}
