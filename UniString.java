
public class UniString {

	public static void main(String[] args) {
		
		//literal character values are wrapped in single ' ' not " "
		//numbers can be literal character values
		
		
	    //assigns the char variable name euroSymbol then assigns it the unicode for € using \u20AC
		char euroSymbol = '\u20AC';
		
		//assigns the rest of the char variables the numbers 188
		char numVal1 = '1';
		char numVal2 = '8';
		char numVal3 = '8';
		
		//prints ours euroSymbol and the numVals to the console
		System.out.print(euroSymbol);
		System.out.print(numVal1);
		System.out.print(numVal2);
		System.out.println(numVal3);
		
		//character literals j, o and e are assigned to letter1 - letter3
		char letter1 = 'j';
		char letter2 = 'o';
		char letter3 = 'e';
		
		//Prints the character literals j, o and e to the console in uppercase
		System.out.print(Character.toUpperCase(letter1));
		System.out.print(Character.toUpperCase(letter2));
		System.out.println(Character.toUpperCase(letter3));
	}
	
}
