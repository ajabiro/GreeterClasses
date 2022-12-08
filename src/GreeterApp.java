import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
//		this is the way to do it without user input
//		String greeting = "Hi";
//		String name = "Will";
		
//		Greeter g1 = new Greeter(greeting);
//   	 System.out.println(g1.greet(name));
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose a greeting: ");
		String  greeting = scnr.next();
		
		System.out.println("Enter your name: ");
		String name = scnr.next();
 
		
	//1  - create a greeter instance
	Greeter g1 = new Greeter(greeting);
	
	//2 - call the greet method on that instance

	//print out the result
	System.out.println(g1.greet(name));

	
	}

}
