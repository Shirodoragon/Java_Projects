
public class Bools {
	
	
	public static void main(String[] args) {
	
	//assigns b1 and b2 boolean values	
	boolean b1 = true;
	boolean b2 = false;
	
	//prints these to the console
	System.out.println("b1 is : " + b1);
	System.out.println("b2 is : " + b2);
	
	
	//declares b3 value is reverse of b1
	//boolean b3 = !b1;
	//System.out.println("b3 is : " + b3);
	
	//this line of code would not work unless previous line of code was commented out because b3 was a duplicate
	//declares the value of b3 is the result of b1 OR b2 (logical OR ||)
	boolean b3 = b1 || b2;
	System.out.println("b3 is : " + b3);
	
	//parse boolean method was used to input a string value of true to string a and is converted to boolean
	String a = "true";
	boolean b4 = Boolean.parseBoolean(a);
	
	//declares result is equal to b3 AND b4 (logical AND &&)
	boolean result = b3 && b4;
	
	//prints the result of b3 && b4 to the console
	System.out.println("Result of b3 AND b4 : " + result);
	}

}
