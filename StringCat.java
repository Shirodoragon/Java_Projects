
public class StringCat {

	public static void main(String[] args) {
		
		//string class is immutable and cannot be modified
		//creates string object heyWorld1 and assigns it the value Hello
		String heyWorld1 = "Hello";
		
		//creates a new string object that contains the result of the concatination operation (World)
		heyWorld1 = heyWorld1.concat(" World");
		
		//will output hello world
		System.out.println(heyWorld1);
		 
		
		 //stringbuilder class can be modified internally
		
		 //using the stringbuilder class to create a new instance of the string object and give it the initial value Hello
		 StringBuilder heyWorld2 = new StringBuilder("Hello");
		 
		 //use append method to add world to the existing string, not creating a second new object just ammending the original
		 heyWorld2.append(" World");
		 
		 //prints to the console
		 System.out.println(heyWorld2);
		 
	}
}
