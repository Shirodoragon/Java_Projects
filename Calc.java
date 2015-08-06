
//scanner package needed to be imported in order to be used in the program
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		//declares the 3 variables for the calc of data type double
		double num1;
		double num2;
		double total;
		
		//scanner variable takes what you type and stores it
		Scanner getinput = new Scanner(System.in);
		
		//tells the user to enter number 1
		System.out.println("enter number 1:");
		
		//receives the first number input from keyboard
		String userinput1 = getinput.next();
		
		//tells the user to enter number 2
		System.out.println("enter number 2:");
		
		//receives the second number input from the keyboard
		String userinput2 = getinput.next();
		
		//converts the string object to a double primitive value
		num1 = Double.parseDouble(userinput1);
		num2 = Double.parseDouble(userinput2);
		
		//total with be equal to the addition of the 2 num values
		total = num1 + num2;
		
		//prints the total to the console
		System.out.println("Total Value of 2 numbers :" + total);
		
	}
	
}
